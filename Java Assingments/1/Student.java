import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[][] = new int[3][3];
        int total=0,sub1=0,sub2=0,sub3=0;
        
        for(int i = 0;i< marks.length;i++)
        {   total = 0;
            System.out.println("Fill the details of student "+(i));
            for (int j=0;j<marks[i].length;j++)
            {
                System.out.println("Enter the mark in subject "+(j+1));
                marks[i][j]= sc.nextInt();
                total+=marks[i][j];
                if (j==0)
                    sub1+=marks[i][j];
                else if (j==1)
                    sub2+=marks[i][j];
                else
                    sub3+=marks[i][j];
            }

            System.out.println("\nTOTAL MARKS OBTAINED BY STUDENT "+(i+1)+": "+total);
            System.out.println("AVERAGE MARKS OBTAINED BY STUDENT "+(i+1)+": "+(total/3));
        }
        System.out.println("\nTotal Marks:\nSubject 1:\t"+sub1+"\nSubject2:\t"+sub2+"\nSubject3:\t"+sub3 );
        System.out.println("\nAverage Marks:\nSubject 1:\t"+(sub1/3)+"\nSubject2:\t"+(sub2/3)+"\nSubject3:\t"+(sub3/3));
    }
}
