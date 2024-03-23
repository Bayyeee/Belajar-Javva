package LatihanC1;

import java.util.Scanner;

public class LatihanIfstatement {
    public static void main(String[] args){
        int angka;
        String nama;

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda \t: ");
        nama = inputScanner.nextLine();
        // System.out.print("Masukkan Angka \t: ");
        // angka = inputScanner.nextInt();
        System.out.print("Masukkan Angka \t\t: ");

        if (inputScanner.hasNextInt()) {
            angka = inputScanner.nextInt();
            System.out.println("====== HASIL ======");
            if (angka % 2 == 0) {
                System.out.println("Nama saya adalah \t\t: " + nama);
                System.out.println("Nilai yang saya masukkan adalah : " + angka);
                System.out.println("Nilai yang anda masukkan adalah bilangan genap");
            } else {
                System.out.println("Nama saya adalah \t\t: " + nama);
                System.out.println("Nilai yang saya masukkan adalah : " + angka);
                System.out.println("Nilai yang " + nama + " masukkan adalah bilangan ganjil");
            }
        } else if (inputScanner.hasNextFloat()) {
            System.out.println("Nilai yang anda masukkan adalah decimal");
        } else {
            System.out.println("Nilai yang anda masukkan tidak bilangan bulat");
        }

    }
}
