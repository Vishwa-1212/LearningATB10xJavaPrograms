package Exercises;

import java.util.Scanner;

public class Maximun_of_two_number {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        if (num1>num2){
            System.out.println(num1 +" is maximum and "+num2+" is minimum" );
        }
        else{
            System.out.println(num2 +" is maximum and "+num1+" is minimum");
        }
    }
}
