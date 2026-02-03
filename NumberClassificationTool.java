import java.util.Scanner;

public class NumberClassificationTool {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is Negative");
        }
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        if(num%35 == 0){
            System.out.println("Number is divisible by both 7 and 5");
        }else{
            System.out.println("Number is not divisible by both 7 and 5");
        }

    }
}
