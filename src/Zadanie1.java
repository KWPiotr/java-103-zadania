import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.print("Podaj średnicę okręgu: ");
        Scanner strUser = new Scanner(System.in);
        double srednica = strUser.nextDouble();

        System.out.println("Obwód okręgu obliczony z przyjętą warością PI = 3.14 wynosi: " + manualneObliczenie(srednica));
        System.out.println("Obwód okręgu obliczony za pomocą wbudowanej funkcji Math wynosi: "+ wykorzystanieMath(srednica));
    }

    static double manualneObliczenie(double in)
    {
        return in * 3.14;
    }

    static double wykorzystanieMath(double in)
    {
        return in * Math.PI;
    }
}
