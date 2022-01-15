package lesson02;

public class Task01 {
    public static void main(String[] args) {

        int numberInt = 2147483547;
        short numberShort = -12323;
        byte numberByte = 2;

        System.out.println("int");
        System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("MIDDLE_VALUE: " + ((double) Integer.MIN_VALUE + Integer.MAX_VALUE)/2 + '\n');

        System.out.println("short");
        System.out.println("MAX_VALUE: " + Short.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Short.MIN_VALUE);
        System.out.println("MIDDLE_VALUE: " + ((double) Short.MIN_VALUE + Short.MAX_VALUE)/2 + '\n');

        System.out.println("byte");
        System.out.println("MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Byte.MIN_VALUE);
        System.out.println("MIDDLE_VALUE: " + ((double) Byte.MIN_VALUE + Byte.MAX_VALUE)/2 + '\n');

    }
}
