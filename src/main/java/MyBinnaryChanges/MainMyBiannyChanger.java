package MyBinnaryChanges;

import java.util.Scanner;

public class MainMyBiannyChanger {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę dziesiętną: ");
        Scanner strUserDec = new Scanner(System.in);
        long usrDecNumber = strUserDec.nextInt();

        MyBinnaryChanger binNumber = new MyBinnaryChanger(usrDecNumber);
        binNumber.changesNumberOnBinnary(usrDecNumber);
        System.out.print(binNumber);


        System.out.print("\nPodaj liczbę binarną: ");
        Scanner strUserBin = new Scanner(System.in);
        long usrBimNumber = strUserBin.nextLong();

        MyBinnaryChanger decinalNumber = new MyBinnaryChanger(usrBimNumber);
        decinalNumber.changesNumberOnDec(usrBimNumber);
        System.out.print(decinalNumber);

    }
}
