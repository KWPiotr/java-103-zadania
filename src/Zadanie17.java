
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");

        System.out.println("Podaj datę: ");
        Scanner strUser = new Scanner(System.in);
        String userData = strUser.nextLine();

        LocalDate localDate = LocalDate.parse(userData, formatter);
        LocalDate localDateNow = LocalDate.now();

        System.out.println(localDate);
        System.out.println("Dzisiejsza data: " + localDateNow);

        int yearsNow = localDateNow.getYear();
        int monthNow = localDateNow.getMonthValue();
        int dayNow = localDateNow.getDayOfYear();

        int yearsLast = localDate.getYear();
        int monthLast = localDate.getMonthValue();
        int dayLast = localDate.getDayOfYear();

        System.out.println("Różnica między tymi datami wynosi: ");
        System.out.println(dayLast - dayNow + " dni");
        System.out.println(monthLast - monthNow + " miesięcy");
        System.out.println(yearsLast - yearsNow + " lat");
    }
}
