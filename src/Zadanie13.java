import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        System.out.println("Podaj napis i wciśnij ENTER: ");

        Scanner strUser = new Scanner(System.in);
        String userString = strUser.nextLine();

        String[] splitString = userString.split(" ");
        String[] newString = new String[(splitString.length * 2)];

        for (int i = 0, j = 0; i < splitString.length; i++, j = j + 2) {
            newString[j] = splitString[i];
            newString[j + 1] = splitString[i];
        }

        for (int i = 0; i < newString.length; i++) {
            System.out.print(newString[i]);
            System.out.print(" ");
        }
    }
}
