import java.util.Scanner;

public class KDVhesabi {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        double Tutar, KDVliTutar, KDV, KDVOrani= 18;

        System.out.print("Tutar giriniz :");
        Tutar= input.nextDouble();

        KDV= Tutar*(KDVOrani/100);
        KDVliTutar= Tutar+KDV;

        System.out.println("KDV oranı : % " + (int)KDVOrani);
        System.out.println("KDV tutarı : " + KDV);
        System.out.println("KDV'li tutar : " + KDVliTutar);
    }
}
