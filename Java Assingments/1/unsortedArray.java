import java.util.Scanner;

public class unsortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("enter the number to search: ");
        int n = sc.nextInt();
        for (int c : arr) {
            if (n == c) {
                System.out.println("element found !!");
                break;
            }
            else System.out.println("Element not found !!");
        }
    }
}
