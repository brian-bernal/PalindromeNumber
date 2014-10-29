package com.company;
// This code is so so much slower than Alt! Brute force really. I admire the mathematics in Alt and the creativity to use several nested loops.
//  Learning some neat technique, admit utter defeat at having slow slow slow code and moving on.
public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int largestPalindrome = 1;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                if (isPalindrome(i * j) && (i * j > largestPalindrome))
                    largestPalindrome = i * j;
            }
        }
        System.out.println(largestPalindrome);

        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns");
    }

    static boolean isPalindrome(int num) {
        String palindrome = num + "";
        int middle = (palindrome.length() / 2);  //
        String right = "", left = palindrome.substring(0, (middle));  //Substring is (inclusive, exclusive)

        if ((palindrome.length() & 1) != 0)  //If the number of digits is odd
            middle += 1;  //Set the beginning element one over (to skip the lone number in the middle). If the number of digits is even, we don't want to skip any digits.
        right = palindrome.substring(middle, palindrome.length());
        right = new StringBuilder(right).reverse().toString();  //reverse the string to compare it

        //Could make it into a character array and start comparing from beginning and end.

        return (left.compareTo(right) == 0);
    }
}