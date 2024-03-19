package Latihan;

import java.util.Scanner;

public class LatihanAritmatika {
    public static void main(String[] args) {
        // Membuat perhitungan Luas
        // Rumus luas = Panjang * Lebar
        int panjang, lebar, luas;
        panjang = 5;
        lebar = 10;
        luas = panjang * lebar;
        System.out.println(luas);

        System.out.println("Menghitung Panjang=============");
        // Menggunakan user input
        Scanner userInput = new Scanner(System.in);
        int Pinput, Linput, Hiput;
    
        System.out.print("Masukkan Panjang = ");
        Pinput = userInput.nextInt();
        System.out.print("Masukkan Lebar = ");
        Linput = userInput.nextInt();
        Hiput = Pinput * Linput;

        System.out.println("Hasil Luas = " + Hiput);

        // Untuk Menghitung sisi pada persegi
        // Rumus sisi = sisi * sisi
        System.out.println("Menghitung SISI===============");
        int sisi1, Hsisi;

        System.out.print("Masukkan Sisi = ");
        sisi1 = userInput.nextInt();
        Hsisi = sisi1 * 2;

        System.out.println("Hasil Sisi = " + Hsisi);

    }
}