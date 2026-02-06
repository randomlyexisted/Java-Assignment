import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();
        int bill = 150;
        if(units<=100){
            bill += units*2;
        }else if(units>100 && units<=200){
            bill += 100*2+ (units-100)*3;
        }else{
            bill += 100*2+ 100*3+ (units-200)*5;
        }
        System.out.println("Total bill is: "+ bill);
    }
}
