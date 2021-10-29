import java.util.Random;
import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {

        Random varNumber = new Random();
        int generateNumber = varNumber.nextInt(100);
        System.out.println("Wygenerowana liczna, to: " + generateNumber);

        System.out.print("Podaj liczbę: ");
        Scanner strUser = new Scanner(System.in);
        int myNumber;

        while (true) {
            myNumber = strUser.nextInt();

            if (myNumber > generateNumber) {
                System.out.println("Za dużo");
                continue;
            } else if (myNumber < generateNumber) {
                System.out.println("Za mało");
                continue;
            } else if (myNumber == generateNumber) {
                System.out.println("Bingo");
                break;
            }
        }
        strUser.close();
    }
}
