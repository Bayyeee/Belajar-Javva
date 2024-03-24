package LatihanC1;

import java.util.Scanner;

public class LatihanDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;
        int total = 0;

        do {
            System.out.print("Masukkan sebuah angka (0 untuk berhenti): ");
            angka = scanner.nextInt();
            total += angka;
        } while (angka != 0);

        System.out.println("Jumlah dari semua angka yang dimasukkan adalah: " + total);
        scanner.close();
    }
}
