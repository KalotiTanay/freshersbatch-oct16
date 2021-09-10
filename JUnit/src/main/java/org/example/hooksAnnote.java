package org.example;

public class hooksAnnote {
    public int sample(int a){
        int b=1;
        while (a<5){
            System.out.println(a+"\n");
            b=a;
            a++;
        }
        return b;
    }
}
