import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.print("Podaj swój wzrost: ");
        Scanner strUserHeight = new Scanner(System.in);
        int height = strUserHeight.nextInt();

        float tmp = (float)height/100;
        //System.out.println("Twój wzrost, to: " + tmp);

        System.out.print("Podaj swoją wagę: ");
        Scanner strUserWeight = new Scanner(System.in);
        float weight = strUserWeight.nextFloat();

        calculateBMI(tmp, weight);
    }

    static void calculateBMI(float tmp, float inWeight) {
        float myBMI = inWeight / tmp;
        System.out.println("Twoje BMI wynosi: " + myBMI);
        if(myBMI >= 18.5 && myBMI <= 24.9) {
            System.out.println("BMI optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }
    }
}
