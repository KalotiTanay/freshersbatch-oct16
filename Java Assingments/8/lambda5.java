package myLambdaPKG;

import java.util.ArrayList;
import java.util.List;

public class lambda5 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("robin went to the");
        myList.add("FOREFATHER'S EVE");
        myList.add("yesterday night!");

        myList.replaceAll(str->str.toUpperCase());
        System.out.println(myList);
    }
}
