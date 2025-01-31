package Exercises;

import java.util.Scanner;

public class Positive_or_Negative {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num>0){
            System.out.println(num +" is a Positive number");
        } else if (num==0) {
            System.out.println(num +" is neigther Positive nor Negative");

        }
        else {
            System.out.println(num +" is a Negative number");
        }

    }
}
