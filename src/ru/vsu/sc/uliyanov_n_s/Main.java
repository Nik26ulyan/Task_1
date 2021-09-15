package ru.vsu.sc.uliyanov_n_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StartWriteMethod();

        int num1 = ReadNumMethod();
        int num2 = ReadNumMethod();
        int num3 = ReadNumMethod();

        int firstPairMax = FindMaxValueInPair(num1, num2);
        int secondPairMax = FindMaxValueInPair(num2, num3);
        int maxNum = FindMaxValueInPair(firstPairMax, secondPairMax);

        int firstPairMin = FindMinValueInPair(num1, num2);
        int secondPairMin = FindMinValueInPair(num2, num3);
        int minNum = FindMinValueInPair(firstPairMin, secondPairMin);

        int averageNum = FindAverageNumb(num1, num2, num3, minNum, maxNum);

        FinalWriteMethod(averageNum);
    }

    static int FindAverageNumb(int a, int b, int c, int d, int e) {
        return a + b + c - (d + e);
    }

    static int FindMaxValueInPair(int a, int b) {
        return (a + b) / 2 + CalcModuleMethod(a - b) / 2;
    }

    static int FindMinValueInPair(int a, int b) {
        return (a + b) / 2 - CalcModuleMethod(a - b) / 2;
    }

    static int CalcModuleMethod(int a) {          //Не использую функцию Math.abs() т.к. там есть условный оператор.
        return (int) Math.sqrt(a * a);
    }

    static void StartWriteMethod() {
        System.out.println("Enter 3 integer numbers:");
    }

    static void FinalWriteMethod(int a) {
        System.out.print("Average number is " + a);
    }

    static int ReadNumMethod() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}