package MyBinnaryChanges;

import java.util.ArrayList;

public class MyBinnaryChanger {
    private long myNumber;

    public MyBinnaryChanger(long myNumber) {
        this.myNumber = myNumber;
    }

    private void setMyNumber(long myNumber) {
        this.myNumber = myNumber;
    }

    public void changesNumberOnBinnary(long inMyNumber) {
        String result = "";
        while(inMyNumber > 0) {
            if(inMyNumber%2 == 0) {
                inMyNumber = inMyNumber/2;
                result += "0";
            } else {
                inMyNumber = inMyNumber/2;
                result += "1";
            }
        }
        String binnyStr = new StringBuilder().append(result).reverse().toString();  //odwrócenie stringa
        setMyNumber(Long.parseLong(binnyStr));  //sparsowanie stringa na longa i uruchomienie prywatnej metody do ustawienia pola klasy
    }

    public void changesNumberOnDec(long inMyNumber) {
        long tmp, sum = 0;
        int i=0;
        while(inMyNumber != 0) {
            tmp = inMyNumber % 10;
            inMyNumber = inMyNumber / 10;
          //  System.out.println("TMP: " + tmp);
          //  System.out.println("inMyNumber" + inMyNumber);
            sum += tmp * (Math.pow(2, i));
            ++i;
        }
        setMyNumber(sum);
    }

    public String toString() {
       return String.format("Liczba po dokonaniu konwersji: %d", myNumber);
    }

}
