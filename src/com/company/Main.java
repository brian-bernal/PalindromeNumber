package com.company;

public class Main {

    public static void main(String[] args) {
        int digit1 = 100, digit2 = 101;
        int largestPalindrome = 1;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if (isPalindrome(i * j))
                    largestPalindrome = i * j;
            }
        }

        System.out.println(largestPalindrome);
    }

    static boolean isPalindrome(int num) {
        String palindrome = num + "";
        int middle = (palindrome.length() / 2);  //If even, last element in substring.
        String left = palindrome.substring(0, (middle));
        String right = palindrome.substring(middle + 1, palindrome.length());
        right = new StringBuilder(right).reverse().toString();
        return (left.compareTo(right) == 0);
    }
}