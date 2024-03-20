package Latihan;

public class LatihanOperasiLogikaChatGpt2 {
    public static void main(String[] args) {

        // Soal 1 (Operasi Logika OR): Adam dan Budi sedang berdiskusi tentang liburan
        // mereka. Adam ingin pergi ke pantai atau ke pegunungan, sedangkan Budi ingin
        // pergi ke pantai atau ke danau. Jika Adam pergi ke pantai dan Budi pergi ke
        // danau, maka mereka akan memilih tempat berbeda. Namun, jika salah satu dari
        // mereka memilih tempat yang sama, maka mereka akan pergi bersama. Jika Adam
        // memilih ke pantai dan Budi ke danau, apa yang akan terjadi?
        System.out.println("====== Soal No 1 ======");
        // boolean pantai, danau, pegunungan, pergi;
        // String berangkat;
        // pantai = true;
        // pegunungan = false;
        // danau = false;
        // pergi = (pantai || danau);
        // berangkat = (pergi) ? "Tetap" : "Tidak";
        // System.out.println(
        // "Jika Adam memilih pergi ke pantai sedangkan Budi memilih pergi ke danau maka
        // mereka akan = "
        // + berangkat + " pergi bersama");

        // jawaban asli
        boolean pantai = true;
        boolean danau = true;
        boolean pergi = (pantai || danau);
        String berangkat = (pergi) ? "Tetap" : "Tidak";
        System.out.println("Jika Adam memilih pergi ke pantai dan Budi memilih pergi ke danau maka mereka akan = "
                + berangkat + " pergi bersama");

        // Soal 2 (Operasi Logika AND): Dua sahabat, Cinta dan Dina, berencana untuk
        // belanja baju. Mereka sepakat bahwa mereka akan belanja jika uang mereka
        // mencukupi dan cuaca bagus. Jika uang Cinta mencukupi tetapi cuaca buruk, atau
        // jika uang Dina mencukupi tetapi cuaca bagus, mereka tidak akan belanja.
        // Bagaimana jika uang Cinta dan Dina mencukupi, tetapi cuaca buruk?
        System.out.println("====== Soal No 2 ======");
        // boolean CuacaBaik, CuacaBuruk, uangCukup, UangTidakCukup, berangkat2;
        // CuacaBaik = true;
        // CuacaBuruk = false;
        // uangCukup = true;
        // UangTidakCukup = false;
        // berangkat2 = (uangCukup == CuacaBaik) && (uangCukup == CuacaBuruk);
        // berangkat = (berangkat2) ? "Tetap berangkat" : "Tidak jadi berangkat";
        // System.out.println(
        // "Apakah Cinta dan Dina tetap berangkat dengan keadaan Uang Cukup dan Cuaca
        // yang buruk = "
        // + berangkat);

        // jawaban asli
        boolean uangCukup = true;
        boolean cuacaBaik = true;
        boolean cuacaBuruk = false;
        boolean berangkat1 = (uangCukup && cuacaBaik && cuacaBuruk);
        String keputusan = (berangkat1) ? "Tetap berangkat" : "Tidak jadi berangkat";
        System.out.println("Apakah Cinta dan Dina tetap berangkat dengan keadaan Uang Cukup dan Cuaca yang buruk = "
                + keputusan);

        // Soal 3 (Operasi Logika XOR): Tiga saudara, Edo, Farah, dan Gina, bermain
        // tebak-tebakan. Jika Edo dan Farah benar dalam menebak, atau jika Gina dan
        // Farah benar, maka mereka akan menang. Namun, jika hanya satu saudara yang
        // benar dalam menebak, maka mereka akan kalah. Bagaimana jika hanya Edo yang
        // benar dalam menebak?
        System.out.println("====== Soal No 3 ======");
        // jawaban asli
        boolean edo = true;
        boolean farah = false;
        boolean gina = false;
        boolean menang = (edo ^ farah) || (gina ^ farah);
        String hasil = (menang) ? "Menang" : "Kalah";
        System.out.println("Hasil bermain tebak-tebakan: " + hasil);

        // Soal 4 (Kombinasi Operasi Logika): Empat teman, Halim, Indra, Joko, dan Kiki,
        // akan berkumpul di sebuah kafe. Mereka akan berkumpul jika jumlah mereka genap
        // dan jika cuaca cerah. Jika jumlah mereka ganjil, atau jika cuaca hujan,
        // mereka tidak akan berkumpul. Bagaimana jika jumlah mereka genap tetapi cuaca
        // hujan?
        System.out.println("====== Soal No 4 ======");
        // int[] genap ={
        // 2, 4
        // };
        // int [] ganjil = {
        // 1, 3
        // };
        // boolean cuacaCerah, cuacaHujan, Brangkat;
        // cuacaCerah = true;
        // cuacaHujan = false;
        // Brangkat = (cuacaCerah == genap[1]) && (cuacaHujan == genap[1]);

        // jawaban asli
        int[] genap = { 2, 4 };
        boolean cuacaCerah = true;
        boolean cuacaHujan = false;
        boolean berkumpul = (genap.length % 2 == 0) && cuacaHujan;
        String hasil1 = (berkumpul) ? "Berkumpul" : "Tidak berkumpul";
        System.out.println("Apakah mereka akan berkumpul jika jumlah mereka genap dan cuaca hujan? " + hasil1);
    }
}
