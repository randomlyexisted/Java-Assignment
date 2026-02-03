import java.util.Scanner;

public class ReverseAndDigitAnalysis {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int count =0;
        int sum = 0;
        int reverse =0;
        while(num>0){
            int dig = num %10;
            reverse = reverse*10 + dig;
            sum += dig;
            count++;
            num/=10;
        }
        System.out.println("Reverse: "+ reverse+ "\nSum of digits: "+sum+"\nCount of digits: "+count);
    }
}
