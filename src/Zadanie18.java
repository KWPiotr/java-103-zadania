import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie18 {
    public static void main(String[] args) {
        //kichacz
        System.out.print("Wprowadź napis, a sprawdzę czy czasami nie kichnąłeś: ");

        Scanner strUser = new Scanner(System.in);
        String stringUser = strUser.nextLine();

        Pattern pattern = Pattern.compile("a+ psik");
        Matcher matcher = pattern.matcher(stringUser);

        if (matcher.find()) {
            System.out.println("Klient kichnął");
        } else {
            System.out.println("Klient nie kichnął");
        }
        strUser.close();
    }
}
