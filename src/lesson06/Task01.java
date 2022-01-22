package lesson06;

import java.io.*;

public class Task01 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("res/lesson06/numbers.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("res/lesson06/result.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                bw.write((long)Integer.parseInt(s) * 10 + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
