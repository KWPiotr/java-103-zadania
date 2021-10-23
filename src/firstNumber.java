import java.util.Scanner;

public class firstNumber {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę całkowitą większą od 1: ");
        Scanner strUser = new Scanner(System.in);
        int userNumber = strUser.nextInt();

        System.out.println("Liczbami pierwszymi od 1 do " + userNumber + " są: ");
        for (int i = 2; i < userNumber; i++) {
            if (isFirstNumber(i)) {
                System.out.println(i);
            } else {
                // System.out.println("Liczba nie jest pierwszą" + i);
            }
        }
    }

    static boolean isFirstNumber(int inNumber) {
        for (int i = 2; i < inNumber; i++) {
            if (inNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
