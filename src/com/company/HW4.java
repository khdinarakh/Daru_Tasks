package com.company;

import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {

        //Напишите программу для умножения 10 на 5 и вывода результата в консоль.
        int a = 10, b = 5;
        int c = a * b;
        System.out.println(c);

        //Напишите программу для деления 20 на 2.5 и вывода результата в консоль.
        int numA = 20;
        double numB = 2.5;
        double result = numA / numB;
        System.out.println(result);

        //Длина и ширина прямоугольника равны 15 и 9 соответственно. Напишите программу для вычисления площади и периметра прямоугольника.
        int length = 15, width = 9;
        int S = length * width;
        int P = 2 * (length + width);
        System.out.println("Area: " + S + "; Perimeter:" + P);

        //Используйте правильный оператор, чтобы увеличить значение переменной x на 1 с помощью префиксной и постфиксной форм. Выведите на экран результат.
        int x = 0;
        System.out.println("Using prefix: " + x++); // It will add one after executing
        System.out.println("The result prefix: " + x); // After execution
        System.out.println("Using postfix: " + ++x); // It will increment during the execution
        System.out.println("The result postfix: " + x); // the same result

        //Используйте оператор присваивания сложения, чтобы добавить значение 5 к переменной x.
        x += 5;
        System.out.println("x+=5 is: " + x);

        //Напишите программу для проверки равенства двух чисел 25 и 43.
        int num1 = 25, num2 = 43;
        System.out.println(num1 == num2 ? "It is equal" : "Wrong! It is not equal!");

        //Даны две переменные a и b, значения которых равны 10 и 5 соответственно. Напишите программу для сложения, вычитания, умножения, деления, деления по модулю двух переменных.
        int a1 = 10, b2 = 5;
        int adding = a1 + b2;
        System.out.println("Adding: " + adding);
        int deleting = a1 - b2;
        System.out.println("Deleting: " + deleting);
        double dividing = a1 / b2;
        System.out.println("Dividing: " + dividing);
        int multiplying = a1 * b2;
        System.out.println("Multiplying: " + multiplying);
        int remainder = a1 % b2;
        System.out.println("Remainder: " + remainder);

        //Напишите программу для преобразования градусов Фаренгейта в градусы Цельсия.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input F, we will convert it to C: ");
        double input = scanner.nextDouble();
        double converting = (input - 32) * 5/9;
        System.out.println("Celsius: " + converting);

        // Напишите программу, которая прибавляет 10 к числу 451, а затем делит его на 3. Теперь к модулю результата прибавляется 5, а затем полученное значение умножается на 5. Выведите на экран окончательный результат.
        System.out.println((((10 + 451) % 3 ) + 5 ) * 5 );


        //Даны две переменные a и b, значения которых равны 65 и 80 соответственно. Напишите программу, чтобы проверить, верны ли оба условия 'a < 50' и 'a < b'.
        int a2 = 65, b3 = 80; //'a < 50' и 'a < b'.
        System.out.println(a2 < 50 ? "Correct!" : "Wrong!");
        System.out.println(a2 < b3 ? "Correct!" : "Wrong!");

    }
}