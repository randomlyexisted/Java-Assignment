import java.util.Scanner;

public class SubtractWithoutMinus {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second num: ");
        int num2 = ~(sc.nextInt()) + 1;

        while(num2!=0) {
            int carry = (num1 & num2) << 1;
            num1 = num1 ^ num2;
            num2 = carry;
        }
        System.out.println(num1);

    }
}
