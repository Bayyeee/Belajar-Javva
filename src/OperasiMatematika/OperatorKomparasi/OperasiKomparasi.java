package OperasiMatematika.OperatorKomparasi;

public class OperasiKomparasi {
    public static void main(String[] args) {
        // Operator Komparasi akan menghasilkan nilai dalam bentuk boolean yaitu true dan false

        int a,b;
        boolean hasilKomparasi;

        // Menggunakan operator equal atau persamaan
        System.out.println("--------- PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);

        // Menggunakan operator nonequal atau pertidaksamaan
        System.out.println("--------- PERTIDAKSAMAAN");
        a = 10;
        b = 9;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi= (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        // Menggunakan operator Less kurang dari
        System.out.println("--------- LESS THAN");
        a = 10;
        b = 10;
        hasilKomparasi= (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi= (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        // Menggunakan operator greater than lebih dari
        System.out.println("--------- GREATER THAN");
        a = 10;
        b = 10;
        hasilKomparasi= (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi= (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        // Menggunakan operator less than equal kurang dari sama dengan
        System.out.println("--------- LESS THAN EQUAL");
        a = 9;
        b = 10;
        hasilKomparasi= (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi= (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi= (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        // Menggunakan operator grater than equal lebih dari sama dengan
        System.out.println("--------- GREATER THAN EQUAL");
        a = 9;
        b = 10;
        hasilKomparasi= (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi= (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 12;
        hasilKomparasi= (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);
    }
}
