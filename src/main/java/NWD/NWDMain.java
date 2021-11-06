package NWD;

import java.util.Scanner;

public class NWDMain {
    public static void main(String[] args) {
        System.out.print("Podaj pierwszś liczbę: ");

        Scanner strUser1 = new Scanner(System.in);
        int userNumber1 = strUser1.nextInt();

        System.out.print("Podaj drugą liczbę: ");

        Scanner strUser2 = new Scanner(System.in);
        int userNumber2 = strUser2.nextInt();

        while (userNumber1 != userNumber2) {
            if (userNumber1 > userNumber2) {
                userNumber1 -= userNumber2;
            } else {
                userNumber2 -= userNumber1;
            }
        }
        System.out.println("Największy współny dzielnik, to: " + userNumber1);
    }
}
