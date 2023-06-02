import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran = 0, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdvOran = tutar < 1000 ? 0.18 : 0.8;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı:" + kdvTutar);
        System.out.println("KDV'li Tutar :" + kdvliTutar);




    }


}
