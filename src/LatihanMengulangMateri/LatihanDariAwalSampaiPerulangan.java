package LatihanMengulangMateri;

import java.util.Scanner;

public class LatihanDariAwalSampaiPerulangan {
    public static void main(String[] args) {
        // SOAL 1 Buatlah sebuah program Java untuk menentukan apakah suatu bilangan
        // bulat positif adalah bilangan prima atau tidak.

        int nilaiAwal, nilaiAkhir;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Nilai \t: ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan Nilai Akhir \t:");
        nilaiAkhir = inputUser.nextInt();

        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            int bilangan = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bilangan++;
                }
            }
            if (bilangan == 2) {
                System.out.println(i + " ");
            }
        }
    }
}
