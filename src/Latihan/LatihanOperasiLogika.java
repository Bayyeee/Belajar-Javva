package Latihan;

import java.util.Scanner;

public class LatihanOperasiLogika {
        public static void main(String[] args) {

                // menggunakan scanner untuk mengambil input dari user
                Scanner userInput = new Scanner(System.in);

                int nilaibenar, nilaitebakan;
                boolean statustebakan;
                String status;

                // menggunakan operasi logika OR
                nilaibenar = 10;
                System.out.println("================");
                System.out.println(
                                "QLUE ( Tebak angka, jika anda mempunyai buah sebanyak 5 dan diberi oleh ayah sebanyak 5 lagi berapa jumlah buah anda? )");
                System.out.print("Masukkan angka tebakan anda : ");
                nilaitebakan = userInput.nextInt();
                statustebakan = (nilaitebakan == nilaibenar);
                status = (statustebakan) ? "Benar" : "Salah";
                System.out.println("Nilai tebakan anda adalah : " + status);

                // menggunakan operasi logika AND
                System.out.println("===============");
                System.out.println("QLUE ( Tebakan angka tidak boleh kurang dari 4 dan tidak boleh lebih dari 10 )");
                System.out.print("Masukkan angka tebakan anda : ");
                nilaitebakan = userInput.nextInt();
                statustebakan = (nilaitebakan > 4) && (nilaitebakan < 9);
                status = (statustebakan) ? "Anda Benar" : "Anda Salah ";
                System.out.println("Nilai tebakan anda adalah : " + status);

                // menggunakan operasi logika XOR
                int[] absen = {
                                1, 2, 3
                };

                System.out.println(
                                "QLUE ( Absen tidak boleh sama dengan teman - teman, nilai absen yang sudah diisi rentang 1 - 3)");
                System.out.print("Masukkan Nilai absen : ");
                nilaitebakan = userInput.nextInt();
                statustebakan = (nilaitebakan == absen[0]) ^ (nilaitebakan == absen[1]) ^ (nilaitebakan == absen[2]);
                status = (statustebakan) ? "Absen sudah ada" : "Absen anda sudah masuk";

                System.out.println("Nilai tebakan anda adalah : " + status);
        }
}
