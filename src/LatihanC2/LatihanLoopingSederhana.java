package LatihanC2;

import java.util.Scanner;

public class LatihanLoopingSederhana {
    public static void main(String[] args){

        System.out.println("PROGRAM PENJUMLAHAN ANGKA");
        int awal, akhir, total;
        Scanner inputUser;

        inputUser = new Scanner(System.in);

        System.out.print("Masukkan Nilai awal : ");
        awal = inputUser.nextInt();
        System.out.print("Masukkan Nilai Akhir : ");
        akhir = inputUser.nextInt();

        total = 0;

        for (awal = 1; awal <= akhir; awal++) {
            total = total + awal;
            System.out.println("Ditambah " + awal + " menjadi " + total);
        }

        do {
            total = total + awal;
            System.out.println("Ditambah " + awal + " menjadi " + total);
            awal++;
        } while (awal <= akhir);

        while (awal <= akhir) {
            total = total + awal;
            System.out.println("Ditambah " + awal + " menjadi " + total);
            awal++;
        }

    }
}
