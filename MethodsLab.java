/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.methodslab;

import java.util.Scanner;

public class MethodsLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Display the welcme message.
        greetUser();

        //===================================================
        //                  ARITHMETIC OPERATIONS
        //===================================================
        System.out.println("    ARITHMETIC OPERATIONS");
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        //Calls arithmetic methods
        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        double quotient = divide(a, b);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);

        if (b != 0) {
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }
        System.out.println();

        //==============================================================
        //                          FACTORIAL
        //==============================================================
        System.out.println("        FACTORIAL      ");
        System.out.println("Enter a number for factorial: ");
        int n = input.nextInt();
        int result = factorial(n);

        if (result == -1) {
            System.out.println("ERROR: factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial: " + result);
        }
        System.out.println();

        //===============================================================
        //                      ARRAY OPERATIONS
        //===============================================================
        System.out.println("    ARRAY OPERATIONS");
        System.out.println("Enter array size: ");
        int size = input.nextInt();

        if (size > 0) {
            int[] arr = new int[size];

            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            int arraySum = sumArray(arr);

            System.out.println("Sum of array: " + arraySum);

            int maximum = maxInArray(arr);

            System.out.println(" Maximum element: " + maximum);
        } else {
            System.out.println("Invalid array size.");
        }
        System.out.println();

        //========================================================
        //                     PRIME NUMBER
        //========================================================
        System.out.println("        PRIME NUMBER");
        System.out.println("Enter a number: ");
        int primeNum = input.nextInt();

        boolean prime = isPrime(primeNum);

        if (prime) {
            System.out.println(primeNum + " is a prime number.");

        } else {
            System.out.println(primeNum + " is not a prume number.");
        }
        System.out.println();

        //=============================================================
        //                      GCD & LCM
        //=============================================================
        System.out.println("        GCD & LCM");
        System.out.println("Enter two positive integers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x > 0 && y > 0) {
            int greatest = gcd(x, y);
            int least = lcm(x, y);

            System.out.println("GCD: " + greatest);
            System.out.println("LCM: " + least);
        } else {
            System.out.println("Please enter positive integers.");
        }
        System.out.println();

        //============================================================
        //                  RECURSIVE FACTORIAL
        //============================================================
        System.out.println("     RECURSIVE FACTORIAL      ");
        System.out.println("Enter a number for factorial: ");
        int number = input.nextInt();
        int factorialResult = recursiveFactorial(number);

        if (result == -1) {
            System.out.println("ERROR: factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial: " + factorialResult);
        }
        System.out.println();

        //===================================================================
        //                      RECURSIVE FIBONACCI
        //===================================================================
        System.out.println("    RECURSIVE FIBONACCI");
        System.out.println("Enter a number (0-45):  ");

        int num = input.nextInt();
        int output = fib(num);
        if (num < 0 || num > 45) {
            System.out.println("Invalid input.");
        } else {
            System.out.println("Fibbonacci: " + output);
        }
        System.out.println();

        //==================================================================
        //                      PALINDROME
        //==================================================================
        System.out.println("        PALINDROME");
        System.out.println("Enter a word: ");
        String word = input.next();

        boolean res = isPalindrome(word);

        if (res) {
            System.out.println("The word '" + word + "' is a Palindrome");
        } else {
            System.out.println("The word '" + word + "' is not a Palindrome");
        }
        System.out.println();

    }
    //====================================================
    // 1. GREET USER 
    //====================================================

    static void greetUser() {
        System.out.println("========================================");
        System.out.println("        WELCOME TO MATHVERSE!");
        System.out.println("========================================");
        System.out.println("    Where numbers meet logic and fun!");
        System.out.println();
        System.out.println("  Ready to challenge something amazing!");

        System.out.println("========================================");
        System.out.println();
    }
    //===========================================================
    //                  ARITHMETHIC METHODS
    //===========================================================

    //Return the sum of two numbers.
    static int add(int a, int b) {
        return a + b;
    }

    //Return the difference of two numbers.
    static int subtract(int a, int b) {
        return a - b;
    }

    //Return the product of two numbers.
    static int multiply(int a, int b) {
        return a * b;
    }

    //Return the qoutient of two numbers.
    static double divide(double a, double b) {
        return a / b;
    }

    //============================================================
    //                    NORMAL FACTORIAL 
    //============================================================
    //Calculate factorial using a loop
    static int factorial(int n) {
        if (n < 0) {
            return -1;
        }

        int original = n;
        int result = 1;

        for (int i = 1; i <= original; i++) {
            result *= i;
        }
        n = result;
        return n;
    }

    //===========================================================
    //                       SUM ARRAY
    //===========================================================
    // Return the sum o all array elements.
    static int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    //===========================================================
    //                       PRIME NUMBER
    //===========================================================
    //Check whether a number is a prime.
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //===========================================================
    //                      MAXIMUM ARRAY
    //===========================================================
    //Return the largest element in an array.
    static int maxInArray(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //===========================================================
    //                          GCD & LCD
    //===========================================================
    //Calcuklate the Greatest Common Divisor.
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //Calculate the Least Common Multiple.
    static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        return (a / gcd(a, b)) * b;
    }

    //============================================================
    //                  RECURSIVE FACTORIAL
    //============================================================
    //Calculate factorial using recursion.
    static int recursiveFactorial(int n) {
        if (n < 0) {
            return -1;
        }

        //Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        //Recursive case
        return n * factorial(n - 1);
    }

    //=========================================================
    //                  RECURSIVE FIBONACCI
    //=========================================================
    //Returns the Fibonacci number at position.
    static int fib(int n) {
        if (n < 0) {
            return -1;
        }

        //Base case
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        //Recursive case
        return fib(n - 1) + fib(n - 2);
    }

    //=============================================================
    //                          PALINDROME
    //=============================================================
    //Checks whether a word reads the same backward.
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
