import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();

        System.out.println(num>0 && (num&(num-1))==0);
    }
}
