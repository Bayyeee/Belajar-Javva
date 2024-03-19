package ScannerInputUser;

import java.util.Scanner;

public class ScannerInputUser {
    public static void main(String[] args) {

        String nama, alamat, hobi, ttl;
        int umur;

        Scanner ScannerInputUser = new Scanner(System.in);

        System.out.print("Masukkan Nama Kamu \t: ");
        nama = ScannerInputUser.nextLine();

        System.out.print("Masukkan TTL Kamu \t: ");
        ttl = ScannerInputUser.nextLine();

        System.out.print("Masukkan Umur Kamu \t: ");
        // TODO contoh
        // umur = ScannerInputUser.nextInt();
        // ScannerInputUser.nextLine();
        umur = Integer.parseInt(ScannerInputUser.nextLine());

        System.out.print("Masukkan Alamat Kamu \t: ");
        alamat = ScannerInputUser.nextLine();

        System.out.print("Masukkan Hobi Kamu \t: ");
        hobi = ScannerInputUser.nextLine();

        System.out.println("============================");
        System.out.printf(
                " Nama kamu adalah \t: %s\n Ttl kamu adalah \t: %s\n Umur kamu adalah \t: %d\n Alamat kamu adalah \t: %s\n Hobi kamu adalah \t: %s\n",
                nama, ttl, umur, alamat, hobi);

    }
}
