package SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
         * SwitchCase ekspresinya biasanya dalam bentuk (Int, Byte, Short, Long), String, Enum
         */

        int angka;
        String nama;

        Scanner inpUScanner = new Scanner(System.in); 

        System.out.print("Masukkan Nama : ");
        nama = inpUScanner.next();

        switch (nama) {
            case "ucup":
                System.out.println("saya ucup");
                break;
            default:
            System.out.println("saya bukan ucup");
                break;
        }

    }
}
