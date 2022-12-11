import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("1. kenarı giriniz :");
        int a= input.nextInt();

        System.out.print("2. kenarı giriniz :");
        int b= input.nextInt();

        double c= Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs : " + c);
    }
}
