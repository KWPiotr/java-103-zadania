import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.print("Podaj a: ");
        Scanner strUserA = new Scanner(System.in);
        int numberA = strUserA.nextInt();

        System.out.print("Podaj b: ");
        Scanner strUserB = new Scanner(System.in);
        int numberB = strUserB.nextInt();

        System.out.print("Podaj c: ");
        Scanner strUserC = new Scanner(System.in);
        int numberC = strUserC.nextInt();

        int retrunMydelta;
        retrunMydelta = delta(numberA, numberB, numberC);

        if(retrunMydelta != 0) {
            System.out.println("");
        } else {
            System.out.println("!!! Delata jest ujemna !!!");
        }
    }

    static int delta(int a, int b, int c) {

        int myDelta = (int) (Math.pow(b, 2) - (4 * (a * c)));
        System.out.println("\nDelta z podwanych wartości wynosi: " + myDelta);

        if(myDelta <= 0) {
            return 0;
        } else {
            double pierwiastek = Math.sqrt(myDelta);
            System.out.println("Pierwiastek z delty wynosi: " + pierwiastek);
            double x1, x2 ;

            x1 = (-b - pierwiastek) / (2 * a);
            x2 = (-b + pierwiastek) / (2 * a);

            System.out.println("X1 wynosi: " + x1);
            System.out.println("X2 wynosi: " + x2);

            if(a > 0) {
                System.out.println("Parabola ramionami w górę");
            } else {
                System.out.println("Parabola ramionami w dół");
            }
        }
        return myDelta;
    }
}
