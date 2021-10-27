import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        System.out.println("Podaj 10 liczb całkowitych: ");
        int[] userDate = new int[10];

        insertingDate(userDate);
        System.out.println("Największy podciąg rosnący składa się z " + searchSubStream(userDate) + " składowych.");
    }

    static void insertingDate(int[] inUserDate) {
        Scanner strUser = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            inUserDate[i] = strUser.nextInt();
        }
        strUser.close();
    }

    static int searchSubStream(int[] inUserDate) {
        int counter = 0;
        int counterTmp = 0;

        for (int i = 1; i < inUserDate.length; i++) {
            if (inUserDate[i-1] < inUserDate[i]) {
                ++counter;
            } else {
                counter = 0;
            }
            if (counter > counterTmp) {
                counterTmp = counter;
            }
        }
        return counterTmp + 1;
    }
}
