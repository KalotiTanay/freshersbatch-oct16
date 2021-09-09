package myExceptionPkg;

import java.util.Scanner;

public class dividendException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the dividend: ");

            int Dividend = sc.nextInt();
            System.out.println("Enter the divisor: ");

            int Divisor = sc.nextInt();
            int result;
            result=Dividend/Divisor;

            System.out.println("Result is : "+result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Exception Handled ");
    }
}
