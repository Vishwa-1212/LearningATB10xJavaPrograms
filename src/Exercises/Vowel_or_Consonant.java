package Exercises;

import java.util.Scanner;

public class Vowel_or_Consonant {
    public static void main(String[] args) {
        System.out.println("Enter character to check whether it vowel or consonant");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().toLowerCase().charAt(0);
        switch (ch){
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch+" is an vowel" );
                break;
            default:
                System.out.println(ch+" is a consonant");

        }

    }
}
