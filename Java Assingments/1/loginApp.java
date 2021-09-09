import java.util.Scanner;

public class loginApp {
    public static void main(String[] args) {
        int c=0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        String cred [][]= {
                {"user1","1234567890"},{"user2","qwerty"}
        };
        String user,pass;

        while(c<=3) {
            if (c == 3) {
                System.out.println("\nContact Admin");
                break;
            }
            System.out.println("\nenter the username:");
            user = sc.next();
            System.out.println("\nenter the password:");
            pass = sc.next();

            for (int i = 0; i < cred.length; i++){
                if (user.equals(cred[i][0]) && pass.equals(cred[i][1])) {
                    System.out.println("welcome " + cred[i][0]);
                    break;
                }
                else flag = false;
            }
            if (flag==false){
            System.out.println("Invalid Credentials! No of attempts left: " + (3 - c - 1));
            c++;
            }
        }
    }
}
