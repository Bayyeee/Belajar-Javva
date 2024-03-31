package LatihanC2;

import java.util.Scanner;

public class LatihanDeretFibonaco {
    public static void main(String[] args) {
        // menghitung nilai deret fibonaci ke n
        int f_n, f_n1, f_n2, n;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Mengambil nilai fibonaci ke- : ");
        n = inputUser.nextInt();

        f_n2 = 0;
        f_n1 = 1;
        f_n = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("ini adalah nilai ke-" + i + " adalah " + f_n);
            f_n = f_n1 + f_n2;
            f_n2 = f_n1;
            f_n1 = f_n;
        }

        int i = 1;

        do {
            System.out.println("ini adalah nilai ke-" + i + " adalah " + f_n);
            f_n = f_n1 + f_n2;
            f_n2 = f_n1;
            f_n1 = f_n;
            i++;
        } while (i <= n);

        while (i <= n) {
            System.out.println("ini adalah nilai ke-" + i + " adalah " + f_n);
            f_n = f_n1 + f_n2;
            f_n2 = f_n1;
            f_n1 = f_n;
            i++;
        }

    }
}
