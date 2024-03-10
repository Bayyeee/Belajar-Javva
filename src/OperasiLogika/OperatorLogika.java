package OperasiLogika;

public class OperatorLogika {
    public static void main(String[] args) {
        // Operasi Logika biasanya menggunakan Boolean
        // dalam operasi logika boolean bisa digunakan dalam bentuk operasi matematika, yang dimana true =1 dan false = 0, untuk hasil dari operasi matematika tersebut juga menghasilkan dalam bentuk boolean juga
        
        /* Operasi Matematika untuk Operasi Logika Boolean
         * Jika menggunakan Penjumlahan maka disebut dengan (OR) dengan simbol (||)
         * Jika menggunakan Perkalian maka disebut dengan (AND) dengan simbol (&&)
         * Jika menggunakan Boolean yang sama dalam 1 variabel maka dianggap sesuai dengan value dari variabel tersebut, ini disebut (XOR)
         * Jika menggunakan Negasi atau Operator Penegasan, yang mana misalkan variable a = true, dan diberikan negasi maka akan dianggap false, dengan simbol (!)
         */

        boolean a, b, c;
        /*
         * ini adalah contoh dari operasi logika OR
         */
        System.out.println("==== OR (||) ====");
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + "\t = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + "\t = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + "\t = " + c);
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + "\t = " + c + "\n");

        /*
         * ini adalah contoh dari operasi logika AND
         */
        System.out.println("==== AND (&&) ====");
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + "\t = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + "\t = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + "\t = " + c);
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + "\t = " + c + "\n");

        /*
         * ini adalah contoh dari operasi logika XOR
         */
        System.out.println("==== XOR (^) ====");
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "\t = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "\t = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "\t = " + c);
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + "\t = " + c + "\n");

        /*
         * ini adalah contoh dari operasi logika NOT
         */
        System.out.println("==== NOT (!) ====");
        a = true;
        c = !a;
        System.out.println("Nilai dari NOT " + a + " adalah = " + c);

        b = false;
        c = !b;
        System.out.println("Nilai dari NOT " + b + " adalah = " + c);
    }
}
