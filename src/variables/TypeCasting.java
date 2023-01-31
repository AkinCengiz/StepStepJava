package variables;

public class TypeCasting {
    public static void main(String[] args) {
        byte byteNumber1 = Byte.MAX_VALUE;
        short shortNumber1 = byteNumber1;
        short shortNumber2 = Short.MAX_VALUE;
        int intNumber1 = shortNumber2;
        int intNumber2 = Integer.MAX_VALUE;
        long longNumber1 = intNumber2;
        float floatNumber1 = longNumber1;
        double doubleNumber = longNumber1;
        System.out.println("byteNumber\t: "+ byteNumber1);
        System.out.println("shortNumber1\t: "+ shortNumber1);
        System.out.println("shortNumber2\t: "+ shortNumber2);
        System.out.println("intNumber1\t: "+ intNumber1);
        System.out.println("intNumber2\t: "+ intNumber2);
        System.out.println("longNumber1\t: "+ longNumber1);
        System.out.println("floatNumber1\t: "+ floatNumber1);
        System.out.println("doubleNumber1\t: "+ doubleNumber);
        System.out.println("*********************************");
        longNumber1 = 1250000l;
        System.out.println();
        System.out.println("longNumber1\t\t: "+ longNumber1);
        intNumber1 = (int)longNumber1;
        System.out.println("intNumber1\t\t: "+ intNumber1);
        intNumber2 = 25165;
        shortNumber1 = (short) intNumber2;
        System.out.println("shortNumber1\t: "+ shortNumber1);
        shortNumber2 =112;
        byteNumber1 = (byte) shortNumber2;
        System.out.println("byteNumber\t\t: "+ byteNumber1);
    }
}
