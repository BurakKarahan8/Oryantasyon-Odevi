import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("faktöriyeli hesaplanacak sayıyı giriniz : ");
        int sayi= input.nextInt();
        int carpim= 1;
        for (int i=1 ; i<=sayi ; i++) carpim= carpim*i;
        System.out.println("faktöriyel değeriniz : " + carpim);
    }
}
