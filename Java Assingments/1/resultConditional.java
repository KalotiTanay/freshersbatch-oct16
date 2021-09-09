import java.util.Scanner;

public class resultConditional {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sub1,sub2,sub3;

        System.out.println("Enter the marks:\nfirst subject: ");
        sub1 = sc.nextInt();
        System.out.println("second subject: ");
        sub2 = sc.nextInt();
        System.out.println("third subject: ");
        sub3 = sc.nextInt();

        if(sub1>60&&sub2>60&&sub3>60)
            System.out.println("PASSED");
        else if((sub1>60&&sub2>60)||(sub1>60&&sub3>60)||(sub2>60&&sub3>60))
            System.out.println("PROMOTED");
        else
            System.out.println("FAILED");
    }
}
