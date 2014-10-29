package com.company;

public class Main {

    public static void main(String[] args) {
        int largestPalindrome = 1;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                if (isPalindrome(i * j) && (i * j > largestPalindrome))
                    largestPalindrome = i * j;
            }
        }
        System.out.println(largestPalindrome);
    }

    static boolean isPalindrome(int num) {
        String palindrome = num + "";
        int middle = (palindrome.length() / 2);  //
        String right = "", left = palindrome.substring(0, (middle));  //Substring is (inclusive, exclusive)

        if ((palindrome.length() & 1) != 0)  //If the number of digits is odd
            middle += 1;  //Set the beginning element one over (to skip the lone number in the middle). If the number of digits is even, we don't want to skip any digits.
        right = palindrome.substring(middle, palindrome.length());
        right = new StringBuilder(right).reverse().toString();  //reverse the string to compare it

        return (left.compareTo(right) == 0);
    }
}