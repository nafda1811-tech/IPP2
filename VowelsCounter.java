package org.example;

import java.util.Scanner;

public class VowelsCounter {
    public static void main(String[] args) {
        System.out.println("Программа для подсчета гласных.");
        // Создание Scanner для чтения ввода
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Вызываем новый метод
        int count = countVowels(input);

        System.out.println("Количество гласных в строке: " + count);
    }

    // МЕТОД, КОТОРЫЙ БУДЕТ ПЕРЕНЕСЕН ЧЕРЕЗ CHERRY-PICK
    public static int countVowels(String str) {
        if (str == null) return 0;
        int count = 0;
        // Переводим строку в нижний регистр, чтобы считать и 'A', и 'a'
        String lowerStr = str.toLowerCase();
        String vowels = "ауоыиэяюёеaeiouy"; // Гласные русского и английского алфавитов

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}