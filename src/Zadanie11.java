import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        System.out.println("Wprowadzaj napisy (słowo \"Starczy\" - kończy proces wprowadzania): ");
        Scanner strUser = new Scanner(System.in);
        ArrayList<String> userData = new ArrayList<>();

        int index = 0;
        int counterChar;
        int counterTmp = 0;

        do {
            userData.add(strUser.nextLine());

            if (userData.get(index).isEmpty()) {
                System.out.println("!!! Nie podano żadnego łancucha znakowego !!!");
            }

            if (userData.get(index).equals("Starczy")) {
                break;
            } else {
                counterChar = userData.get(index).length();
                System.out.println("Twój napis: " + userData.get(index) + " -> składa się z: " + counterChar + " znaków");

                if (counterChar > counterTmp) {
                    counterTmp = counterChar;
                }
                ++index;
            }
        } while (!userData.get(index - 1).equals("Starczy"));  //podwójnie zabezpieczone

        System.out.println("Najdłuższy ciąg znaków wynosi: " + counterTmp);

        for (int i = 0; i < userData.size(); i++) {
            if (userData.get(i).length() == counterTmp && !userData.get(i).equals("Starczy")) {
                System.out.println("Najdłuższym łańcuchem znakowym okazał się: " + userData.get(i));
            }
        }
    }
}
