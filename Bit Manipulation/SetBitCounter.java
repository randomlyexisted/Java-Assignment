import java.util.Scanner;

public class SetBitCounter {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();

        int setCount = 0;
        while(num>0){
            setCount += num & 1;
            num = num >> 1;
        }
        System.out.println(setCount);
    }
}
