package Exercises;

import java.util.Scanner;

public class Eligible_to_vote {
    public static void main(String[] args) {
        System.out.println("Enter your age to check whether you are eligible to vote or not:");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if (age>=18){
            System.out.println(age+" you are eligible to vote");

        }
        else{
            System.out.println(age+" Sorry! you are not eligible to vote");
        }
    }
}
