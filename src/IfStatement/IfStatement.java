package IfStatement;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        /*
         * If Statement biasa digunakan untuk menambahkan sebuah aksi didalam boolean
         * biasanya dalam pemrograman meng-eksekusi sebuah kode dari atas ke bawah, jika
         * menggunakan if statement maka akan bisa melakukan percabangan
         */

        Scanner inputScanner = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka 10 : ");
        angka = inputScanner.nextInt();

        if (angka == 10) {
            System.out.println("Percabangan di eksekusi");
        } else {
            System.out.println("Percabangan tidak di eksekusi");
        }

        System.out.println("Selesai");

        // Latihan membuat absensi
        System.out.println("====== MEMBUAT ABSENSI ======");
        int[] absen = {
                1, 2, 3, 4, 5
        };
        int inputabsen;

        System.out.print("Masukkan No Absen : ");
        inputabsen = inputScanner.nextInt();

        if ((absen[0] == inputabsen) || (absen[1] == inputabsen) || (absen[2] == inputabsen) || (absen[3] == inputabsen)
                || (absen[4] == inputabsen)) {
                    System.out.println("Absen sudah diisi");
                } else {
                    System.out.println("Absen kamu sudah masuk");
        }

        System.out.println("selesai");

        System.out.println("====== Membuat Tahun Kabisat ======");
        // Latihan membuat tahun kabisat
        int tahun;

        System.out.print("Masukkan tahun : ");
        tahun = inputScanner.nextInt();
        inputScanner.nextLine();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Ini tahun kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }

        System.out.println("Selesai");

        // Latihan membuat Lulus atau tidak ujian
        System.out.println("====== Membuat Cek Kelulusan ======");
        int hasilUjian;
        String nama;

        System.out.print("Masukkan Nama kamu : ");
        nama = inputScanner.nextLine();

        System.out.print("Masukkan Nilai Ujian kamu : ");
        hasilUjian = inputScanner.nextInt();

        if ((hasilUjian >= 60) && (hasilUjian <= 100)) {
            System.out.println("Kamu lulus ujian " + nama);
        } else {
            System.out.println("Kamu tidak lulus ujian " + nama);
        } 
    }
}
