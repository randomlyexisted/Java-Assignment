import java.util.Scanner;

public class Multiplaction {

    static int add(int x, int y){
        while(y!=0) {
            int carry = (x & y) << 1;
            x = x ^ y;
            y = carry;
        }
        return x;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second num: ");
        int num2 = sc.nextInt();

        int result = 0;

        while(num2 != 0){
                if((num2 & 1) == 1){
                    result = add(result, num1);
                }

                num1 <<= 1;
                num2 >>= 1;
            }
        System.out.println(result);

    }
}
