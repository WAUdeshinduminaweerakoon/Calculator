package com.company;



import java.util.Scanner;
    public class Main {
        //Function for addition
        public static void addition(int a, int b){
            int sum = a+b;
            System.out.println("The answer is " +sum);

        }
        //Function for subtraction
        public static void subtraction(int a, int b){
            int sub = a-b;
            System.out.println("The answer is "+sub);

        }
        //Function for multiplication
        public static void multiplication(int a, int b){
            int mul = a*b;
            System.out.println("The answer is "+mul);
        }
        //Function for division
        public static void division(int a, int b){
            double div = (double) a/b;
            System.out.println("The answer is "+div);

        }

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcomme to our calculator !");
            System.out.println("What do you want to do! \nPress number 1 for Addition\nPress number 2 for Subtraction\nPress number 3 for Multiplication\nPress number 4 for Division ");
            System.out.print("press your option : ");
            int press = scanner.nextInt();
            // Input numbers
            System.out.print("Enter number : ");
            int number1  = scanner.nextInt();
            System.out.print("enter number : ");
            int number2 = scanner.nextInt();

            switch(press){
                case 1 : addition(number1, number2);
                    break;
                case 2 : subtraction(number1 , number2);
                    break;
                case 3 : multiplication(number1, number2);
                    break;
                case 4 : division(number1, number2);
                    break;
                default: System.out.println("Invalid operator");
            }
        }

    }


