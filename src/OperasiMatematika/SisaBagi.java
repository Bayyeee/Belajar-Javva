package OperasiMatematika;

public class SisaBagi {
    public static void main(String[] args) {
        // operator pada modulus menggunakna tanda ( % )
        int a = 30;
        int b = 17;
        int c = a % b;

        System.out.println(c);
        System.out.printf("Hasil dari sisa bagi %d %% %d = %d\n", a, b, (a % b));
    }
}
