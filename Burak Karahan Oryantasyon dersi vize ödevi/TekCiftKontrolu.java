import java.util.Scanner;

public class TekCiftKontrolu {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int sayi= input.nextInt();
        if (sayi%2==0) System.out.println("Sayı çifttir");
        else System.out.println("Sayı tektir");
    }
}
