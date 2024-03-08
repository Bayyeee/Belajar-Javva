package TipeData.nonPrimitif;

public class tipeDataArray {
public static void main(String[] args) {
        // contoh 1 pembuatan array 1
        Integer[] arrayNumber;
        arrayNumber = new Integer[10];
        arrayNumber[0] = 1;
        arrayNumber[1] = 2;
        arrayNumber[2] = 3;
        arrayNumber[3] = 4;
        arrayNumber[4] = 5;
        arrayNumber[5] = 6;
        arrayNumber[6] = 7;
        arrayNumber[7] = 8;
        arrayNumber[8] = 9;
        arrayNumber[9] = 10;

        // Contoh 2 pembuatan array
        String[] arrayString2 = new String[4];
        arrayString2[0] = "Udin";
        arrayString2[1] = "Safarudin";
        arrayString2[2] = "Syamsudin";
        arrayString2[3] = "Fahrudin";

        // contoh 3 pembuatan array
        int[] arrayInt = new int[]{
                10, 20, 30, 40, 50
        };

        // contoh 4 pembuatan array
        long[] arrayLong = {
                10L, 20L, 30L, 40L, 50L
        };

        // mengubah data pada array (tipe data primitif)
        arrayLong[2] = 15L;

        // mengubah data menjadi nol pada tipe data primitif
        arrayLong[1] = 0;

        // mengubah data pada array (tipe data non primitif)
        arrayString2[0] = "markomar";

        // mengubah data menjadi null pada tipe data non primitif
        //        arrayString[0] = null;


        // Menampilkan array
        System.out.println(arrayNumber[0] + ". " + arrayString2[0]);
        System.out.println(arrayNumber[1] + ". " + arrayString2[1]);
        System.out.println(arrayNumber[2] + ". " + arrayString2[2]);
        System.out.println(arrayNumber[3] + ". " + arrayString2[3]);

        // menampilkan panjang array
        System.out.println(arrayLong.length);

        int[] arrayInteger = {
        123, 124, 125
        };

        System.out.println(arrayInteger[0]);
}
}
