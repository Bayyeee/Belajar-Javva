package LatihanC1;

import java.util.Scanner;

public class LatihanSoalCeritaIfElseIf {
    public static void main(String[] args) {
        /*
        =============================== SOAL ===============================
         * Adi adalah seorang pengemudi taksi online yang sedang menghitung
         * penghasilannya setelah melayani beberapa pelanggan sepanjang hari. Untuk
         * membantu Adi, buatlah program Java yang meminta Adi untuk memasukkan jumlah
         * total pendapatannya hari ini. Program tersebut kemudian akan menentukan
         * besarnya bonus yang akan diberikan kepada Adi berdasarkan jumlah
         * pendapatannya, dengan aturan sebagai berikut:
         * 
         * Jika pendapatan Adi lebih dari atau sama dengan 500 ribu, maka bonus yang
         * diberikan adalah 10% dari total pendapatannya.
         * Jika pendapatan Adi kurang dari 500 ribu tetapi lebih dari atau sama dengan
         * 300 ribu, maka bonus yang diberikan adalah 5% dari total pendapatannya.
         * Jika pendapatan Adi kurang dari 300 ribu, maka tidak ada bonus yang
         * diberikan.
         * Buatlah program Java yang dapat menyelesaikan masalah di atas dan menampilkan
         * jumlah bonus yang akan diterima Adi berdasarkan total pendapatannya.
         */

        int pendapatan;
        double bonus;
        Scanner inputPendapatan = new Scanner(System.in);

        System.out.print("Masukkan Pendapatan : ");
        
        if (inputPendapatan.hasNextInt()) {
            pendapatan = inputPendapatan.nextInt();
            if (pendapatan >= 500000) {
                bonus = pendapatan + (0.1 * pendapatan);
                System.out.println("Anda mendapatkan Bonus sebesar 10% ");
                System.out.println("Bonus anda adalah : " + bonus);
                System.out.println("Pendapatan anda sekarang : " + (pendapatan + bonus));
            } else if ((pendapatan >= 300000) && (pendapatan <= 500000)) {
                bonus = pendapatan + (0.05 * pendapatan);
                System.out.println("Anda mendapatkan Bonus sebesar 5% ");
                System.out.println("Bonus anda adalah : " + bonus);
                System.out.println("Pendapatan anda sekarang : " + (pendapatan + bonus));
            } else if (pendapatan < 3000000) {
                System.err.println("Anda tidak mendapat Bonus");
            } else {
                System.err.println("ERROR");
            }
        } else {
            System.err.println("Masukkan Angka!!!");
        }

    }
}
