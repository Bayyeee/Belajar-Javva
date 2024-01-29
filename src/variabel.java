public class variabel {
    public static void main(String[] args) {
        // default valu dari tipe data number jika tidak ada nilai maka dianggap Nol
        int umur;
        // default value dari string jika tidak ada nilai maka dianggap null
        String name;

        name = "Muhammad Udin Syamsul";
        umur = 21;
        System.out.println("Nama : " + name + "\n" + "Umur : " + umur);


        // penggunaan VAR yang benar seperti dibawah
        var makan = "nasi"; // var yang benar adalah langsung inisialisasi pada value nya jadi tidak terjadi null atau nol pada variabel
        var ikan = "papuyu";

        // penggunaan VAR yang salah seperti dibawah
        //var kuah; // var salah diakibatkan inisialisasi di pisah dari variabel
       // kuah = "soto mang amat sodakoh al qodri";

        // penggunaan Final digunakan untuk variabel tidak dapat dirubah lagi atau dianggap constant ( Const)
        final String belajar;
        belajar = "sedang belajar javva";

        final var belajar1 = 123;

    }
}
