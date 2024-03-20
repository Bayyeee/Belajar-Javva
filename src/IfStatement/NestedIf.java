package IfStatement;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int a, b;
        Scanner inpScanner = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        a = inpScanner.nextInt();
        System.out.print("Masukkan Angka : ");
        b = inpScanner.nextInt();

        if((a == 5) && (b == 10)){
            System.out.println("Nilai anda telah sesuai");
        } else {
            if ((a >= 5) && (a <= 10)) {
                System.out.println("Angka anda memenuhi syarat dengan nilai A");
            } else if((a >= 10) && (a <= 20) || (a == b)){
                System.out.println("Angka anda memenuhi syarat Nilai B");
            } else {
                System.out.println("Angka anda tidak memenuhi syarat");
            }
        }

        // if ((a >= 5) && (a <= 10)) {
        //     System.out.println("Angka yang anda masukkan sudah sesuai");
        // } else if ((a >= 10) || (a == b)) {
        //     if ((a <= 20) && (b >= 20)) {
        //         System.out.println("Angka anda sesuai");
        //     } else {
        //         System.out.println("Angka anda tidak sesuai");
        //     }
        // } else {
        //     System.out.println("Angka yang anda masukkan adalah benar");
        // }

        System.out.println("Program berakhir");
    }
}

// package IfStatement;

// import java.util.Scanner;

// public class NestedIf {
// public static void main(String[] args) {
// int harga, nobarang;
// double diskon;
// String[] namaBarang = {
// "masako", "minyak", "kecap",
// "Garam", "Telur", "Gula"
// };
// Scanner input = new Scanner(System.in);

// System.out.println("====== Menentukan Diskon ======");
// System.out.println("====== Nama Barang ======");
// System.out.println("0. " + namaBarang[0]);
// System.out.println("1. " + namaBarang[1]);
// System.out.println("2. " + namaBarang[2]);
// System.out.println("3. " + namaBarang[3]);
// System.out.println("4. " + namaBarang[4]);
// System.out.println("5. " + namaBarang[5]);
// System.out.println("====== Transaksi Pembelian ======");
// System.out.print("Masukkan No Barang \t: ");
// nobarang = input.nextInt();
// System.out.print("Masukkan Harga Barang \t: ");
// harga = input.nextInt();

// if ((nobarang >= 0 && nobarang < namaBarang.length)) {
// String barangPilihan = namaBarang[nobarang];

// diskon = 0;
// if (barangPilihan.equals(namaBarang[0])) {
// System.out.println("====== Total Harga ======");
// diskon = 2 / 100;
// System.out.println(
// barangPilihan + " dengan harga " + harga + " diskon sebesar "
// + diskon + "%" + " harga " + barangPilihan + " sekarang " + harga / diskon);
// // } else if () {

// // } else if () {

// // } else if () {

// } else {

// }
// } else {
// System.out.println("Kamu tidak memilih");
// }
// }
// }
