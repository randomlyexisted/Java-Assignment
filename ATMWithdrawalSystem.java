import java.util.Scanner;

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Balance: ");
        int balance = sc.nextInt();
        System.out.print("Enter Withdrawal amount: ");
        int amount = sc.nextInt();
        if (amount % 100 == 0) {
            if (balance - amount >= 1000) {
                System.out.println("Success");
            } else {
                System.out.println("Failure");
            }
        } else {
            System.out.println("Failure");
        }
    }
}
