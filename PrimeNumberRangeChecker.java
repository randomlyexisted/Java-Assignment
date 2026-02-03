import java.util.Scanner;

public class PrimeNumberRangeChecker {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range from and to: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i=num1; i<num2; i++){
            if(i==0|| i==1){
                continue;
            }
            boolean isPrime = true;
            for(int j=2; j<=i/2 ; j++){
                if(i%j == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
