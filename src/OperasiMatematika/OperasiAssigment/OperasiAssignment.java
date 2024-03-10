package OperasiMatematika.OperasiAssigment;

public class OperasiAssignment {
    public static void main(String[] args) {
        // Operasi Assignment adalah operator aritmatika yang lebih ringkas dibandingkan menggunakan operator aritmatika

        // yang awalnya harus menggunakan penulisan yang berulangan contoh
        int uang = 10;
        uang = uang + 20;
        // nah penulisan seperti itu tidak efektif dikarenakan menulis berulang kali, maka harus menggunakan operator assignment
        uang += 20;
        System.out.println(uang);;

        // Penjumlahan
        int a = 10;
        a += 5; // jika di konversikan ke operator aritmatika maka (a = a + 5);
        System.out.printf("nilai dari penjumalahan : %d\n", a);

        // Pengurangan
        int b = 100;
        b -= 10; // jika di konversikan ke operator aritmatika maka (a = a - 10);
        System.out.printf("nilai dari pengurangan : %d\n", b);

        // Pembagian
        int c = 100;
        c /= 20; // jika di konversikan ke operator aritmatika maka (a = a / 20);
        System.out.printf("nilai dari pembagian : %d\n", c);

        // Perkalian
        int d = 10; // jika di konversikan ke operator aritmatika maka (a = a * 10);
        d *= 10;
        System.out.printf("nilai dari perkalian : %d\n", d);

        // Modulus
        int e = 200; // jika di konversikan ke operator aritmatika maka (a = a % 200);
        e %= 34;
        System.out.printf("nilai dari modulus : %d\n", e);
    }
}
