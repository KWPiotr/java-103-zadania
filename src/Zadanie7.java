import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę całkowita: ");
        Scanner strUser = new Scanner(System.in);
        int userNumber = strUser.nextInt();
        int tmp = 1;
        int[] myArray = new int[userNumber];
        myArray[0] = 1;
        for (int i = 1; i < userNumber; i++) {
            myArray[i] = tmp+myArray[i-1] ;
            tmp = myArray[i-1];
        }

        for (int i = 0; i < userNumber; i++) {
            System.out.println(myArray[i]);
        }
    }
}
