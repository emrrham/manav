import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        // Meyvelerin kilogram fiyatları
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcıdan meyve miktarlarını al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut kaç kilo? ");
        double armutKilo = scanner.nextDouble();
        System.out.print("Elma kaç kilo? ");
        double elmaKilo = scanner.nextDouble();
        System.out.print("Domates kaç kilo? ");
        double domatesKilo = scanner.nextDouble();
        System.out.print("Muz kaç kilo? ");
        double muzKilo = scanner.nextDouble();
        System.out.print("Patlıcan kaç kilo? ");
        double patlicanKilo = scanner.nextDouble();

        // Toplam fiyatı hesapla
        double toplamFiyat = armutKilo * armutFiyat +
                elmaKilo * elmaFiyat +
                domatesKilo * domatesFiyat +
                muzKilo * muzFiyat +
                patlicanKilo * patlicanFiyat;

        // Sonucu ekrana yazdır
        System.out.println("Toplam tutar: " + toplamFiyat + " TL");
    }
}
