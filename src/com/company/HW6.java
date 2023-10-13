package com.company;

public class HW6 {


    // Дан массив чисел. Напишите программу для вычисления среднего значения элементов одномерного массива.

    public double findAverageArray(int[] a){
        double sum = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++){
            sum += a[i];
            count++;
        }
        double average = sum / count;
        return average;
    }

    // Дан массив целых значений. Напишите программу для поиска дубликатов значений.

    public void findDuplicatesArr(int[] arr){
        System.out.println("Дубликаты = ");
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                }
            }
        }

    }


    //Дан массив целых значений. Напишите программу для проверки, содержит ли массив определенное значение.

    public boolean existInArrGivenVal(int[] arr, int val){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == val) {
                return true;
            }
        }
        return false;
    }

    //Дан массив целых значений. Напишите программу для нахождения индекса элемента массива.

    public void findIndex(int[] arr, int val){
        boolean indexExist = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                System.out.println("Index is: " + (i + 1));
                indexExist = true;
                break;
            }
            else {
                indexExist = false;
            }
        }
        if (!indexExist){
            System.out.println("Not found!");
        }
    }

    //Даны массив целых значений и целые числа n, m. Напишите программу для нахождения подмассива между индексами n и m.

    public void printArrRangeElement(int[] arr, int n, int m){
        System.out.print("From " + n + " to " + m + ": ");
        for (int i = n; i <= m; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //Дан массив целых значений. Напишите программу для нахождения наибольшего и наименьшего элементов массива.

    public int findMaxArr(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public int findMinArr(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    //Дан массив целых значений. Напишите программу для нахождения наименьшего и второго наименьшего элементов заданного массива.

    public void printFirstMinValue(int[] arr){
        System.out.println();
        int firstMin = findMinArr(arr);
        System.out.println("The first min value: " + firstMin);
    }

    public void printSecondMinValue(int[] arr){
        int secondMin = arr[0];
        int firstMin = findMinArr(arr);

        if (arr[0] == firstMin){
            secondMin = arr[1];
        }
        for (int i = 0; i < arr.length; i++){
            if (secondMin > arr[i]){
                if (arr[i] != firstMin)
                    secondMin = arr[i];
            }
        }
        if(arr.length == 1){
            System.out.println("There are only one min");
        }
        System.out.println("The second min: " + secondMin);
    }

    //Дан массив целых значений. Напишите программу для формирования наибольшего числа из заданного массива целых неотрицательных чисел.

    //bubble sort

    public void descOrder(int[] arr){
        int temp;
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sort desc: ");
        for (int number : arr){
            System.out.print(number + " ");
        }
    }

    // 0:0 0:1
    // 1:0 1:1
    // 2:0 2:1
    //Дан двумерный массив целых значений. Напишите программу для печати массива после изменения строк и столбцов заданного двумерного массива.

    public void changeRowToColumn(int[][] arr){
        System.out.println();
        int row = arr.length;
        int column = arr[0].length;;

        for (int i = 0; i < column; i++){
            for (int j = 0; j < row; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    //Напишите программу, которая возвращает сумму всех значений в двумерном массиве.

    public void sumTwoDArr(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of two dimensional array: " + sum);
    }

    //Напишите программу, которая возвращает true, если двумерный массив является квадратным.

    public boolean isArraySquare(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;

        return row == column;
    }

    //Дано целое число n. Напишите программу, которая возвращает двумерный массив,
    // представляющий таблицу умножения. Число n определяет размер таблицы умножения.

    public int[][] calculateMultipleTable(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        return arr;
    }

     public void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Напишите программу, которая возвращает
    // максимальное и минимальное значение, найденные в двумерном массиве.

    public int findMax2DArr(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public int findMin2DArr(int[][] arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(min > arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }


}



