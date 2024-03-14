package TipeData;

public class konversiTipedata {
    public static void main(String[] args) {
        // Ini adalah tipe data yang akan dibuat konversi

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        byte iniInt2 = 100;
        int iniByte2 = (byte)(iniInt2);

        System.out.println(iniByte2);
    }
}
