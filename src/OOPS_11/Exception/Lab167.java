package src.OOPS_11.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab167 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "c://a.txt";
        File file = new File(path);
        FileReader filereader = new FileReader(file);


    }
}
