package Recusion.introduction;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        printDecreasing(n);
    }

    private static void printDecreasing(int n) {
        if(n==0)
            return;
        System.out.println(n);
        printDecreasing(n-1);
    }
}
