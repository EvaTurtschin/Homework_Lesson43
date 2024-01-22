package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework {
    /*
    1. Eсть текстовый файл ***:
Нужно написать метод, принимающий файл и возвращающий сумму всех значений.
    2. Есть текстовый файл ***:
Написать метод, принимающий текстовый файл, состоящий из нескольких строчек
разной длины и возвращающий самую длинную строчку.
     */
    public static void main(String[] args) {

    File file1 = new File ("numbers.txt");
       System.out.println(countTheSumOfNumbers(file1));

    File file2 = new File ("textStrings.txt");
        System.out.println(findLongestString(file2));
    }

    public static int countTheSumOfNumbers (File numbers){
        int result = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(numbers))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                result += Integer.parseInt(string);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static String findLongestString (File textStrings) {
        String result = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(textStrings))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                if(string.length()>result.length()) {
                    result = string;
                }
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
