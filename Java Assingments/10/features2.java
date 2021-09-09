package myJAVAPkg;

import java.util.Arrays;

public class features2 {

    public static void main(String[] args) {
        String str = "A quick brown fox jumps over a lazy dog";
        String[] arrayList = str.split(" ");
        System.out.println(Arrays.toString(arrayList));
        String[] str2=Arrays.stream(arrayList).toArray(size->new String[size]);
        System.out.println(Arrays.toString(str2));
    }
}