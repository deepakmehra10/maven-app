package com.deepak;

import java.util.Scanner;

public class SumApp {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number!");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number!");
        int secondNumber = scanner.nextInt();
        
        int result = Sum.addNumbers(firstNumber, secondNumber);
        System.out.println("Sum is " + result);
    }
}
