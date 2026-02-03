import java.util.Scanner;

public class SmartBillingSystem {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter Item price: ");
        double price = sc.nextDouble();

        double total_price = quantity*price;

        if(total_price>= 5000){
            total_price -= total_price*0.1;
        }else if(total_price >=2000){
            total_price -= total_price*0.05;
        }
        // adding GST
        total_price += total_price*0.18;
        System.out.println("Total bill is: "+ total_price);
    }
}
