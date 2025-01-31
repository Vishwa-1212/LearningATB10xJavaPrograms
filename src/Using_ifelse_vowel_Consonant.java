import java.util.Scanner;

public class Using_ifelse_vowel_Consonant {
    public static void main(String[] args) {
        System.out.println("Enter character to check whether it is vowel or consonant");
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().toLowerCase().charAt(0);
        if(ch=='a'|| ch=='e'||ch=='u'||ch=='o'||ch=='i') {
            System.out.println(ch + " is an vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }
    }
}
