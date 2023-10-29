import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(in);

        // Mengambil panjang alas dari pengguna
        out.print("Masukkan panjang alas segitiga: ");
        double alas = input.nextDouble();

        // Mengambil tinggi segitiga dari pengguna
        out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil
        out.println("Luas segitiga adalah: " + luas);

        // Menutup objek Scanner
        input.close();
    }
}