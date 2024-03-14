package OperasiBitwise;

public class OperasiBitwise {
    public static void main(String[] args){
        // Operator Bitwise --> operator untuk melakukan operasi pada nilai bit

        byte a = 3;
        byte b;
        byte c;
        String a_bits,  b_bits, c_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        // Operator SHIFT LEFT
        System.out.println("====================== SHIFT LEFT");
        a = 3;
        b = (byte)(a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        // Operator SHIFT RIGHT
        System.out.println("======================= RIGHT LEFT");
        a = 12;
        c = (byte)(a >> 1);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator OR
        System.out.println("======================= BITWISE OR");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("----------------------- OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator AND
        System.out.println("----------------------- AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator XOR
        System.out.println("----------------------- XOR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator NOT
        System.out.println("----------------------- NOT");
        a = 24;
        b = (byte)(~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n", b_bits, b);
    }
}
