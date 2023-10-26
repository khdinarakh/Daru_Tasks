package com.company;

public class Main {

    public static void main(String[] args) {
        HW6 six = new HW6();
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

        int arr2[][] = {{1, 2, 3}, {4, 5, 6}};
        six.changeRowToColumn(arr2);
        six.sumTwoDArr(arr2);
        six.isArraySquare(arr2);
        int[][] ar = six.calculateMultipleTable(5);
        six.print2DArray(ar);

        HW5 example = new HW5();
        System.out.println(example.isOdd(4));

        example.findNameWeek(9);



    }}




