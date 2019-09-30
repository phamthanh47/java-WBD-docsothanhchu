package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word="";
        System.out.println("nhap number: ");
        int number = input.nextInt();
        if(number>0 && number<10){
            word=translate1(number);
        }
        else if(number==10){
            word="ten";
        }
        else if(number<20){
            word=translate2(number);
        }
        else if(number >= 20 && number<100){
         word=append(translate3(number),translate1(number%10));
        }
        else if(number<1000){
            word=translate4(number);
        }
        else{
            word="out of range";
        }

        System.out.print(String.format("The number is: %s", word));
    }

    public static String translate1(int number) {
        String word = "";
        switch (number) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "sever";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = " ";
        }
        return word;
    }

    public static String translate2(int number) {
        String word = "";
        switch (number) {
            case 11:
                word = "eleven";
                break;
            case 12:
                word = "twelve";
                break;
            case 13:
                word = "thirteen";
                break;
            case 14:
                word = "fourteen";
                break;
            case 15:
                word = "fifteen";
                break;
            case 16:
                word = "sixteen";
                break;
            case 17:
                word = "seventeen";
                break;
            case 18:
                word = "eighteen";
                break;
            case 19:
                word = "nineteen";
                break;
            default:
                word = " ";
        }
        return word;
    }
       public static String translate3(int number){
        String word="";
        switch (number/10){
            case 2:
                word = "twenty";
                break;
            case 3:
                word = "thirty";
                break;
            case 4:
                word = "forty";
                break;
            case 5:
                word = "fifty";
                break;
            case 6:
                word = "sixty";
                break;
            case 7:
                word = "seventy";
                break;
            case 8:
                word = "eighty";
                break;
            case 9:
                word = "ninety";
                break;
            default:
                word = " ";
        }
           return word;
        }
        public static String append(String ... arr){
        String word="";
        for(String e:arr){
            word=new StringBuilder()
                    .append(word)
                    .append(e)
                    .toString();
        }
        return word;
    }
        public static String translate4(int number){
        int firstDigit=number/100;
        int secondDigit=number %100;
        int thirdDigit=number%10;
         String firstWord= append(translate1(firstDigit),"hundred and ");
         String secondWord=append(firstWord,translate3(secondDigit));
         String word="";
         if(secondDigit==10){
             word=append(firstWord,"ten");
         }
         else if(secondDigit<10) {
         word=append(firstWord,translate1(thirdDigit));
         }
         else if(secondDigit >10 && secondDigit<20){
             word=append(firstWord,translate2(secondDigit));
         }
         else {
             if (thirdDigit != 0) {
                 word = append(secondWord, translate1(thirdDigit));
             } else
                 word = append(firstWord, translate3(secondDigit));
         }
       return word;
   }
}