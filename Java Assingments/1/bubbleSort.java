import java.util.Scanner;

public class bubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp;
        int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int len = arr.length;
        System.out.println("unsorted array:\n");
        for (int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        while(len!=0){
            for (int i =0;i<len-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            len--;
        }
        System.out.println("Array After bubble sort: /n");

        for (int i=0;i< arr.length;i++) System.out.println(arr[i]);
    }
}
