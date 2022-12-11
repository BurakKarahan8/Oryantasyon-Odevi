import java.util.Scanner;

public class SicakligaGoreEtkinlikOnerme {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("derece : ");
        int sicaklik = input.nextInt();
        String etkinlik= "";

        if (sicaklik<5) etkinlik= "kayak";
        else if (sicaklik<15) etkinlik= "tiyatro";
        else if (sicaklik<25) etkinlik= "mangal";
        else etkinlik= "yüzme";

        System.out.println("Önerilen etkinlik : " + etkinlik);
    }
}
