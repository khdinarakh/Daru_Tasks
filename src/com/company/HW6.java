package com.company;

import java.util.Arrays;

public class HW6 {


    // Дан массив чисел. Напишите программу для вычисления среднего значения элементов одномерного массива.

    public double findAverageArray(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    // more shorter
    public double findAverageArrayStream(int[] a) {
        return Arrays.stream(a).sum() / a.length;
    }

    // Дан массив целых значений. Напишите программу для поиска дубликатов значений.
    //change it
    public void findDuplicatesArr(int[] arr) {
        System.out.println("Дубликаты = ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    /*for future
    Set<Integer> duplicates = Arrays.stream(numbers).distinct().filter(number -> Collections.frequency(Arrays.asList(numbers), number) > 1).collect(Collectors.toSet());
    // Выводим дубликаты
    duplicates.forEach(System.out::println);*/


    //Дан массив целых значений. Напишите программу для проверки, содержит ли массив определенное значение.

    public boolean isValExistInArr(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return true;
            }
        }
        return false;
    }


    //Дан массив целых значений. Напишите программу для нахождения индекса элемента массива.

    public int findIndex(int[] arr, int val) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                index = i + 1;
                return index;
            } else {
                System.out.println("Not found!");
            }
        }
        return index;
    }

    //Даны массив целых значений и целые числа n, m. Напишите программу для нахождения подмассива между индексами n и m.

    public int[] printArrRangeElement(int[] arr, int n, int m) {
        int[] arrInRange = new int[m - n + 1];
        for (int i = 0; i < m - n + 1; i++) {
            arrInRange[i] = arr[n + i];
        }
        return arrInRange;
    }

    //Дан массив целых значений. Напишите программу для нахождения наибольшего и наименьшего элементов массива.

    public int findMaxArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public int findMinArr(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }

    //Дан массив целых значений. Напишите программу для нахождения наименьшего и второго наименьшего элементов заданного массива.

    public void printFirstMinValue(int[] arr) {
        System.out.println();
        int firstMin = findMinArr(arr);
        System.out.println("The first min value: " + firstMin);
    }

    public int printSecondMinValue(int[] arr) {
        int secondMin = arr[0];
        int firstMin = findMinArr(arr);

        if (arr[0] == firstMin) {
            secondMin = arr[1];
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondMin > arr[i]) {
                if (arr[i] != firstMin)
                    secondMin = arr[i];
            }
        }
        if (arr.length == 1) {
            System.out.println("There are only one min");
            return secondMin;
        }
        return secondMin;
    }

    //Дан массив целых значений. Напишите программу для формирования наибольшего числа из заданного массива целых неотрицательных чисел.

    //bubble sort

    public int[] descOrder(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    //for future
    public int[] ascOrder(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // 0:0 0:1
    // 1:0 1:1
    // 2:0 2:1
    //Дан двумерный массив целых значений. Напишите программу для печати массива после изменения строк и столбцов заданного двумерного массива.

    /*public int[][] changeRowToColumn(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int[][] changeRowToColumn = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                changeRowToColumn[j][i] = arr[i][j];
            }
        }
        return changeRowToColumn;
    }*/

    public int[][] changeRowToColumn(int[][] arr) {
        System.out.println();
        int row = arr.length;
        int column = arr[0].length;
        int[][] changeRowToColumn = new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                changeRowToColumn[i][j] = arr[j][i];
            }
        }
        return changeRowToColumn;
    }

    //Напишите программу, которая возвращает сумму всех значений в двумерном массиве.

    public int sumTwoDArr(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    //Напишите программу, которая возвращает true, если двумерный массив является квадратным.

    public boolean isArraySquare(int[][] arr) {
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

    public int findMin2DArr(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }


    //Напишите программу, которая ищет заданный элемент в двумерном массиве и выводит его координаты (строка и столбец).

    public int[] searchIndexXY(int[][] arr, int searcherNum) {
        int[] savingIndex = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searcherNum) {
                    savingIndex[0] = i;
                    savingIndex[1] = j;
                    break;
                }
            }
        }
        return savingIndex;
    }

    //Напишите программу, которая находит среднее значение в каждой строке row двумерного массива и выводит его.

    public double[] findAvgRow(int[][] arr) {
        int n = arr.length;
        double[] avgRow = new double[n];
        for (int i = 0; i < n; i++) {
            avgRow[i] = findAverageArray(arr[i]);
        }
        return avgRow;
    }

    //Напишите программу, которая транспонирует заданную матрицу (меняет строки на столбцы и наоборот).

    // I have already done in the method changeRowToColumn(arr);

    //Напишите программу, которая находит максимальный и минимальный элементы в двумерном массиве.
    public int findMin2DArray(int arr[][]) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            if (min > findMinArr(arr[i])) {
                min = findMinArr(arr[i]);
            }
        }
        return min;
    }

    public int findMax2DArray(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            if (max < findMaxArr(arr[i])) {
                max = findMinArr(arr[i]);
            }
        }
        return max;
    }

    //Напишите программу, которая сортирует строки в двумерном массиве в порядке возрастания.

    public int[][] orderRowASC2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            ascOrder(arr[i]);
        }
        return arr;
    }

    //Напишите программу, которая проверяет, является ли заданная матрица симметричной (относительно главной диагонали).
    // if (i == j)
    // 00 01 02
    // 10 11 12
    // 20 21 22

    public boolean isSymmetric2DArray(int[][] arr) {
        boolean isSymmetric = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != j) {
                    if (arr[i][j] == arr[j][i]) {
                        isSymmetric = true;
                    } else
                        return false;
                }
            }
        }
        return isSymmetric;
    }


    //Напишите программу, которая поворачивает матрицу на 90 градусов по часовой стрелке.*/


    public int[][] changeNinetyPer(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int[][] change90 = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                change90[j][row - i - 1] = arr[i][j];
            }
        }
        return change90;
    }

}



