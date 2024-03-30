package Looping;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        
        
        /*
        for (inisialisasi; kondisi; step nilai) {
            aksi
        } 
        
        1. inisialisasi itu berfungsi untuk memberikan sebuah variabel yang bertipe data harus number (misalkan i = 10;)
        2. dibagian kondisi adalah sebuah boolean untuk melanjutkan sebuah loopingnya misalkan (variabel i < 100;)
        3. dibagian stepnilai adalah sebuah nilai lanjutan dari kondisi tersebut yang diminta
        */


        int angka;
        Scanner inputScanner;

        System.out.println("Loop 1");

        inputScanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        angka = inputScanner.nextInt();

        for (int i = 1; i < angka; i++) {
            System.out.println(i + ". makan bang");
        }

        for(int i = 1; i < 10; --i){
            System.out.println("angka ke-" + i);
        }

        System.out.println("Akhir Programm!!!");
    }
}
