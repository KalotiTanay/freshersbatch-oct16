import java.util.Scanner;

public class armstrong2 {

    public static void main(String args[]){
        int temp, num, count=0;

        //Loop for finding armstrong numbers in range of 100-999.

        for(int i=100; i<=999; i++){
            int sum=0;
            num=i;
            while(num>0){
                temp=num%10;
                sum+=(temp*temp*temp);
                num=num/10;
            }
            if(sum==i){
                System.out.println("\nCondition satisfied for: "+i);
                count++;
            }
        }
        System.out.println("\nTotal armstrong numbers found are: "+count);
    }
}
