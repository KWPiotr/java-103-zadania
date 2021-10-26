import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        System.out.print("Podaj pierwszą literę alfaberu łacińskiego: ");
        Scanner userStr1 = new Scanner(System.in);
        String myChar1 = userStr1.nextLine();

        System.out.print("Podaj drugąą literę alfaberu łacińskiego: ");
        Scanner userStr2 = new Scanner(System.in);
        String myChar2 = userStr2.nextLine();

        int myChar1_TMP = (int) myChar1.charAt(0);
        int myChar2_TMP = (int) myChar2.charAt(0);

        int counter = 0;

        for (int i = myChar1_TMP; i < myChar2_TMP; i++) {
            ++counter;
        }
        System.out.println("Między tymi dwoma znakami w alfabeciej jest: " + (counter - 1) + " znaków");
    }
}
