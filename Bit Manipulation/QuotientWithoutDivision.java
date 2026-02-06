import java.util.Scanner;

public class QuotientWithoutDivision {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter divisor number: ");
        int num2 = sc.nextInt();
        int result =0;

        while(num1>=num2){

            int temp = num2;
            int multiple = 1;

            while(num1 >= (temp << 1)){
                temp = temp << 1;
                multiple = multiple << 1;
            }
            num1 = num1 - temp;
            result = result + multiple;

        }
        System.out.println(result);
    }
}
