import java.util.Scanner;

public class interest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int period,time;
        float rate;

        System.out.println("enter the principle amount:");
        period = sc.nextInt();
        System.out.println("enter the rate:");
        rate = sc.nextInt();
        rate = rate / 100;
        System.out.println("enter the time period:");
        time = sc.nextInt();

        //Simple Interest
        System.out.println("simple interest: " +(period*rate*time));

        //Compound Interest
        double ci = (period*(Math.pow(1+rate,time)))-period;
        System.out.println("Compound interest: " + ci);
    }
}
