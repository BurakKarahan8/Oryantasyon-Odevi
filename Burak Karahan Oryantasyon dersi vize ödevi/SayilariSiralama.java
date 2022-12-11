import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        int a= input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int b= input.nextInt();

        System.out.print("3. sayıyı giriniz : ");
        int c= input.nextInt();

        String siralama= "";

        if (a>b && a>c){
            if (b>c) siralama= "a>b>c";
            else siralama= "a>c>b";
        }
        else if (b>a && b>c){
            if (a>c) siralama= "b>a>c";
            else siralama= "b>c>a";
        }
        else if (c>a && c>b){
            if (a>b) siralama= "c>a>b";
            else siralama= "c>b>a";
        }

        System.out.println("sayıların sıralaması : " + siralama);

    }
}
