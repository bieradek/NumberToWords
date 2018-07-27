package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(-121));
        System.out.println("***************************");
        numberToWords(100000);
        System.out.println("**************************");
        numberToWords(-10000);
        System.out.println("**************************");
        numberToWords(20024004);
        System.out.println("**************************");
        numberToWords(200240000);
        System.out.println("**************************");
        numberToWords(1000);
        System.out.println("**************************");
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        System.out.println("Number before operations is " + number);
        System.out.println("Reversed number is " + reverse(number));


//        int reverseCopy = reverse(number);
//        int digitCount = getDigitCount(number);
//        int zeroesCut = digitCount - getDigitCount(reverse(number));
//
//        for (int i = 1; i <= zeroesCut; i++) {
//            reverseCopy = reverseCopy * 10;
//        }

        number = reverse(number);
        System.out.println("Number after operations is " + number);
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
        while (number > 0) {
            int rLastDigit = number % 10;
            number /= 10;
            reversedNumber = reversedNumber * 10 + rLastDigit;
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