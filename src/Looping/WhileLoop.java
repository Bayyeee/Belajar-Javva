package Looping;

public class WhileLoop {
    public static void main(String[] args){

        int a = 1;
        // menggunakan Operator Komparasi
        while (a <= 5) {
            System.out.println("Nilai ke-" + a);
            a++;
        }
        System.out.println("====== Akhir Program ======");
        
        // menggunakan If Else
        boolean kondisi = true;
        while (kondisi) {
            System.out.println("While Loop ke-" + a);
            if (a++ == 10) {
                kondisi = false;
            }
            a++;
        }
        System.out.println("====== Akhir Program ======");
    }
}
