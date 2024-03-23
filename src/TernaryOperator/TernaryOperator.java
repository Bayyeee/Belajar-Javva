package TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
        String keterangan;

        // Soal 1 (Operasi Logika OR): Tiga sahabat, Andi, Budi, dan Cinta, sedang
        // merencanakan liburan. Andi ingin pergi ke pantai atau ke gunung, Budi ingin
        // pergi ke pantai atau ke danau, sedangkan Cinta ingin pergi ke gunung atau ke
        // danau. Jika Andi pergi ke pantai dan Budi pergi ke danau, mereka akan memilih
        // tempat berbeda. Namun, jika salah satu dari mereka memilih tempat yang sama,
        // maka mereka akan pergi bersama. Jika Andi memilih ke pantai dan Budi ke
        // danau, apa yang akan terjadi?
        System.out.println("====== Soal 1 ======");
        boolean pantai, danau, gunung, hasil;
        pantai = true;
        danau = false;
        gunung = true;
        hasil = (pantai && !danau) || (!pantai && danau) || (!pantai && gunung);
        // ini adalah ternary operator, digunakan untuk menggantikan if else untuk lebih
        // singkat jika hanya menggunakan logic true false biasa bukan percabangan
        // nesteed
        keterangan = (hasil) ? "Berangkat" : "Tidak berangkat";
        System.out.println("Mereka akan " + keterangan);
    }
}
