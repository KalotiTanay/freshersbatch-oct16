package myLambdaPKG;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class lambda4 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hi there");
        list1.add("Roger that");
        list1.add("Yahoo");
        list1.add("Google drive");
        list1.add("Crap");

        Consumer<List<String>> displaylist = list->list.forEach(System.out::println);
        System.out.println("list elements: ");
        displaylist.accept(list1);
        StringBuilder s1 = new StringBuilder();
        Consumer<List<String>> modify = list2->list2.forEach(s ->s1.append(s.charAt(0)));
        modify.accept(list1);
        System.out.println("\n"+s1);
    }
}
