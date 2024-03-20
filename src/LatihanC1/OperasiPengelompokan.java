package LatihanC1;

public class OperasiPengelompokan {
    public static void main(String[] args) {
        // belajar aritmatika pengelompokan

        /*
         * dapat disimpulkan jika didalam sebuah operasi aritmatika terdapat perkalian
         * dan pembagian maka akan didahulukan dan akan lanjut ke penjumlahan atau
         * pengurangan
         */
        int a, b;
        a = 10 + 2 * 10;
        System.out.println(a);

        // contoh menggunakan pembagian dan perkalian, maka yang akan didahulukan adalah
        // yang ada dibagian sebelah kiri dulu
        b = 10 / 2 * 1;
        System.out.println(b);

        // Menggunakan tanda kurung untuk mendahulukan sebuah operasi aritmatika
        a = 10 / 2 * (5 + 2);
        System.out.println(a);

        /*
         * Kesimpulan :
         * 1. Seandainya dalam sebuah aritmatika terdapat perkalian dan penjumlahan atau
         * pengurangan, maka yang akan didahulukan adalah perkalian
         * 2. jika terdapat 2 buah perkalian dan pembagian maka yang sebelah kiri
         * didahulukan untuk melakukan operasinya
         * 3. untuk mendahulukan sebuah penjumlahan dalam aritmatika jika terdapat
         * perkalian atau penjumlahan maka menggunakan tanda kurung untuk didahulukan ()
         */

    }
}
