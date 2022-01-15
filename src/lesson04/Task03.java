package lesson04;

import java.util.HashMap;
import java.util.Map;

/**
 * Создайте набор пар арабское – римское O, I, V, X, L, C
 * Напишите метод по переводу арабских чисел от 0 до 100 в римские используя данную мапу.
 */
public class Task03 {

    private static final Map<Integer, String> ARABIC_ROME_MAP = fillArabicRomeMap(new HashMap<>());

    private static HashMap<Integer, String> fillArabicRomeMap(HashMap<Integer, String> arabicRomemap) {
        arabicRomemap.put(0, "O");
        arabicRomemap.put(1, "I");
        arabicRomemap.put(5, "V");
        arabicRomemap.put(10, "X");
        arabicRomemap.put(50, "L");
        arabicRomemap.put(100, "C");
        return arabicRomemap;
    }

    public String convertArabicToRomeNumber(int arabicNumber) {

        StringBuilder romeNumber = new StringBuilder();

        if (arabicNumber == 0) {
            romeNumber.append(ARABIC_ROME_MAP.get(0));
            return romeNumber.toString();
        }

        while (arabicNumber >= 100) {
            romeNumber.append(ARABIC_ROME_MAP.get(100));
            arabicNumber -= 100;
        }

        while (arabicNumber >= 90) {
            romeNumber.append(ARABIC_ROME_MAP.get(10));
            romeNumber.append(ARABIC_ROME_MAP.get(100));
            arabicNumber -= 90;
        }

        while (arabicNumber >= 50) {
            romeNumber.append(ARABIC_ROME_MAP.get(50));
            arabicNumber -= 50;
        }

        while (arabicNumber >= 40) {
            romeNumber.append(ARABIC_ROME_MAP.get(10));
            romeNumber.append(ARABIC_ROME_MAP.get(50));
            arabicNumber -= 40;
        }

        while (arabicNumber >= 10) {
            romeNumber.append(ARABIC_ROME_MAP.get(10));
            arabicNumber -= 10;
        }

        while (arabicNumber >= 9) {
            romeNumber.append(ARABIC_ROME_MAP.get(1));
            romeNumber.append(ARABIC_ROME_MAP.get(10));
            arabicNumber -= 9;
        }

        while (arabicNumber >= 5) {
            romeNumber.append(ARABIC_ROME_MAP.get(5));
            arabicNumber -= 5;
        }

        while (arabicNumber >= 4) {
            romeNumber.append(ARABIC_ROME_MAP.get(1));
            romeNumber.append(ARABIC_ROME_MAP.get(5));
            arabicNumber -= 5;
        }

        while (arabicNumber >= 1) {
            romeNumber.append(ARABIC_ROME_MAP.get(1));
            arabicNumber -= 1;
        }

        return romeNumber.toString();
    }
}
