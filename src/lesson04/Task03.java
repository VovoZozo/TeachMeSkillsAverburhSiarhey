package lesson04;

import java.util.HashMap;
import java.util.Map;
/**
 * Создайте набор пар арабское – римское O, I, V, X, L, C
 * Напишите метод по переводу арабских чисел от 0 до 100 в римские используя данную мапу.
 */
public class Task03 {

    private static final Map<Integer, String> ARABIC_ROME_MAP;
    static {
        ARABIC_ROME_MAP = new HashMap<>();
        ARABIC_ROME_MAP.put(0, "O");
        ARABIC_ROME_MAP.put(1, "I");
        ARABIC_ROME_MAP.put(5, "V");
        ARABIC_ROME_MAP.put(10, "X");
        ARABIC_ROME_MAP.put(50, "L");
        ARABIC_ROME_MAP.put(100, "C");
    }

    private static final int[][][] FORMULA = {{}, {{0, 1, 0}}, {{0, 2, 0}}, {{0, 3, 0}}, {{0, 1, 1}, {0, 1, 0}}, {{0, 1, 1}},
            {{0, 1, 0}, {0, 1, 1}}, {{0, 2, 0}, {0, 1, 1}}, {{0, 3, 0}, {0, 1, 1}}, {{1, 1, 0}, {0, 1, 0}}};

    private static final String[][] ROME_ELEMENTS_GROUPS = {{ARABIC_ROME_MAP.get(1), ARABIC_ROME_MAP.get(5)},
            {ARABIC_ROME_MAP.get(10), ARABIC_ROME_MAP.get(50)},
            {ARABIC_ROME_MAP.get(100), ""}};

    public String convertArabicToRomeNumber(int romeNumber) {
        StringBuilder arabicNumber = new StringBuilder();
        if (romeNumber == 0) {
            arabicNumber.append(ARABIC_ROME_MAP.get(0));
            return arabicNumber.toString();
        }
        String[] convertedNumber = Integer.toString(romeNumber).split("");
        int[] splitArabicNumber = new int[convertedNumber.length];
        for (int i = 0; i < splitArabicNumber.length; i++) {
            splitArabicNumber[i] = Integer.parseInt(convertedNumber[i]);
        }
        int numberPosition = splitArabicNumber.length - 1;
        for (int element : splitArabicNumber) {
            int[][] convertFormula = FORMULA[element];
            StringBuilder romeElement = new StringBuilder();
            for (int[] a : convertFormula) {
                int quantity = a[0];
                int repeat = a[1];
                int place = a[2];
                String[] symbolMas = ROME_ELEMENTS_GROUPS[numberPosition + quantity];
                String symbol = symbolMas[place];
                while (repeat > 0) {
                    romeElement.append(symbol);
                    repeat--;
                }
            }
            arabicNumber.append(new StringBuilder(romeElement.toString()).reverse());
            numberPosition--;
        }
        return arabicNumber.toString();
    }
}
