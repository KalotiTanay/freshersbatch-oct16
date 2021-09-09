package myExceptionPkg;

import java.util.Scanner;

public class unsupportedException {

    public static void main(String[] args) throws ArithmeticException{
        try {
            divide();
        }
        catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Exception handled ");
    }

    private static void divide() throws ArithmeticException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend: ");
        int Dividend = sc.nextInt();

        System.out.println("Enter the divisor: ");
        int Divisor = sc.nextInt();

        if (Divisor==0)
            throw new UnsupportedOperationException("UnsupportedOperationException caught");
        int result;
        result=Dividend/Divisor;

        System.out.println("Result is : "+result);
    }
}
