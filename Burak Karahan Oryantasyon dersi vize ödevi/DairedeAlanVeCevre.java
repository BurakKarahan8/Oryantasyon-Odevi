import java.util.Scanner;

public class DairedeAlanVeCevre {
    public static void main(String[] args) {
        final double pi=3.14;
        Scanner input= new Scanner(System.in);
        System.out.print("Yarıçapı giriniz : ");
        Double yaricap= input.nextDouble();

        double cevre= yaricap*pi*2;
        double alan= pi*(yaricap*yaricap);

        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Dairenin alanı : " + alan);
    }
}
