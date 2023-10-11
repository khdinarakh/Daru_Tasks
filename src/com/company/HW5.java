package com.company;

public class HW5 {

    //Напишите программу, чтобы проверить значения длины и ширины прямоугольника и определить, является ли он квадратным или нет.
    public boolean checkRectangle(){
        int length1 = 5, length2 = 5, width1 = 10, width2 = 10;
        boolean checking = false;
        if(length1 == length2 && width1 == width2){
            checking = true;
        }
        else{
            checking = false;
        }
        return checking;
    }

    /*Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
    Если стоимость товара ниже 5000, то стоимость остается без изменений.
    Вычислите и выведите итоговую стоимость покупки для пользователя.*/

    public double addSale(double price){
        if (price > 5000){
            price = price * 1.1;
        }
        else {
            price = price;
        }
        return price;
    }

    /*В университете существуют следующие правила для системы оценок:
        Ниже 25 - F
        От 25 до 45 - E
        От 45 до 50 - D
        От 50 до 60 - C
        От 60 до 80 - B
        Выше 80 - A
    Создайте переменную grade и напечатайте в консоль соответствующую оценку в
    зависимости от значения переменной.*/

    public char printValueGrade(int grade){
        char valGrade;
        if(grade < 25){
            valGrade = 'F';
        }
        else if(grade >= 25 && grade < 45){
            valGrade = 'E';
        }
        else if(grade >= 45 && grade < 50){
            valGrade = 'D';
        }
        else if(grade >= 50 && grade < 60){
            valGrade = 'C';
        }
        else if(grade >= 60 && grade < 80){
            valGrade = 'B';
        }
        else {
            valGrade = 'A';
        }
        return  valGrade;
    }

    /*Дано целое положительное число.
    Напишите программу, которая выводит это число в обратном порядке.
    Например, если дано число 12345, то вывод будет следующим: 54321.
    (Пока можно пропустить, до изучения циклов)*/

    public int getReversed(int a){
        //int a = 12345;
        int reversed = 0;
        while (a > 0){
            int last = a % 10;
            reversed = reversed * 10 + last;
            //5 //4 //3 // 2 // 1
            a = a / 10; // 1234 // 123 // 12 // 1 // 0
            System.out.println(reversed);
        }
        return reversed;
    }

    /*Дано целое положительное число.
    Напишите программу, которая выводит сообщение о том, является ли это число простым.*/

    public boolean isPrime(int a){
        boolean primeNum = true;
        if (a == 0 || a == 1){
            primeNum = false;
        }else{
            for(int i = 2; i >= a / 2; i++){
                if (a % i == 0){
                    return false;
                }
            }
        }
        return primeNum;
    }

    /*Напишите программу, которая проверяет,
    является ли заданное целое число четным или нечетным, и выводит соответствующее сообщение.
     */

    public boolean isOdd(int a) {
        boolean oddNum = false;
        if(a % 2 == 0){
            oddNum = false;
        }
        else {
            oddNum = true;
        }
        return oddNum;
    }

    /*Напишите программу, которая сравнивает два целых числа и определяет, какое из них больше.*/

    public int isBigger(int a, int b){
        int big;
        if(a > b){
            big = a;
        }else{
            big = b;
        }
        return big;
    }

    //leap year

    public boolean isLeapYear(int year){
        boolean leapYear = false;
        if ((year % 400 == 0) ||(year % 4 == 0) && (year % 100 != 0)){
            return true;
        }
        return false;
    }

    //Напишите программу, которая принимает номер дня недели (1 - Понедельник, 2 - Вторник и так далее) и выводит название дня недели.

    public void findNameWeek(int a){
        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Input from 1 to 7");
        }
    }
    //Напишите программу, которая принимает координаты точки (x, y) и определяет, в каком квадранте координатной плоскости она находится.

    public void findQuadrant(int x, int y){
        if (x > 0 && y > 0){
            System.out.println("I");
        }
        else if(x < 0 && y > 0){
            System.out.println("II");
        }
        else if(x < 0 && y < 0){
            System.out.println("III");
        }
        else if(x > 0 && y < 0){
            System.out.println("IV");
        }
    }


    //Напишите программу, которая принимает длины трех сторон треугольника и определяет его тип (равносторонний, равнобедренный или разносторонний).

    public void findTypeTriangle(int a, int b, int c){
        if (a == b && b == c) {
            System.out.println("equilateral");
        } else if (a == b || b == c || c == b || a == c) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
        }


}
