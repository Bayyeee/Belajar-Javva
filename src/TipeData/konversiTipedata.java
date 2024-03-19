package TipeData;

public class konversiTipedata {
    public static void main(String[] args) {
        // Ini adalah tipe data yang akan dibuat konversi

        /*
         * Widening Casting (automatically) - converting a smaller type to a larger type size
         * byte -> short -> char -> int -> long -> float -> double
        
        
         * Narrowing Casting (manually) - converting a larger type to a smaller size type
         * double -> float -> long -> int -> char -> short -> byte 
         */

        // Ini adalah Widening Casting atau bisa disebut casting otomatis
        // dari contoh di bawah menggunakan tipe data dari kecil ke besar yaitu dari byte -> short -> char -> int -> long -> float -> double
        byte a = 10;
        short b = a;
        int c = a;
        long d = a;
        float e = a;
        double f = a;

        // Ini adalah Narrowing Casting atau bisa disebut dengan casting manual
        // dari contoh dibawah menggunakan tipe data dari besar ke kecil yaitu dari double -> float -> long -> int -> char -> short -> byte
        double iniDouble = 1.5;
        float iniFLoat = (float) iniDouble;
        long iniLong = (long) iniFLoat;
        int iniInt3 = (int) iniLong;
        short iniShort2 = (short) iniInt3;
        byte iniByte3 = (byte) iniShort2;

        // casting sederhana dalam operator matematika
        int nilai = 2, nilai2 = 5;
        float hasil = nilai / nilai2;
        System.out.println(hasil); 

        // int nilaiint = 1;
        // byte nilaibyte = 1;

        // System.out.println("Nilai Int = : " + nilaiint);
        // System.out.println("Nilai Max dari Int : " + Integer.MAX_VALUE);
        // System.out.println("Nilai Min dari Int : " + Integer.MIN_VALUE);
        // byte iniByte = 10;
        // short iniShort = iniByte;
        // int iniInt = iniShort;

        // byte iniInt2 = 100;
        // int iniByte2 = (byte)(iniInt2);

        // System.out.println(iniByte2);
    }
}
