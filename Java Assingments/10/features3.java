package myJAVAPkg;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;


public class features3 {

    public static void main(String[] args) throws IOException {
        var path = "https://capgemini-my.sharepoint.com/personal/onkar_deshpande_capgemini_com/_layouts/15/onedrive.aspx?id=%2Fpersonal%2Fonkar%5Fdeshpande%5Fcapgemini%5Fcom%2FDocuments%2FCase%20Study%20%26%20Assignment%2FCore%20Java%2FJava11Assignments%5FStudentList%2Etxt&parent=%2Fpersonal%2Fonkar%5Fdeshpande%5Fcapgemini%5Fcom%2FDocuments%2FCase%20Study%20%26%20Assignment%2FCore%20Java&originalPath=aHR0cHM6Ly9jYXBnZW1pbmktbXkuc2hhcmVwb2ludC5jb20vOnQ6L3Avb25rYXJfZGVzaHBhbmRlL0VTdFdjRHVyd2pOTnVfZHBwSmQxdllJQlcyekw1ZlozTGdEYVpwNHNMVGtWQnc%5FcnRpbWU9WVBVN1dUOXoyVWc";
        try {
            String names=Files.readString(Path.of(path));
            ArrayList<String > studentsName = new ArrayList<>(Arrays.asList(names));

            System.out.println(studentsName);
            studentsName.forEach(p->p.trim());
            System.out.println("\n"+studentsName.get(1));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}