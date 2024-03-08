package OperasiMatematika;

public class IncrementDecrement {
    public static void main(String[] args) {
        // operator unary digunakan pada satu variabel saja

        // unary menggunakan - dan +
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n", angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n", angka, -angka);
        System.out.println("======================================");

        /* unary decrement dan increment
            -- Decrement adalah pengurangan 1 angka dari variabel ( Notasi yang digunakan adalah ( -- ) )
            -- Increment adalah penambahan 1 angka dari variabel ( Notasi yang digunakan adalah ( ++ ) didalam increment sendiri terdapat prefix dan postfix )
            maksudnya adalah contoh ( ++a = ini adalah prefix dimana angka pada variabel langsung ditambahkan ) ( a++ = ini adalah postfix dimana angka pada variabel akan ditampilkan dulu dan baru akan ditambahkan, jadi ketika ingin menampilkan hasil increment postfix harus menampilkan variabelnya di print an terbaru)
        */

        // INI ADALAH CONTOH UNARY DECREMENT
        int angka1 = 10;
        System.out.println("unary 'decrement (--)' menjadi "  + --angka1);

        // INI ADALAH CONTOH UNARY INCREMENT
        int angka2 = 20;
        System.out.printf("unary 'Increment (Prefix)' (++), %d menjadi %d\n", angka2, ++angka2);
        System.out.printf("unary 'Increment (Postfix)' (++), %d menjadi %d\n", angka2, angka2++);
        System.out.println(angka2);
        System.out.println("========================================");

        // unary boolean dengan notasi ( ! ) sebagai negasi atau penegasan pada pengkondisian
        /*
            unary negasi pada boolean sebagai penegasan terhadap sebuah kondisi, dimana jika yang awalnya kondisi tersebut true maka akan menjadi false jika ditambahkan notasi ( ! ) dan sebaliknya jika disebuah kondisi sudah false ditambahkan notasi ( ! ) maka akan menjadi true
         */
        boolean benar = true;
        System.out.println("Ucup suka makan nasi : " + benar);
        System.out.println("Ucup suka makan nasi : " + !benar);
    }
}
