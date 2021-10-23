import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.print("Podaj średnicę okręgu: ");
        Scanner strUser = new Scanner(System.in);
        double srednica = strUser.nextDouble();

        System.out.println("Obwód okręgu obliczony z przyjętą warością PI = 3.14 wynosi: " + srednica*3.14);
        System.out.println("Obwód okręgu obliczony za pomocą wbudowanej funkcji Math wynosi: "+ srednica*Math.PI);
    }
}
