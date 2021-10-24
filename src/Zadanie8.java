import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        //kalkulator

        System.out.print("Podaj liczbę: ");
        Scanner strUser0 = new Scanner(System.in);
        float getNumber0 = strUser0.nextFloat();

        System.out.print("Podaj znak: ");
        Scanner strUser1 = new Scanner(System.in);
        String getChar1 = strUser1.nextLine();
        char znak = getChar1.charAt(0);

        //System.out.println("Podany znak: " + znak);

        System.out.print("Podaj liczbę: ");
        Scanner strUser2 = new Scanner(System.in);
        float getNumber2 = strUser2.nextFloat();

        System.out.println("Wynik obliczeń wynosi: " + make(getNumber0, znak, getNumber2));
    }

    static float make(float inGetNumber0, char inZnak, float inGetNumber2) {
        float wynik = 0;
        if (inZnak == '+') {
            wynik = inGetNumber0 + inGetNumber2;
        }
        if (inZnak == '-') {
            if (inGetNumber0 < inGetNumber2) {
                System.out.println("!!! Odejmujesz od mniejsze liczby większą !!!");
                wynik = inGetNumber0 - inGetNumber2;
                return wynik;
            } else {
                wynik = inGetNumber0 - inGetNumber2;
            }
        }
        if (inZnak == '*') {
            if (inGetNumber0 == 0 || inGetNumber2 == 0) {
                System.out.println("UWAGA - jedna z wartości jest zerem !!!");
            }
            wynik = inGetNumber0 * inGetNumber2;
        }
        if (inZnak == '/') {
            if (inGetNumber0 == 0 || inGetNumber2 == 0) {
                System.out.println("Próbujesz dzielić przez ZERO !!!");
                return 0;
            } else {
                wynik = inGetNumber0 / inGetNumber2;
            }
        } else {
            System.out.println("Błędny znak");
        }
        return wynik;
    }
}
