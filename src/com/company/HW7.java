package com.company;

import java.nio.charset.StandardCharsets;

public class HW7 {

    public int countCapitalLetter(String text) {
        byte[] ascii = text.getBytes(StandardCharsets.US_ASCII);
        int count = 0;
        // ASCII 65 -90  capital letters
        System.out.println(text.length());
        for (int i = 0; i < text.length(); i++) {
            if (ascii[i] > 65 && ascii[i] < 90) {
                count++;
            }
        }
        return count;
    }
    /*
    * 1. Напишите метод для нахождения наименьшего числа среди трех чисел.
    Дано:
        Первое число: 25
        Второе число: 37
        Третье число: 29
        Ожидаемый результат:
        Наименьшее значение: 25 */

    public int findMinThreeNum(int first, int second, int third) {
        int min = first;
        if (min > second) {
            min = second;
        }

        if (min > third) {
            min = third;
        }
        return min;
    }




    /* 2. Напишите метод для вычисления среднего значения трех чисел.
            Дано:
            Первое число: 25
            Второе число: 45
            Третье число: 65

            Ожидаемый результат:
            Среднее значение 45,0*/

    public double findAvgThreeNum(int first, int second, int third) {
        return (first + second + third) / 3;
    }



        /* 3. Напишите метод подсчета всех гласных букв в строке.
            Дано:
            DarTech123

            Ожидаемый результат:
            Количество гласных в строке: 2 */

    public int countVowels(String word) {
        int count = 0;
        String str = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char wordChar = str.charAt(i);
            if (isVowel(wordChar)) {
                count++;
            }
        }
        return count;
    }



       /*
         4. Напишите метод для подсчета всех слов в строке.
             Дано:
             Введите строку: Java is good to learn Object Oriented programming.
             Ожидаемый результат:
             Количество слов в строке: 8 */

    public int countWords(String words) {
        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            char textChar = words.charAt(i);
            if (textChar == ' ' || textChar == '.' || textChar == '!' || textChar == '?') {
                count++;
            }
        }
        return count;
    }

    public int countWordsSplit(String words) {
        String[] wordSplit = words.split(" ");
        return wordSplit.length;
    }

    /*
      5. Дано целое неотрицательное число. Напишите метод для подсчета количества цифр числа, имеющих значение 2.
        Дано
        1254212
        Ожидаемый результат:
        3
     */

    public int countDigitInNumber(int number, char value) {
        int count = 0;
        char[] convertedChar = convertIntToCharArr(number);
        for (int i = 0; i < convertedChar.length; i++) {
            if (convertedChar[i] == value) {
                count++;
            }
        }
        return count;
    }


    /*
   5. Напишите метод, который проверяет, все ли символы в заданной строке являются гласными (a, e, i, o, u) или нет. Верните true, если каждый символ строки является гласным, иначе верните false.
        Дано:
        AIEEE
        Ожидаемый результат:
        true */
    public boolean isAllLetterVowel(String str) {
        String word = str.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!isVowel(ch))
                return false;
        }
        return true;
    }

    //second option I searched from the Internet, because I wanna code more shortly

    public boolean isAllVowelMatches(String str) {
        return str.matches("[aeiou*]");
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


    /*
        6. Напишите метод для определения площади пятиугольника.
        Дано:
        Количество сторон: 5
        Длина стороны: 6
        Ожидаемый результат:
        Площадь пятиугольника равна 61,937   */

    public double calculateAreaRegularPolygon(int n, int length) {
        return (n * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / n));
    }


        /*
            7. Напишите метод для вычисления суммы цифр целого числа.
            Дано:
            252
            Ожидаемый результат:
            Сумма = 9*/


    public int calculateSumDigitsNumber(int number) {
        int[] numArr = convertCharArrToIntArr(convertIntToCharArr(number));
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
            System.out.println(numArr[i]);
        }
        return sum;
    }

    public int[] convertCharArrToIntArr(char[] digits) {
        int[] numArr = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            numArr[i] = Character.getNumericValue(digits[i]);
        }
        return numArr;
    }

    public char[] convertIntToCharArr(int number) {
        String s = Integer.toString(number);
        char[] ch = s.toCharArray();
        return ch;
    }

    // for future numberStr.charAt(i) - '0'   For example, the ASCII code for the character
    // '0' is 48, and the ASCII code for the character '2' is 50. When you subtract '0' from '2',
    // you get 2, which is the integer value of the digit 2.

}
