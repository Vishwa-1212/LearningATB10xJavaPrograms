package Exercises;

import java.util.Scanner;

public class Alphabetornot {
    public static void main(String[] args) {
        System.out.println("Enter character");
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().charAt(0);
        if (Character.isLetter(ch)){
            System.out.println("is an alphabet");
        }
        else {
            System.out.println("not an alphabet");
        }
    }
}
