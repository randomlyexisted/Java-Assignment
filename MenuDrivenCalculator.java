import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator: ");
        char oper = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch(oper){
            case '+' -> System.out.print(num1+num2);
            case '-' -> System.out.print(num1-num2);
            case '*' -> System.out.print(num1*num2);
            case '/' -> System.out.print(num1/num2);
            case '%' -> System.out.print(num1%num2);
            default -> System.out.print("Invalid operator");
        }
    }
}
