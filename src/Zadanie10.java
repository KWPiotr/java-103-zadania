import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        System.out.print("Podaj linczbę dodatnią: ");
        Scanner strUser = new Scanner(System.in);

        int userNumber = strUser.nextInt();
        int tmpNumber;
        int mySum = 0;

        if (userNumber < 1) {
            System.out.println("Podana wartość jest zmniejsza od 1");
        } else {
            while (userNumber > 0) {
                tmpNumber = userNumber % 10;
                userNumber = userNumber / 10;
                System.out.println("Liczba po obcięciu: " + userNumber + " pozostało: " + tmpNumber);
                mySum += tmpNumber;
            }
            System.out.println("Wynik sumowania składowych liczby wynosi: " + mySum);
        }
    }
}
