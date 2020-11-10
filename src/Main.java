import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program untuk menghitung umur, dimana user
 * menginputkan umur dengan berbasis OOP
 */

public class Main {
    public static void main(String[] args) {
        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tahun lahir anda : ");
        age.setYearBirth(scanner.nextInt());
        System.out.print("\n");
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));

    }
}
