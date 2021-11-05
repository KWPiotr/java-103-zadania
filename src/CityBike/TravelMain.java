package CityBike;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Path;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TravelMain {


    public static void main(String[] args) throws IOException {

        Path pathFromFile = Path.of("historia_przejazdow_2020-01.csv");
        Scanner scanner = new Scanner(pathFromFile);

        ArrayList<Travel> travels = new ArrayList<>();

        //System.out.println(scanner.nextLine());
        String cleanFirstLine = scanner.nextLine();

        while (scanner.hasNext()) {
            String travelLine = scanner.nextLine();
            Travel travel = processString(travelLine);

            travels.add(travel);
        }

        //System.out.println(travels);
        maxTravelTime(travels);
        minTravelTime(travels);
        scalesTravelTime(travels);

        maxValueStartStation(travels);


        //Testowanie operowania na dacie i czasie
        LocalTime timeUsing1 = travels.get(39925).getTravelStart().toLocalTime();
        LocalTime timeUsing2 = travels.get(39925).getTravelEnd().toLocalTime();

        Duration sekundUztkowania = Duration.between(timeUsing1, timeUsing2);
        // System.out.println("\nRower był użytkowany przez: " + (double)(sekundUztkowania.getSeconds()/3600) + " godzin " + (sekundUztkowania.getSeconds()/60) + " minut i " + (double)(sekundUztkowania.getSeconds()) + " sekund");

        LocalDate dateUsing1 = travels.get(0).getTravelStart().toLocalDate();
        LocalDate dateUsing2 = travels.get(0).getTravelEnd().toLocalDate();

        Period czasUzytkowania = Period.between(dateUsing1, dateUsing2);
        //System.out.println("Rower był użytkowany przez: " + (czasUzytkowania.getYears()) + " lat " + (czasUzytkowania.getMonths()) + " miesięcy i " + (czasUzytkowania.getDays()) + " dni");

    }

    //splitowanie - rozbicie stringa po znaku ,
    private static Travel processString(String travelString) {
        String[] split = travelString.split(",");
        String id = split[0];
        String bikeNumber = split[1];
        String startDate = split[3];
        String endDate = split[4];
        String startStation = split[5];
        String endStation = split[6];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime startDateLDT = LocalDateTime.parse(startDate, formatter);
        LocalDateTime endDateLDT = LocalDateTime.parse(endDate, formatter);

        Travel returnTravel = new Travel(id, bikeNumber, startDateLDT, endDateLDT, startStation, endStation);

        return returnTravel;
    }


    //najdłuższy czas przejazdu
    public static void maxTravelTime(ArrayList<Travel> inTravels) {
        int maxT = 0;

        for (int i = 0; i < inTravels.size(); i++) {

            LocalTime timeUsing1 = inTravels.get(i).getTravelStart().toLocalTime();
            LocalTime timeUsing2 = inTravels.get(i).getTravelEnd().toLocalTime();

            Duration sekundUztkowania = Duration.between(timeUsing1, timeUsing2);

            // System.out.println("Rower był użytkowany przez: " + (czasUzytkowania.getYears()) + " lat " + (czasUzytkowania.getMonths()) + " miesięcy i " + (czasUzytkowania.getDays()) + " dni");

            if (maxT < Math.max(1, (int) sekundUztkowania.getSeconds())) {
                maxT = Math.max(1, (int) sekundUztkowania.getSeconds());
            }
        }
        System.out.printf("Najdłuższy czas użytkowania, to: %.2f godzin, czyli: %d minut tj. %d sekund\n", (double) maxT / 3600, maxT / 60, maxT);
    }


    //Najkrótszy czas przejazdu
    public static void minTravelTime(ArrayList<Travel> inTravels) {
        int min = 0;
        for (int i = 0; i < inTravels.size(); i++) {

            LocalTime timeUsing1 = inTravels.get(i).getTravelStart().toLocalTime();
            LocalTime timeUsing2 = inTravels.get(i).getTravelEnd().toLocalTime();

            Duration sekundUztkowania = Duration.between(timeUsing1, timeUsing2);

            min = Math.min(1, (int) sekundUztkowania.getSeconds());
            if (min > Math.abs(min)) {
                min = Math.abs(min);
            }
        }
        System.out.printf("Najkrótszy czas użytkowania, to: %.2f godzin, czyli: %d minut tj. %d sekund\n", (double) min / 3600, min / 60, min);
    }


    //Sredni czas przejazdu
    public static void scalesTravelTime(ArrayList<Travel> inTravels) {
        int suma = 0;
        double srednia;
        for (int i = 0; i < inTravels.size(); i++) {

            LocalTime timeUsing1 = inTravels.get(i).getTravelStart().toLocalTime();
            LocalTime timeUsing2 = inTravels.get(i).getTravelEnd().toLocalTime();

            Duration sekundUztkowania = Duration.between(timeUsing1, timeUsing2);

            suma += sekundUztkowania.getSeconds();
        }
        srednia = (double) suma / inTravels.size();
        System.out.println("Lączny czas wypożyczeń rowerów miejskich wyniósł: " + suma / 3600 + " godzin");
        System.out.println("Rowery wypożyczono: " + inTravels.size() + " razy.");
        System.out.printf("Sredni czas użytkowania, to: %.2f minuty\n", srednia / 60);
    }

    //Najbardziej oblegana stacja rowerowa
    public static void maxValueStartStation(ArrayList<Travel> inTravels) {

        ArrayList<String> listRoad = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<String, Integer>();
        int maxUseStreet = 0;
        String useStation = "Nie było wypożyczeń";

        //załadowanie do array listy wszystkich stacji startowych
        for (int i = 0; i < inTravels.size(); i++) {
            listRoad.add(inTravels.get(i).getStartStation());
        }

        for (String string : listRoad) {
            //zliczanie wystąpień danej stacji w stringu
            if (mp.keySet().contains(string)) {
                mp.put(string, mp.get(string) + 1);

            } else {
                mp.put(string, 1);
            }
            //maxUseStreet = mp.get(string); //szukanie największej liczby wypożyczeń z pominięciem "Poza stacją" (pewnie serwis)
            if (maxUseStreet < mp.get(string) && !string.substring(0).equals("Poza stacją")) {
                maxUseStreet = mp.get(string);
                // maxUseStreet = 552;
            }
            // szukanie po indexie największej liczby wypożyczeń w celu odnalezienia właściwej ulicy - generuje błąd ponieważ część wpisów w CSV jest Dwozec Główny, a część "Dworzec Główny
            if (mp.get(string) == maxUseStreet) {
                useStation = string.substring(0);
                //System.out.println(string.substring(0));
            }
        }
        System.out.println("Najbardziej oblegana stacja wypozyczeń, to: " + useStation + "- wypożyczono na niej rower: " + maxUseStreet + " razy.");

        //System.out.println("Ulica = ilość ---> " + mp);
    }
}
