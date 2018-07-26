package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        numberToWords(123456789);
//        System.out.println("*********************");
//        numberToWords(2323);
//        System.out.println("*********************");
//        numberToWords(44444);
//        System.out.println("*********************");
//        numberToWords(55555555);
//        System.out.println("*********************");
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(123456789));
//        System.out.println("**********************");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {   //-123456789
        int reversedNumber = 0;
        if (number < 0) {
            number = number * -1;
            while (number > 0) {
                int rLastDigit = number % 10;
                number /= 10;
                reversedNumber = reversedNumber * 10 + rLastDigit;
            }
        } else {
            while (number > 0) {
                int rLastDigit = number % 10;
                number /= 10;
                reversedNumber = reversedNumber * 10 + rLastDigit;
            }
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}