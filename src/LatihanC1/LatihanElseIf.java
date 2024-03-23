package LatihanC1;

import java.util.Scanner;

public class LatihanElseIf {
    public static void main(String[] args){
        int angka;
        String nama, keterangan, nama1;
        keterangan = "Nilai anda \t: ";
        nama1 = "Nama \t\t: ";
        Scanner inpUScanner = new Scanner(System.in);

        System.out.print("Masukkan Nama anda \t: ");
        nama = inpUScanner.nextLine();
        System.out.print("Masukkan Nilai Ujian \t: ");

        if (inpUScanner.hasNextInt()) {
            angka = inpUScanner.nextInt();
            System.out.println("====== Keterangan ======");
            if ((angka >= 90) && (angka <= 100)) {
                System.out.println(nama1 + nama);
                System.out.println(keterangan + "A");
            } else if ((angka >= 80) && (angka <= 90)) {
                System.out.println(nama1 + nama);
                System.out.println(keterangan + "B");
            } else if ((angka >= 70) && (angka <= 80)) {
                System.out.println(nama1 + nama);
                System.out.println(keterangan + "C");
            } else if ((angka >= 60) && (angka <= 70)) {
                System.out.println(nama1 + nama);
                System.out.println(keterangan + "D");
            } else if (angka < 50) {
                System.out.println(nama1 + nama);
                System.out.println(keterangan + "Tidak Lulus");
            } else {
                System.out.println("Nilai yang harus dimasukkan 1 - 100");
            }
        } else {
            System.out.println("====== Keterangan ======");
            System.out.println("Nilai yang harus dimasukkan adalah bilangan bulat");
        }
    }
}
