import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {

        //Niedokończone - źle działa !!!
        System.out.print("Podaj liczbę dodatnią: ");
        Scanner strUser = new Scanner(System.in);
        int numberUser = strUser.nextInt();
        char star = '*';
        char space = ' ';
        int tmpSpace = numberUser;

        for (int k = 4; k > 0; k--) {
            for (int i = 0; i < numberUser; i++) {
                System.out.print(String.format("%c", star));
                for (int j = 0; j < tmpSpace; j++) {
                    System.out.print(String.format("%c", space));
                }
                System.out.print(String.format("%c", star));
            }
            System.out.println();
            --tmpSpace;
        }
    }
}
