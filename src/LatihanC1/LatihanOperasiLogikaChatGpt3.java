package LatihanC1;

public class LatihanOperasiLogikaChatGpt3 {
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
        keterangan = (hasil) ? "Berangkat" : "Tidak berangkat";
        // if (hasil) {
        //     System.out.println("Berangkatt");
        // } else {
        //     System.out.println("Tidak berangkat");
        // }
        System.out.println("Mereka akan : " + keterangan);

        // Soal 2 (Operasi Logika AND): Empat sahabat, David, Elsa, Farhan, dan Gina,
        // sedang merencanakan piknik ke taman bermain. Mereka sepakat bahwa mereka akan
        // pergi jika tiket masuk taman bermain murah dan cuaca cerah. Jika tiket masuk
        // mahal, mereka tidak akan pergi. Bagaimana jika tiket masuk murah tetapi cuaca
        // hujan?
        System.out.println("====== Soal 2 ======");
        boolean tiketmurah, cuacabaik, masuk;
        tiketmurah = true;
        cuacabaik = true;
        masuk = (tiketmurah == cuacabaik) && (tiketmurah == !cuacabaik);
        keterangan = (masuk) ? "Tetap masuk" : "Tidak jadi masuk";
        System.out.println("Mereka akan : " + keterangan);

        // Soal 3 (Operasi Logika XOR): Dua saudara, Rama dan Sita, sedang bermain game.
        // Jika Rama menang dan Sita kalah, atau jika Sita menang dan Rama kalah, maka
        // mereka akan bahagia. Namun, jika keduanya menang atau keduanya kalah, maka
        // mereka akan sedih. Bagaimana jika hanya Rama yang menang?
        System.out.println("====== Soal 3 ======");
        boolean ramaMenang, sitaMenang, game;
        ramaMenang = true;
        sitaMenang = true;
        game = (ramaMenang == !sitaMenang) ^ (!ramaMenang == sitaMenang);
        keterangan = (game) ? "Bahagia" : "Sedih";
        System.out.println("Mereka akan : " + keterangan);

        // Soal 4 (Kombinasi Operasi Logika): Lima teman, Ahmad, Budi, Citra, Dian, dan
        // Eka, akan pergi berenang. Mereka akan pergi jika jumlah mereka ganjil dan
        // suhu air hangat. Jika jumlah mereka genap, atau suhu air dingin, mereka tidak
        // akan pergi. Bagaimana jika jumlah mereka ganjil tetapi suhu air dingin?
        System.out.println("====== Soal 4 ======");
        int [] teman = {1, 2, 3, 4, 5};
        boolean airhangat, berenang;
        airhangat = false;
        berenang = (teman.length % 2 != 0) && airhangat;
        keterangan = (berenang) ? "Tetap berenang" : "Tidak berenang";
        System.out.println("Mereka akan : " + keterangan);

    }
}
