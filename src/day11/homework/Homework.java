package day11.homework;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {


        //TODO Task
        // 1. Write program that gets two inputs from user then prints sum

        //   Scanner input= new Scanner(System.in);
        //   System.out.println("write a first number");
        //   int num1=input.nextInt();
        //   System.out.println("write a second number");
        //   int num2=input.nextInt();
        //   int sum=num1+num2;
        //   System.out.println();
        //   System.out.println("sum:"+ sum);

        // 2. Write simple calculator
        //     a. reads first input
        //     b. reads operator (+, -, *, /)
        //     c. reads second input
        //     d. prints result

        Scanner in = new Scanner((System.in));
        System.out.println("write a first number");
        int num1 = in.nextInt();
        System.out.println("write a second number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("sum:" + sum);


        // 3. Write program that calculates from string:
        //    ex: one plus nine => 10, four subtract 2 => 2


//
//    public class Test {
//        public static void main(String[] args)
//        {
//            for (;;)
//                System.out.println("TECHNO");
//        }
//    }
////Options:
////1.TECHNO
////2.Compile time error
////3.Run time Exception
////4.TECHNO (Infinitely)//true
//
//    class Test {
//      c
////Options:
////1.TECHNO TECHNO TECHNO
////2.Compile time error//true
////3.TECHNO (Infinitely)
////4.No output
//
//    class Test {
//        public static void main(String[] args)
//        {
//            boolean b = true;
//            if (b = false) {
//                System.out.println("HELLO");
//            } else {
//                System.out.println("BYE");
//            }
//        }
//    }
////Option:
////1.HELLO
////2.BYE//true
////3.Compile time error: re- initialization
////4.No output
//
//    public class Test {
//        public
//        static void main(String[] args)
//        {
//            int a = 10, b = 20;
//            if (a < b) {
//                if (a > b) {
//                    System.out.println("HELLO TECHNO");
//                } else {
//                    System.out.println("WELCOME");
//                }
//            }
//        }
//    }
////Option:
////1.HELLO TECHNO
////2.WELCOME
////3.Compile time error//true
////4.HELLO TECHNO WELCOME
//
//    class Test {
//        public static void main(String[] args)
//        {
//            for (int i = 0;; i++) {
//                System.out.println("HIII");
//            }
//            System.out.println("BYE");
//        }
//    }
////Options:
////1. HIII
////2. HIII(infinitely)
////3. BYE
////4. Compile time error//true


}
}


