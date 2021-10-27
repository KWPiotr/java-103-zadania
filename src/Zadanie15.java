import java.util.Arrays;
import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        System.out.println("Podaj 10 liczb: ");
        Scanner strUser = new Scanner(System.in);
        int[] userIint = new int[10];

        for (int i = 0; i < 10; i++) {
            userIint[i] = strUser.nextInt();
        }

        szukaj(userIint);
        strUser.close();
    }

    static void szukaj(int[] inArray) {
        int counter;
        Arrays.sort(inArray);
//        for (int i = 0; i < inArray.length; i++) {
//            System.out.println(inArray[i]);
//        }
//        System.out.println("-----------------------------");
        for (int i = 0; i < inArray.length; i++) {
            counter = 0;
            for (int j = i; j < inArray.length; j++) {
                if (inArray[i] == inArray[j]) {
                    ++counter;

                    if (counter >= 2) {
                        ++i;
                        continue;
                    }
                }
            }
            if (counter >= 2) {
                System.out.println(inArray[i]);
            }
        }
    }
}
