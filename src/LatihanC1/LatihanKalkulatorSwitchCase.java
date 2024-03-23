package LatihanC1;

import java.util.Scanner;

public abstract class LatihanKalkulatorSwitchCase {
    public static void main(String[] args) {
        Scanner inputUser;
        float angka1, angka2, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.println("====== Kalkulator Sederhana ======");

        System.out.print("Masukkan Nilai \t\t: ");
        if (inputUser.hasNextFloat()) {
            // PENGECEKAN ANGKA 1 (YANG MANA ANGKA HARUS BERNILAI NUMBER TIDAK BOLEH BERNILAI STRING)
            angka1 = inputUser.nextFloat();
            System.out.print("Masukkan Operator \t: ");
            if (inputUser.hasNext()) {
                // PENGECEKAN OPERATOR (YANG MANA OPERATOR HARUS BERNILAI CHAR)
                operator = inputUser.next().charAt(0);
                System.out.print("Masukkan Nilai \t\t: ");
                if (inputUser.hasNextFloat()) {
                    // PENGECEKAN ANGKA 2 (YANG MANA ANGKA HARUS BERNILAI NUMBER TIDAK BOLEH BERNILAI STRING)
                    angka2 = inputUser.nextFloat();
                    // OPERASI KALKULATOR UNTUK MENGHITUNG (LOGIC DIAMBIL DARI OPERATOR TERSEBUT)
                    // UNTUK TAMBAHAN
                    switch (operator) {
                        case '+':
                            hasil = angka1 + angka2;
                            System.out.println("=== Hasil Kalkulator ===");
                            System.out.println("Hasil dari penjumlahan : " + hasil);
                            break;
                        case '-':
                            hasil = angka1 - angka2;
                            System.out.println("=== Hasil Kalkulator ===");
                            System.out.println("Hasil dari pengurangan : " + hasil);
                            break;
                        case '*':
                            hasil = angka1 * angka2;
                            System.out.println("=== Hasil Kalkulator ===");
                            System.out.println("Hasil dari perkalian : " + hasil);
                            break;
                        case '/':
                            if (angka2 != 0) {
                                hasil = angka1 / angka2;
                                System.out.println("=== Hasil Kalkulator ===");
                                System.out.println("Hasil dari pembagian : " + hasil);
                            } else {
                                System.out.println("Pembagian Error!!!");
                            }
                            break;
                        default:
                            System.out.println("Kalkulator Error!!!");
                            break;
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
