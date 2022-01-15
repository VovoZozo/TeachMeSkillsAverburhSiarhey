package lesson5;

public class RomeArabicConvertor {
    private static final String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] ARABIC_NUMERALS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public static int romanToArabic(String roman) {
        int result = 0;
        if (roman.startsWith("O")) {
            return result;
        }
        for (int i = 0; i < ROMAN_NUMERALS.length; i++) {
            while (roman.startsWith(ROMAN_NUMERALS[i])) {
                result += ARABIC_NUMERALS[i];
                roman = roman.substring(ROMAN_NUMERALS[i].length());
            }
        }
        return result;
    }

    public static String arabicToRoman(long arabic) {
        if (arabic >= 0) {
            return arabicToRomanAlgorithm(arabic);
        } else {
            return "-" + arabicToRomanAlgorithm(Math.abs(arabic));
        }
    }
    private static String arabicToRomanAlgorithm(long arabic) {
        StringBuilder arabicNumber = new StringBuilder();
        if (arabic == 0) {
            arabicNumber.append("O");
            return arabicNumber.toString();
        }
        for (int i = 0; i<ROMAN_NUMERALS.length; i++) {
            while (arabic >= ARABIC_NUMERALS[i]) {
                arabicNumber.append(ROMAN_NUMERALS[i]);
                arabic -= ARABIC_NUMERALS[i];
            }
        }
        return arabicNumber.toString();
    }
}
