package myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface Test{
}

public class annote1 {

    public static void main(String[] args) {
    printSum(10, 20);
    }
    @Test
    static void printSum(int a, int b){
        System.out.println(a+b);
        }
}
