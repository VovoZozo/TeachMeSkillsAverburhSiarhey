package lesson06;

/*
 * Из файла, в котором записаны числа (в диапозоне байт) считывать все значения
 * до тех пор, пока не считает значение «-1» включительно,
 * и вывести на экран сумму всех значений.
 * Использовать метод “int read()”
 */

import java.io.*;

public class Task02 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("res/lesson06/numbersToTask02.txt")) {
            int i;
            int number = 0;
            int result = 0;
            StringBuilder sb = new StringBuilder();
            while ((i = fis.read()) != -1) {
                if ((char) i != ' ') {
                    sb.append((char) i);
                } else {
                    number = Integer.parseInt(sb.toString());
                    if (number != -1) {
                        result += number;
                        sb.setLength(0);
                    } else {
                        result += number;
                        sb.setLength(0);
                        break;
                    }
                }
            }
            try {
                number = Integer.parseInt(sb.toString());
                result += number;
            } catch (NumberFormatException ex) {
            }
            if (number != -1) result--;
            System.out.println(result);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
