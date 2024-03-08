package TipeData.primitif;

public class KonversiPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;

        short iniShort = iniInteger.shortValue();
        byte iniByte = iniInteger.byteValue();

        System.out.println(iniByte);
        System.out.println(iniShort);
    }
}
