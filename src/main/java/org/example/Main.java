package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }
    public static boolean isPalindrome (int num1){
        String numToString = Integer.toString(Math.abs(num1));
        String reversedNumToString = new StringBuilder(numToString).reverse().toString();
        return numToString.equals(reversedNumToString);
    }

    public static boolean isPerfectNumber (int num1){
       if(num1<1){
           return false;
       }
       int sumOfDividers = 0;
       for (int i=1; i<=num1 /2; i++){
           if(num1 % i == 0){
               sumOfDividers += i;
           }
       }
       return sumOfDividers == num1;
    }
    public static String numberToWords (int num1){
        if(num1<0){
            return "Invalid Value";
        }
        StringBuilder words = new StringBuilder();
        String numToString = Integer.toString(num1);
        for (int i=0; i<numToString.length(); i++){
            char digit = numToString.charAt(i);
            switch (digit){
                case '0': words.append("Zero ");break;
                case '1': words.append("One ");break;
                case '2': words.append("Two ");break;
                case '3': words.append("Three ");break;
                case '4': words.append("Four ");break;
                case '5': words.append("Five ");break;
                case '6': words.append("Six ");break;
                case '7': words.append("Seven ");break;
                case '8': words.append("Eight ");break;
                case '9': words.append("Nine ");break;

            }
        }

        return words.toString().trim();
    }
}
