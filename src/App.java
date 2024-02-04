import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double fiyat, kdv, toplam;


        System.out.println("Ürünün Fiyatını Giriniz: ");
        fiyat = input.nextDouble();
        
        if(fiyat >= 1000 ){
            kdv = 0.08;
        }else{
            kdv = 0.18;
        }

        toplam = fiyat * kdv + fiyat;

        System.out.println("Ürünün Fiyatı: " + fiyat);
        System.out.println("KDV Tutarı: " + (toplam - fiyat));
        System.out.println("KDV'li Fiyat: " + toplam);

    }
}
