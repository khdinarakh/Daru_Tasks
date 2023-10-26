package com.company;

public class HW5 {

    //Напишите программу, чтобы проверить значения длины и ширины прямоугольника и определить, является ли он квадратным или нет.
    public boolean checkRectangle() {
        int length1 = 5, length2 = 5, width1 = 10, width2 = 10;
        boolean checking = false;
        if (length1 == length2 && width1 == width2) {
            checking = true;
        }
        return checking;
    }

    /*Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
    Если стоимость товара ниже 5000, то стоимость остается без изменений.
    Вычислите и выведите итоговую стоимость покупки для пользователя.*/

    public double addSale(double price) {
        if (price > 5000) {
            price = price * 0.9;
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

    public char printValueGrade(int grade) {
        char valGrade = 0;
        if (grade < 101 || grade > 0) {
            if (grade < 25) {
                valGrade = 'F';
            } else if (grade >= 25 && grade < 45) {
                valGrade = 'E';
            } else if (grade >= 45 && grade < 50) {
                valGrade = 'D';
            } else if (grade >= 50 && grade < 60) {
                valGrade = 'C';
            } else if (grade >= 60 && grade < 80) {
                valGrade = 'B';
            } else {
                valGrade = 'A';
            }
        }
        return valGrade;
    }

    /*Дано целое положительное число.
    Напишите программу, которая выводит это число в обратном порядке.
    Например, если дано число 12345, то вывод будет следующим: 54321.
    (Пока можно пропустить, до изучения циклов)*/

    public int getReversed(int a) {
        //int a = 12345;
        int reversed = 0;
        while (a > 0) {
            int last = a % 10;
            reversed = reversed * 10 + last;
            //5 //4 //3 // 2 // 1
            a = a / 10; // 1234 // 123 // 12 // 1 // 0
            //System.out.println(reversed);
        }
        return reversed;
    }

    /*Дано целое положительное число.
    Напишите программу, которая выводит сообщение о том, является ли это число простым.*/

    public boolean isPrime(int a) {
        boolean primeNum = true;
        if (a == 0 || a == 1) {
            primeNum = false;
        } else {
            for (int i = 2; i >= a / 2; i++) {
                if (a % i == 0) {
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
        /*boolean oddNum = true;
        if (a % 2 == 0) {
            oddNum = false;
        }
        return oddNum;*/
        return a % 2 != 0;
    }

    /*Напишите программу, которая сравнивает два целых числа и определяет, какое из них больше.*/

    public int findMax(int a, int b) {
        return Math.max(a, b);
    }

    //leap year

    public boolean isLeapYear(int year) {
        boolean leapYear = false;
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            return true;
        }
        return false;
    }

    //Напишите программу, которая принимает номер дня недели (1 - Понедельник, 2 - Вторник и так далее) и выводит название дня недели.

    public String findNameWeek(int dayNumber) {
        String weekDay;
        switch (dayNumber) {
            case 1 -> weekDay = "Monday";
            case 2 -> weekDay = "tuesday";
            case 3 -> weekDay = "wednesday";
            case 4 -> weekDay = "thursday";
            case 5 -> weekDay = "friday";
            case 6 -> weekDay = "saturday";
            case 7 -> weekDay = "sunday";

            default -> {
                return "Input from 1 to 7";
            }
        }
        return weekDay;
    }
    //Напишите программу, которая принимает координаты точки (x, y) и определяет, в каком квадранте координатной плоскости она находится.

    public String findQuadrant(int x, int y) {
        String quadrant = "";
        if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "II";
        } else if (x < 0 && y < 0) {
            quadrant = "III";
        } else if (x > 0 && y < 0) {
            quadrant = "VI";
        }
        return quadrant;
    }


    //Напишите программу, которая принимает длины трех сторон треугольника и определяет его тип (равносторонний, равнобедренный или разносторонний).

    public String findTypeTriangle(int a, int b, int c) {
        String typeTriangle = "";
        if (a == b && b == c) {
            typeTriangle = "equilateral";
        } else if (a == b || b == c || c == b || a == c) {
            typeTriangle = "isosceles";
        } else {
            typeTriangle = "scalene";
        }
        return typeTriangle;
    }

    /*
    * Напишите программу для печати следующего сообщения:
        i)
          **********
          **********
          **********
          **********

        ii)
        *
        **
        ***
        ****
        *****

iii)
        1
      212
    32123
  4321234
543212345*/
    public void printAsterisk(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleAsterisk(int rowSize) {
        for (int i = 1; i <= rowSize; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleNumber() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }

    //Даны два целых числа a и b.
    // Напишите программу для вычисления суммы натуральных чисел в диапазоне от a до b.

    public int sumRangeNumber(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    /*Класс A: 50%
      Класс B: 25%
      Класс C: 0%*/
    public double calculateBonus(char classOfEmployee, double salary) {
        double bonus;
        if (classOfEmployee == 'A') {
            bonus = salary * 0.5;
        } else if (classOfEmployee == 'B') {
            bonus = salary * 0.25;
        } else
            bonus = 0;
        return bonus;
    }

    public double calculateSalaryWithBonus(char classOfEmployee, double salary) {
        double salaryWithBonus = calculateBonus(classOfEmployee, salary) + salary;
        return salaryWithBonus;
    }


    // 0 1 1 2 3 5 8 13 21

    public int findFibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibonacciRecursion(n - 1) + findFibonacciRecursion(n - 2);
        }
    }

    public int[] findFibArr(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }














}
