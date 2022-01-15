package lesson05;

public class Calculator {

    public static long plus(int argument1, int argument2) {
        return argument1 + argument2;
    }
    public static String plus(int argument1, String argument2) {
        long amount = argument1 + RomeArabicConvertor.romanToArabic(argument2);
        return RomeArabicConvertor.arabicToRoman(amount);
    }
    public static String plus(String argument1, String argument2) {
        long amount = RomeArabicConvertor.romanToArabic(argument1) + RomeArabicConvertor.romanToArabic(argument2);
        return RomeArabicConvertor.arabicToRoman(amount);
    }
}
