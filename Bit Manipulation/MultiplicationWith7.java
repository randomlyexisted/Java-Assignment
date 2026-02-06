import java.util.Scanner;

public class MultiplicationWith7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num<<3;
        num = ~num + 1;

        while(num!=0){
            int carry = (result&num)<<1;
            result = result^num;
            num = carry;
        }
        System.out.println(result);
    }
}
