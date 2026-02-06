import java.util.Scanner;

public class MaximumWithoutComparison {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();
        int temp1 = num1;
        System.out.print("Enter Second num: ");
        int num2 = ~sc.nextInt() + 1;
        int temp2 = num2;

        while(num2!=0) {
            int carry = (num1 & num2) << 1;
            num1 = num1 ^ num2;
            num2 = carry;
        }
        int sign = (num1>>31)&1;

        if(sign == 0){
            System.out.println(temp1);
        }else{
            System.out.println(temp2);
        }
    }
}
