
package pbo10119012latihan50;

/**
 *   NAMA    : DAMAI SAPUTRA LAOLI
 *   KELAS   : IF-1
 *   NIM     : 10119012
 * @author damai
 */
public class PBO10119012Latihan50 {

   
    public static void main(String[] args) {
        double massa, energiKinetik, usaha, kAwal, kAkhir;
        Kinetik bola_baseball = new Kinetik(145,25);
        bola_baseball.setKecepatanAwal(0);
        kAwal = bola_baseball.getKecepatanAwal();
        kAkhir = bola_baseball.getKecepatanAkhir();
        massa = bola_baseball.getMassa();
        energiKinetik = bola_baseball.hitungEnergiKinetik(massa,kAkhir);
        usaha = bola_baseball.hitungUsaha(massa,kAwal,kAkhir);

        System.out.println("=====Penghitungan Energi Kinetik=====");
        System.out.printf("Sebuah bola baseball dengan massa %1$.0f g dilempar dengan kecepatan %2$.0f m/s.%n", massa, kAkhir);
        System.out.printf("Hasil energi kinetik = %.0f J%n", energiKinetik);
        System.out.println();
        System.out.println("=====Perhitungan Usaha=====");
        System.out.printf("Usaha yang dilakukan terhadap bola untuk mencapai kecepatan %1$.0f m/s, keadaan awal diam.%n", kAkhir);
        System.out.printf("Usaha = %.0f J%n",usaha);
    }
}
