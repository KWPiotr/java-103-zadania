import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {

        System.out.print("Podaj linczbę N dla szeregu: ");
        Scanner strUser = new Scanner(System.in);
        int userNumber = strUser.nextInt();
        double harmonySum = 1;

        for (int i = 2; i <= userNumber ; i++) {
            harmonySum += (double)1/i;
            System.out.println((double)1/i);
        }
        System.out.println(String.format("<< Szereg harmoniczny wynosi: %f >>",  harmonySum));
    }
}
