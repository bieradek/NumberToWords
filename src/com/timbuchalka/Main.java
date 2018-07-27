package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        numberToWords(10000);
        System.out.println("**************************");
        numberToWords(20024004);
        System.out.println("**************************");
        numberToWords(200240000);
        System.out.println("**************************");
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int initialDigitCount = getDigitCount(number);
        number = reverse(number);
        for (int i = 1; i <= initialDigitCount; i++) {
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
                default:
                    System.out.println("Zero");
                    break;
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int counter = 0;
        while (number > 0) { // fix made on that logic, input of 0 returned digit count of 0
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        if (number < 0) {
            number *= -1;
            while (number > 0) {
                int lastDigit = number % 10;
                number /= 10;
                reversedNumber = reversedNumber * 10 + lastDigit;
            }
            reversedNumber *= -1;
        } else {
            while (number > 0) {
                int lastDigit = number % 10;
                number /= 10;
                reversedNumber = reversedNumber * 10 + lastDigit;
            }
        }
        return reversedNumber;
    }
}