package myAnnotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
    int sequence();
}
public class annote3 {

    public static void main(String[] args) {

        annote3 obj = new annote3();
        Class c = obj.getClass();
        Annotation an = c.getAnnotation(Execute.class);
        Execute e = (Execute) an;
    }

    @Execute(sequence = 2)
    public static void method1(){
        System.out.println("method1");
    }
    @Execute(sequence = 1)
    public static void method2(){
        System.out.println("method2");
    }
    @Execute(sequence = 3)
    public static void method3(){
        System.out.println("method3");
    }
}
