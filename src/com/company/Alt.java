package com.company;

//This is brilliant code I found and commented for the Problem 4 thread. The user, yeus, said it ran in 373ns with MS C++ 2005

public class Alt {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println(yeusOptimized());  //Wow this is so fast.

        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns");
    }

    static int yeusOptimized(){  //That's the power of mathematics
        /*  Largest number we can have is 999*999=998001. Six digits.
        *   The first number must match the last number, therefore 100001 * single digit is the only possibility
        *///  The nested loops will only produce palindromes
        for(int x=9;x>=0;--x){	int a=x*100001;  //Setting up palindrome. 100001 * 9 = 900009
            for(int y=9;y>=0;--y){	int b=a+y*10010;  //Setting up the inner numbers so 10010*9. 90090 + 900009 = 990099
                for(int z=9;z>=0;--z){	int n=b+z*1100;  //Final inner numbers 9900+990099 = 999999 Palindrome
                    for(int i=990;i>99;i-=11){  //Since we start with the largest palindrome, we just need to make sure it is a factor of two 3 digit numbers.
                        if(n%i==0){//If there is a remainder, i isn't a factor.
                            int t=n/i;  //t is the palindrome divided by the factor to get the other factor
                            if(t<1000)return n;  //make sure that other factor was also a 3 digit number (only one check since we're starting from the maximum possible values)
                        }}}}}  //And return the palindrome
    return 0;}
}
