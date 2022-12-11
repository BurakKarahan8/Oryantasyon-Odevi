import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("km değerini giriniz :");
        double km = input.nextDouble();
        double tutar = 10 + (km * 4.20);
        tutar = (tutar < 30) ? 30 : tutar;
        System.out.println("Taksi ücreti : " + tutar);
    }
}
