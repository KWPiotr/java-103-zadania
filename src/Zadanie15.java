import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        System.out.println("Podaj 10 liczb: ");
        Scanner strUser = new Scanner(System.in);
        int[] userIint = new int[10];
        int tmp;
        for (int i = 0; i < 10; i++) {
            userIint[i] = strUser.nextInt();
        }
        for (int i = 0; i < userIint.length; i++) {
            tmp = szukaj(userIint, userIint[i]);
            if(tmp!=0) {
                System.out.println(tmp);
            }
        }
        strUser.close();
    }

    static int szukaj(int[] inArray, int inputNumber) {
        int counter = 0;
        for (int i = 0; i < inArray.length; i++) {
            if(inArray[i] == inputNumber) {
                ++counter;
            }
        }

        if(counter >= 2) {
            return inputNumber;
        }
        return 0;
    }
}
