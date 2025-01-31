package Exercises;

import java.util.Scanner;

public class Largest_of_Three {
    public static void main(String[] args) {
        System.out.println("Enter three number to check largest one among them");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a +"is the largest number");
        } else if (b>c) {
            System.out.println(b +"is the largest number");

        }
        else {
            System.out.println(c +"is the largest number");
        }
    }
}