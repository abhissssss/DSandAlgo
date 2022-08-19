package com.abhisheksingh.dsa;

import java.util.Scanner;

public class PeakArray {
    public static void main(String[] args) {
int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements you wanna store");
n= scanner.nextInt();
        int [] array = new int[10];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);

        }

    }
}
