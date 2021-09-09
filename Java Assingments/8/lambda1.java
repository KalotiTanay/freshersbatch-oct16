package myLambdaPKG;
@FunctionalInterface
interface arithmetic {
    int operation(int a, int b);
}
public class lambda1 {
    public static void main(String[] args) {

        arithmetic add=(int a, int b)->a+b;
        System.out.println("Sum: "+add.operation(7,3));

        arithmetic s = (int a, int b)->a-b;
        System.out.println("Difference: "+s.operation(7,3));

        arithmetic m = (int a, int b)->a*b;
        System.out.println("Product: "+m.operation(7,3));

        arithmetic d = (int a, int b)->a/b;
        System.out.println("Division result: "+d.operation(7,3));
    }
}
