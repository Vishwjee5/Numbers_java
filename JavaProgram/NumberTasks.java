// Write a program to find:
// a. palendrome
// b. fibonacci series
// c. leap year
// d. even/odd number

import java.util.Scanner;

public class NumberTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if a number is palindrome
        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = scanner.nextInt();
        boolean isPalindrome = isPalindrome(number);
        System.out.println(number + " is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
        System.out.println();

        // Generate Fibonacci series
        System.out.print("Enter the length of the Fibonacci series: ");
        int length = scanner.nextInt();
        System.out.println("Fibonacci series:");
        for (int i = 0; i < length; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println();


        // Check if a year is a leap year
        System.out.print("Enter a year to check if it is a leap year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = isLeapYear(year);
        System.out.println(year + " is " + (isLeapYear ? "a leap year." : "not a leap year."));
        System.out.println();

        // Check if a number is even or odd
        System.out.print("Enter a number to check if it is even or odd: ");
        int num = scanner.nextInt();
        String evenOdd = isEven(num) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd + ".");
    }
    
    // Check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed == original;
    }

    // Generate Fibonacci series
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
