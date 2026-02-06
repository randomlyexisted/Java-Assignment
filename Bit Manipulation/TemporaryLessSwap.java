import java.util.Scanner;

public class TemporaryLessSwap {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second num: ");
        int num2 = sc.nextInt();

        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

        System.out.println("The value of num1 now is "+num1);
        System.out.println("The value of num2 now is "+num2);
    }
}
