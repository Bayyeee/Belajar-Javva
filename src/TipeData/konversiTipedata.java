package TipeData;

public class konversiTipedata {
    public static void main(String[] args) {
        // Ini adalah tipe data yang akan dibuat konversi

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        System.out.println(iniByte2);
    }
}
