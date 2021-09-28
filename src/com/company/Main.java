package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("choose number");
        Scanner input = new Scanner(System.in);
        Integer num1 = input.nextInt();
        //System.out.println(num1);
        Integer decision = (num1 % 2);
        if (decision == 0) {
            System.out.println("your number is even");
        }
        else {
            System.out.println("your number is odd");
        }

    }
}
