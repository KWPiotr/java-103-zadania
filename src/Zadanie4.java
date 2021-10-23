import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę dodatnią: ");
        Scanner strUser = new Scanner(System.in);
        int userNumber = strUser.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
