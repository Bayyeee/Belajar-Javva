package LatihanC1;

public class LatihanWhileLoop {
    public static void main(String[] args) {
        int genap, ganjil, Angka;

        // Soal 1
        genap = 1;
        while (genap <= 20) {
            if (genap % 2 == 0) 
                System.out.println("Angka Genap ke-" + genap);
                genap++;
        }
        System.out.println("====== Akhir Program ======\n");

        // Soal 2
        ganjil = 1;
        while (ganjil <= 15) {
            if (ganjil % 2 != 0) 
                System.out.println("Angka Ganjil ke-" + ganjil);
                ganjil++;
        }
        System.out.println("====== Akhir Program ======\n");

        Angka = 0;
        while (Angka <= 100) {
            System.out.println("Angka ke-" + Angka);
            Angka++;
        }
        System.out.println("====== Akhir Program ======");
    }
}
