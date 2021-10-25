import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        System.out.print("Podaj tekst: ");
        Scanner strUser = new Scanner(System.in);
        String userDate = strUser.nextLine();
        int counterSpace = 0;

        for (int i = 0; i < userDate.length(); i++) {
            if (userDate.charAt(i) == ' ') {
                ++counterSpace;
            }
        }
        System.out.println("W podanym tekście występuje: " + counterSpace + " spacji, czyli: " + counterSpace * 100 / userDate.length() + " % calego tekstu");

        strUser.close();
    }
}
