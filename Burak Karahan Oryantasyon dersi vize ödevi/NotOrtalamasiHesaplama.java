import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        int fizik, matematik, turkce, kimya, muzik, tarih;

        System.out.print("fizik notunuz : ");
        fizik= input.nextInt();

        System.out.print("matematik notunuz : ");
        matematik= input.nextInt();

        System.out.print("turkce notunuz : ");
        turkce= input.nextInt();

        System.out.print("kimya notunuz : ");
        kimya= input.nextInt();

        System.out.print("muzik notunuz : ");
        muzik= input.nextInt();

        System.out.print("tarih notunuz : ");
        tarih= input.nextInt();

        double sonuc= (fizik + matematik + turkce + kimya + muzik + tarih)/6.0;

        System.out.println("ortalamanız : " + sonuc);

        if (sonuc>60)
            System.out.print("sınıfı geçti");
        else
            System.out.print("Sınıfta kaldı");

    }
}