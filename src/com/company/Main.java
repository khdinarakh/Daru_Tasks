package com.company;

import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        /*HW6 six = new HW6();
        int[] myArray = {1, 3, 4, 1, 5, 5};
        double avg = six.findAverageArray(myArray);
        System.out.println(avg);

        int[] arr = {1, 3, 4, 1, 5, 9};
        six.existInArrGivenVal(arr, 3);
        six.findIndex(arr, 3);

        six.printArrRangeElement(arr, 1, 4);
        six.findMaxArr(arr);

        six.printFirstMinValue(arr);
        six.printSecondMinValue(arr);
        six.descOrder(arr);

        int arr2[][] = {{1, 3, 3}, {2, 5, 6}, {3, 6, 2} };

        // if (i == j)
        // 00 01 02
        // 10 11 12
        // 20 21 22

        System.out.println("Is sym " + six.isSymmetric2DArray(arr2));

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

        System.out.println("====");

        six.print2DArray(six.changeNinetyPer(arr2));

        System.out.println("===");
        six.sumTwoDArr(arr2);
        six.isArraySquare(arr2);

        double arr4[] = six.findAvgRow(arr2);


        System.out.println("X: " + arr4[0] + " Y: " + arr4[1]);
        int[][] ar = six.calculateMultipleTable(5);
        six.print2DArray(ar);

        HW5 example = new HW5();
        System.out.println(example.isOdd(4));

        example.findNameWeek(9); */

        String name = "DINara";
        System.out.println(name.toLowerCase());

        HW7 s = new HW7();

        System.out.println(s.formatTime(9600));
        System.out.println(s.isPalindrome("adea"));

        System.out.println("all vowels: " + s.isAllLetterVowel("IUaAI"));

       // System.out.println(s.calculateSumDigitsNumber(222));

        System.out.println(s.countDigitInNumber(12223212, '2'));

        System.out.println("vowels " +  s.countVowels("Daaarrid"));


        System.out.println("Area: " + s.calculateAreaRegularPolygon(6, 5));

        System.out.println("count words: " + s.countWordsSplit("Java is good to learn Object Oriented programming."));

        HW6 six = new HW6();
        int[] myArray = {1, 3, 4, 1, 5, 5};
        System.out.println("Average: " + six.findAverageArrayStream(myArray));

        double[] arr1 = {10, 3};
        double[] arr2 = {5, 7};

        System.out.println(s.calculateDistance(arr1, arr2));

        System.out.println("Day: " + s.getDaysInMonth(2033, 1));

        System.out.println("GCD: " + s.findGCD(12, 8));

        //System.out.println(s.returnNumberASC(-10));

       // s.printToN(-10);


    }
}




