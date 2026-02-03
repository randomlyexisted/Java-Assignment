import java.util.Scanner;

public class LoginAuthenticationSystem {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String username = "randomlyexisted";
        String password = "********";
        int attempt = 3;
        boolean loginSuccess = false;
        while(attempt!=0 || loginSuccess){
            System.out.print("Enter Username: ");
            String userinput = sc.next();
            System.out.print("Enter Password: ");
            String passinput = sc.next();
            if(username.equals(userinput) && password.equals(passinput)){
                System.out.println("Login Success");
                break;
            }else{
                System.out.println("Wrong Credentials");
                attempt -= 1;
                System.out.println(attempt+" left");
            }
        }
        if(attempt==0){
            System.out.println("All attempts failed");
        }

    }
}

