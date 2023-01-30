package variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte byteVariable = 22;
        short shortVariable = 23654;
        int intVariable = 10;
        long longVariable = 9_817_893_605L;
        float floatVariable = 3.14f;
        double doubleVariable = 10.50;
        char birHarf = 'e';
        char birSayi = '4';
        boolean isBool = false;

        System.out.println("En Küçük Byte Değeri\t : " + Byte.MIN_VALUE + "\nEn Büyük Byte Değeri\t : " + Byte.MAX_VALUE + "\nByte Boyutu\t\t\t\t : "+Byte.SIZE + " BIT");
        System.out.println("En Küçük Short Değeri\t : " + Short.MIN_VALUE + "\nEn Büyük Short Değeri\t : " + Short.MAX_VALUE + "\nShort Boyutu\t\t\t : "+Short.SIZE + " BIT");
        System.out.println("En Küçük Integer Değeri\t : " + Integer.MIN_VALUE + "\nEn Büyük Integer Değeri\t : " + Integer.MAX_VALUE + "\nInteger Boyutu\t\t\t : "+Integer.SIZE + " BIT");
        System.out.println("En Küçük Long Değeri\t : " + Long.MIN_VALUE + "\nEn Büyük Long Değeri\t : " + Long.MAX_VALUE + "\nLong Boyutu\t\t\t\t : "+Long.SIZE + " BIT");
        System.out.println("En Küçük Float Değeri\t : " + Float.MIN_VALUE + "\nEn Büyük Float Değeri\t : " + Float.MAX_VALUE + "\nFloat Boyutu\t\t\t : "+Float.SIZE + " BIT");
        System.out.println("En Küçük Double Değeri\t : " + Double.MIN_VALUE + "\nEn Büyük Double Değeri\t : " + Double.MAX_VALUE + "\nDouble Boyutu\t\t\t : "+Double.SIZE + " BIT");
        System.out.println("En Küçük Char Değeri\t : " + Character.MIN_VALUE + "\nEn Büyük Char Değeri\t : " + Character.MAX_VALUE + "\nChar Boyutu\t\t\t\t : "+Character.SIZE + " BIT");
        System.out.println("En Küçük Char Değeri\t : " + (int)Character.MIN_VALUE + "\nEn Büyük Char Değeri\t : " + (int)Character.MAX_VALUE + "\nChar Boyutu\t\t\t\t : "+Character.SIZE + " BIT");
        System.out.println("Default Boolean Değeri\t : " + Boolean.FALSE + "\nDiğer Boolean Değeri\t : " + Boolean.TRUE);

    }
}
