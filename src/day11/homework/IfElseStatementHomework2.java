package day11.homework;

import java.util.Scanner;

public class IfElseStatementHomework2 {
    public static void main(String[] args) {


//Find the Largest Number Among Three Numbers using user Input
//to find largest number among three numbers using nested if
//    int a = 34;
//    int b = 45;
//    int c = 78;
//
//int num1 = 10, num2 = 20, num3 = 7;
    //output 20 is the largest Number
    //Find the Largest Number Among Three Numbers using user Input
    //to find largest number among the three numbers using nested if
    // int a=34;
    //  int b=45;
    //  int c=78;
    //
    //int num1=10,num2=20,num3=7;
    //output 20 is the largest number




        Scanner scan = new Scanner(System.in);


        int a = 5 ,b = 1 ,c = 9;
        if(a>b) {
            if(a>c)
                System.out.println("a is largest number");
            else
                System.out.println(" c is largest number");
        }else {
            if(b>c)
                System.out.println("b is largest number");
            else
                System.out.println(" c is largest number");
        }


    }


}


