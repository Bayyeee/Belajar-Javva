package IfStatement;

import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {
        /*
         * Contoh penggunaan If Else IF Statement
         * yaitu tentang Cek nilai kelulusan
         */
        int Nilai;
        String nama;
        Scanner in = new Scanner(System.in);

        System.out.println("====== Menentukan Kelulusan Siswa ======");
        System.out.print("Masukkan Nama Kamu \t: ");
        nama = in.nextLine();

        System.out.print("Masukkan Nilai Ujian \t: ");
        Nilai = in.nextInt();

        // didalm if adalah ekspresi atau logika yang ingin kita tambahkan, menggunakan
        // boolean
        if ((Nilai >= 60) && (Nilai <= 100)) {
            // setelah melakukan logika maka, if akan melakukan aksi, biasanya aksi berada
            // didalam if, else if, else
            System.out.println("Kamu lulus " + nama);
        } else if ((Nilai <= 0) || (Nilai >= 100)) {
            System.out.println("Inputkan Data yang valid");
        } else {
            System.out.println("Kamu tidak lulus " + nama);
        }

        System.out.println("====== Menentukan Usia ======");
        int usia;

        System.out.print("Masukkan Usia : ");
        usia = in.nextInt();
        in.nextLine();
        System.out.print("Masukkan Nama : ");
        nama = in.nextLine();

        if ((usia <= 5)) {
            System.out.println("Kamu adalah Balita " + nama);
        } else if ((usia >= 5) && (usia <= 10)) {
            System.out.println("Kamu adalah Anak - Anak " + nama);
        } else if ((usia >= 10) && (usia <= 18)) {
            System.out.println("Kamu adalah Remaja " + nama);
        } else if ((usia >= 19) && (usia <= 50)) {
            System.out.println("Kamu adalah Dewasa " + nama);
        } else if ((usia >= 80) && (usia <= 100)) {
            System.out.println("Kamu adalah lanjut usia " + nama);
        } else {
            System.out.println("Kamu adalah sepuh kehidupan " + nama);
        }

        System.out.println("Selesai");
    }
}
