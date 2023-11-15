package com.company;

import java.awt.geom.Arc2D;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

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

    //допы

    //Написать метод findMax, который принимает массив целых чисел и возвращает максимальный элемент в массиве.
    public int findMax2DArr(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public int findMaxArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    //Написать метод formatTime, который принимает количество секунд и возвращает строку, представляющую время в формате часов, минут и секунд (HH:mm:ss).
    public String formatTime(int sec) {  // sec / 60 == minute    hour = minute / 60
        if (sec < 0) {
            return "Sec cannot be negative";
        }

        int hour;
        int minute;
        hour = sec / 3600; // 2
        minute = (sec % 3600) / 60; //40
        sec = sec - ((hour * 3600) + (minute * 60));
        String hh = Integer.toString(hour);
        String mm = Integer.toString(minute);
        String ss = Integer.toString(sec);
        String timeHMS = hh + ":" + mm + ":" + ss;
        return timeHMS;
    }

    //Написать метод isPalindrome, который принимает строку и возвращает true, если строка является палиндромом (читается одинаково в обоих направлениях), и false в противном случае.
    public boolean isPalindrome(String word) {
        boolean isPalindrome = false;
        int length = word.length();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(length - 1)) {
                isPalindrome = true;
                length--;
            } else {
                return false;
            }
        }
        return isPalindrome;
    }

    //Написать метод findGCD, который принимает два целых числа и возвращает их НОД.
    // {2, 2, 2, 3 ,4 ,5 }   {2, 2 ,3 ,5 }

    public int findGCD (int num1, int num2) {
        int greatCD = 1;
        int min = Math.min(num1, num2);
        for (int i = 2; i <= min; i++) {
            if ((num1 % i == 0) && (num2 % i == 0)){
                greatCD = i;
            }
        }
        return greatCD;
    }



    //Написать перегруженные методы printArray, которые принимают и выводят на экран массив, независимо от типа (для int[], double[] и char[]).
    public void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    //Написать метод getDaysInMonth, который принимает два параметра: month и year (месяц и год) и возвращает количество дней в этом месяце, учитывая високосные годы.

    public int getDaysInMonth (int year, int month){ //1,3,5,7,8,10,12 // 4, 6, 9, 11
        int day;
        if (month == 4 || month == 6 || month == 9 || month == 11){
            day = 30;
        } else if (isLeapYear(year) && month == 2){
            day = 29;
        }else if (!isLeapYear(year) && month == 2){
            day = 28;
        }else {
            day = 31;
        }
        return day;
    }

    public boolean isLeapYear(int year) {
        boolean leapYear = false;
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }
        return false;
    }

    //Написать метод calculateDistance, который принимает координаты двух точек (x1, y1) и (x2, y2) на плоскости и возвращает расстояние между ними.
    public double calculateDistance(double[] firstCoordinate, double[] secondCoordinate) {
        return Math.sqrt(Math.pow(firstCoordinate[0] - secondCoordinate[0], 2) + Math.pow(firstCoordinate[1] - secondCoordinate[1], 2));
    }


    // recursion
    //Дополнительные задачи:
    //Напишите рекурсивную функцию для печати чисел от 1 до N в порядке возрастания.

    public String returnNumberASC (int n){
        if (n == 1) {
            return "1";
        } else {
            return returnNumberASC(n - 1) + " " + n;
        }
    }

    //just for me understanding
    public String returnNumberDESC(int n){
        if (n == 1) {
            return "1";
        } else {
            return n + " " + returnNumberASC(n - 1) + " " ;
        }
    }

    // on workshop
    public void printToN(int n){
        if(n > 1){
            printToN(n - 1);
        }
        System.out.println(n);
    }
    //Напишите рекурсивную функцию для вычисления N-го числа Фибоначчи. N-ое число Фибоначчи определяется как сумма двух предыдущих чисел Фибоначчи.
    public int fibonacci(int n){
        if (n == 1 || n == 0){
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    //Напишите рекурсивную функцию для вычисления числа x в степени n, где n - неотрицательное целое число.

    public int pow (int x, int n){
        if (n == 0) {
            return 1;
        }else {
            return x * pow(x, n - 1);
        }
    }

    //Напишите рекурсивную функцию для поиска наибольшего элемента в массиве целых чисел.

    public int max (int[] arr,int i, int max) {
        if (i == arr.length){
            return max;
        }
        if (arr[i] > max){
            max = arr[i];
        }
        return max(arr, i + 1, max);
    }



    //Напишите рекурсивную функцию для вычисления суммы элементов в массиве целых чисел.


    public int sumArr (int[] arr, int i, int sum){
        if (arr.length == i)
            return sum;
        sum += arr[i];
        return sumArr(arr, i + 1, sum);
    }

}
