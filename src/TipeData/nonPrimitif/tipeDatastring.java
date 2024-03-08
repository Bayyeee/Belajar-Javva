package TipeData.nonPrimitif;
public class tipeDatastring {
    public static void main(String[] args) {
        // ini contoh tipe data string
        String namaAwal; // jika tidak ada datanya maka dianggap null;
        String namaAkhir;
        namaAwal = "Udin";
        namaAkhir = "Jusep";

        // penggabungan string
        String fullName = namaAwal + " " + namaAkhir;

        System.out.println(namaAwal);
        System.out.println(namaAkhir);
        System.out.println(fullName);

        // menggunakan printf
        System.out.printf("nama awal saya adalah %s\nsedangkan nama akhir saya adalah %s\nJika digabung menjadi %s%s\n", namaAwal, namaAkhir, namaAwal, namaAkhir);

    }
}
