package LatihanC1;

import java.util.Scanner;

public abstract class LatihanKalkulatorIfElse {
    public static void main(String[] args) {
        Scanner inputUser;
        float nilai1, nilai2, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.println("====== Kalkulator Sederhana ======");

        System.out.print("Masukkan Nilai : ");
        if (inputUser.hasNextFloat()) {
            // PENGECEKAN ANGKA 1 (YANG MANA ANGKA HARUS BERNILAI NUMBER TIDAK BOLEH BERNILAI STRING)
            nilai1 = inputUser.nextFloat();
            System.out.print("Masukkan Operator : ");
            if (inputUser.hasNext()) {
                // PENGECEKAN OPERATOR (YANG MANA OPERATOR HARUS BERNILAI CHAR)
                operator = inputUser.next().charAt(0);
                System.out.print("Masukkan Nilai : ");
                if (inputUser.hasNextFloat()) {
                    // PENGECEKAN ANGKA 2 (YANG MANA ANGKA HARUS BERNILAI NUMBER TIDAK BOLEH BERNILAI STRING)
                    nilai2 = inputUser.nextFloat();

                    // OPERASI KALKULATOR UNTUK MENGHITUNG (LOGIC DIAMBIL DARI OPERATOR TERSEBUT)
                    // UNTUK TAMBAHAN
                    if (operator == '+') {
                        hasil = nilai1 + nilai2;
                        System.out.println("=== Hasil ===");
                        System.out.println(
                                "Angka 1 : " + nilai1 + "\n" + "Angka 2 : " + nilai2 + "\n" + "Operator : " + operator);
                        System.out.println("Hasil : " + hasil);
                        // UNTUK PENGURANGAN
                    } else if (operator == '-') {
                        hasil = nilai1 - nilai2;
                        System.out.println("=== Hasil ===");
                        System.out.println(
                                "Angka 1 : " + nilai1 + "\n" + "Angka 2 : " + nilai2 + "\n" + "Operator : " + operator);
                        System.out.println("Hasil : " + hasil);
                        // UNTUK PERKALIAN
                    } else if (operator == '*') {
                        hasil = nilai1 * nilai2;
                        System.out.println("=== Hasil ===");
                        System.out.println(
                                "Angka 1 : " + nilai1 + "\n" + "Angka 2 : " + nilai2 + "\n" + "Operator : " + operator);
                        System.out.println("Hasil : " + hasil);
                        // UNTUK PEMBAGIAN
                    } else if (operator == '/') {
                        if (nilai2 != 0) {
                            hasil = nilai1 / nilai2;
                            System.out.println("=== Hasil ===");
                            System.out.println("Angka 1 : " + nilai1 + "\n" + "Angka 2 : " + nilai2 + "\n"
                                    + "Operator : " + operator);
                            System.out.println("Hasil : " + hasil);
                        } else {
                            System.out.println("Pembagian Error!!!");
                        }
                    } else {
                        System.out.println("Error Operator Tidak Valid");
                    }
                } else {
                    System.out.println("Masukkan Nilai dalam bentuk Number");
                }
            } else {
                System.out.println("Masukkan Operator Aritmatika");
            }
        } else {
            System.out.println("Masukkan Nilai dalam bentuk Number");
        }
    }
}
