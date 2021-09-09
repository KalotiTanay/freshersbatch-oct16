package myLambdaPKG;

import java.util.ArrayList;
import java.util.List;

public class lambda3 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("Hey there!");
        list1.add("Hello World");
        list1.add("I am a boy");
        list1.add("Manners Mekith Man");
        list1.add("Mumbai Indians");
        list1.add("AmhiMemekars");
        list1.add("Ok class, Silence please.");
        list1.removeIf(s->s.length()%2!=0);
        list1.forEach(System.out::println);
    }
}
