
package if01.pkg10118006.latihan27.hurufbesardankecil;
import java.util.Scanner;
/*
 * Nama      : Alfarizi Rizki Pane
 * Kelas     : IF-1
 * NIM       : 10118006
 * Deskripsi : Formatting kalimat menjadi huruf besar dan kecil
 */

public class IF0110118006Latihan27HurufBesardanKecil {

    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        kalimat = masuk.nextLine();
        String Kapital = kalimat.toUpperCase();
        String Kecil = kalimat.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.printf("Huruf Besar\t: %s", Kapital);
        System.out.printf("%nHuruf Kecil\t: %s%n", Kecil);
    }
   
}
