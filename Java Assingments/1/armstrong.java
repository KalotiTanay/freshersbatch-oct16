import java.util.Scanner;

public class armstrong {

    public static void main(String args[]){

        //User input.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is an ARMSTRONG or not: ");
        int num= sc.nextInt();

        int  temp, sum=0;
        temp = num;

        //Loop to chek the Armstrong number condition.

        while(num!=0) {
            temp=num%10;
            sum+=(temp*temp*temp);
            num=num/10;
        }
         if (sum==temp)
             System.out.println(temp+ " is a ARMSTRONG number..!");
         else
             System.out.println(temp+ " is not a ARMSTRONG number..!");
    }
}
