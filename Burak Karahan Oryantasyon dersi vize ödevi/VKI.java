import java.util.Scanner;

public class VKI{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("lütfen boyunuzu (metre cinsinden) giriniz : ");
        double boy= input.nextDouble();

        System.out.print("lütfen kilonuzu (kilogram cinsinden) giriniz : ");
        double kilo= input.nextDouble();

        double vki= kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz : " + vki);
    }
}
