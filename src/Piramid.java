import java.util.Scanner;

public class Piramid {
    public void startCalc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("oldal: ");
        String sideStr = sc.nextLine();
        Double side = Double.parseDouble(sideStr);

        System.out.print("Magasság: ");
        String heightStr = sc.nextLine();
        Double height = Double.parseDouble(heightStr);

        Double volume = 1.0/3.0*Math.pow(side,2)*height;
        System.out.printf("Térfogat: %f\n",volume);
    }
}
