
package pkgif.pkg3.pkg10117110.latihan11.formating;

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Formating angka
 */
public class IF310117110Latihan11Formating {

    public static void main(String[] args) {
        int i = 3546764;
        int iMinus = -3546764;
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d : %10d%n", i);
        System.out.printf("%%+10d : %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i);
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.printf("%%f : %f%n", f);
        System.out.printf("%%.2ff : %.2f%n", f);
        System.out.printf("%%12.2ff : %12.2ff%n", f);
        System.out.printf("%%,12.2ff : %,12.2ff%n", f);
        
        

    }
    
}
