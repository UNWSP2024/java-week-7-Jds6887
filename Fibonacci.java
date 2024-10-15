package mypackage;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("How many Fibonacci numbers would you like to print (between 1 and 32)? ");
        int n = scanner.nextInt();
        
 
        if (n < 1 || n > 32) {
            System.out.println("Please enter a number between 1 and 32.");
            return;
        }
        
       
        long[] fibonacciNumbers = new long[n];
        
        if (n >= 1) fibonacciNumbers[0] = 0; 
        if (n >= 2) fibonacciNumbers[1] = 1;         
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
        
 
        System.out.println("Fibonacci numbers:");
        for (long num : fibonacciNumbers) {
            System.out.println(num);
        }
        
        scanner.close();
    }
}
