import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("Enter the integer value:");
        Scanner sc= new Scanner(System.in);

        int num= sc.nextInt();
        if (num%2==0){
            System.out.println(num + " is a even number");
        }
        else{
            System.out.println(num +" is an odd number");
        }


    }
}
