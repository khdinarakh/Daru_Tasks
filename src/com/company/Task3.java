package com.company;

public class Task3 {
    public void workWithType (){
        //Создайте переменную с именем flowersName и присвойте ей значение Roses.
        String flowersName = "Roses";
        //Создайте переменную с именем flowersNumber и присвойте ей значение 101.
        int flowersNumber = 101;
        //Выведите значения переменных flowersName и flowersNumber в консоль.
        System.out.println("Name of flowers: " + flowersName + " " + "Number of flowers: " + flowersNumber);
        //Выведите на экран сумму 15 + 10, используя две переменные: a и b.
        int a = 15, b = 10;
        System.out.println(a + b);
        //Создайте переменную c, присвойте ей a + b и выведите результат.
        int c = a + b;
        System.out.println(c);
        //Создайте три переменные одного типа, используя список, разделенный запятыми, и присвойте им разными значения. Выведите сумму трех переменных в консоль.
        int firstNum = 3, secondNum = 4, thirdNum = 5;
        System.out.println("Sum of three number: " + (firstNum + secondNum + thirdNum));
        //Создайте четыре переменных одного типа, используя список, разделенный запятыми,  и присвойте им одно значение. Выведите сумму четырех переменных в консоль.
        int numFirst = 3, numSecond = 3, numThird = 3, numFourth = 3;
        System.out.println(numFirst + numSecond + numThird + numFourth);

        //Объявите переменную типа double, но не инициализируйте ее. Присвойте ей значение позже. Перезапишите существующее значение переменной.
        double number;
        number = 4.5;
        number = 4.0;
        System.out.println("Change number: " + number);
        //Создайте константы со значениями числа PI, ускорения свободного падения, наименования родного города.
        final double PI = 3.14;
        final double g = 9.82;
        final String city = "Astana";

        //Создайте переменные типа byte, short, int, long, double, float, boolean, char, String, и выведите каждое значение в консоль.
        byte numByte = 10;
        System.out.println("Byte number: " + numByte);
        short numShort = 100;
        System.out.println("Short Number: " + numShort);
        int numInt = 1000;
        System.out.println("Int Number: " + numInt);
        long numLong = 10L;
        System.out.println("Long Number: " + numLong);
        double numberDouble = 6.7;
        System.out.println("Double Number: " + numberDouble);
        float numberFloat = 4.5F;
        System.out.println("Flout Number: " + numberFloat);
        boolean bool = true;
        System.out.println("Is True? " + bool);
        char chatA = 'A';
        System.out.println("Char Number: " + chatA);
        String stringWord = "ttt";
        System.out.println("String: " + stringWord);

        //Приведите пример расширяющего приведения
        short smallNumber = 4;
        int bigNumber = smallNumber;
        //Приведите пример сужающего приведения
        long LargeType = 4;
        int smallType = (int)LargeType;
        int x = 5;
        int y = x >> 5;
        System.out.println(y);
    }
}
