package Latihan;

public class LatihanOperasiLogikaChatGpt {
    public static void main(String[] args) {

        // Soal No 1. Diberikan variabel boolean x = true; dan boolean y = false;,
        // hitung hasil dari (x || y).
        System.out.println("======SOAL NO 1======");
        boolean x, y, hasilBoolean;
        x = true;
        y = false;
        hasilBoolean = (x || y);
        System.out.println("Hasil dari Operasi logika OR = " + hasilBoolean);

        // SOAL No 2. Diberikan variabel boolean a = true; dan boolean b = false;,
        // hitung hasil dari (a && b).
        System.out.println("======SOAL NO 2======");
        boolean a, b;
        a = true;
        b = false;
        hasilBoolean = (a && b);
        System.out.println("Hasil dari Operasi logika AND = " + hasilBoolean);

        // Soal No. 3 Diberikan variabel boolean p = true; dan boolean q = true;, hitung
        // hasil dari (p ^ q).
        System.out.println("======SOAL NO 3======");
        boolean p, q;
        p = true;
        q = true;
        hasilBoolean = (p ^ q);
        System.out.println("Hasil dari Operasi logika XOR = " + hasilBoolean);

        // Soal No. 4 Diberikan variabel int num1 = 10;, int num2 = 15;, dan boolean
        // isEven = (num1 % 2 == 0);. Hitung hasil dari (num1 > num2) && (num1 < 20) ||
        // isEven.
        System.out.println("======SOAL NO 6======");
        int num1, num2;
        boolean isEven;

        num1 = 10;
        num2 = 15;
        isEven = (num1 % 2 == 0);
        hasilBoolean = (num1 > num2) && (num1 < 20) || isEven;
        System.out.println("Hasil dari Operasi Logika Kombinasi = " + hasilBoolean);
    }
}
