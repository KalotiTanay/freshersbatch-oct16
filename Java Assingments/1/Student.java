import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[][] = new int[3][3];
        int totalMks=0,sub1=0,sub2=0,sub3=0;
        System.out.println("");

        for(int i = 0;i< marks.length;i++)
        {   totalMks = 0;
            System.out.println("Entering the details of "+(i+1)+" student. ");
            for (int j=0;j<marks[i].length;j++)
            {
                System.out.println("Enter the mark in subject "+(j+1));
                marks[i][j]= sc.nextInt();
                totalMks+=marks[i][j];
                if (j==0)
                    sub1+=marks[i][j];
                else if (j==1)
                    sub2+=marks[i][j];
                else
                    sub3+=marks[i][j];
            }

            System.out.println("\nTOTAL MARKS OBTAINED BY STUDENT "+(i+1)+" is "+totalMks);
            System.out.println("AVERAGE MARKS OBTAINED BY STUDENT "+(i+1)+" is "+(totalMks/3));
        }
        System.out.println("\nTotal Marks in Subject 1   : " +sub1 );
        System.out.println("Average Marks in Subject 1 : " +(sub1/3) );
        System.out.println("Total Marks in Subject 2   : " +sub2 );
        System.out.println("Average Marks in Subject 1 : " +(sub2/3) );
        System.out.println("Total Marks in Subject 3   : " +sub3 );
        System.out.println("Average Marks in Subject 3 : " +(sub3/3) );
    }
}
