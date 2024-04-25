package src.OOPS_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab170 {
    public static void main(String[] args) throws Exception {
        readFile("c://alak.txt");

    }

    static void readFile (String fileName) throws Exception
    {
        File f = new File(fileName);
        FileReader fileReader = new FileReader(fileName);

        if(fileName.length() == 0)
        {
            throw new FileNotFoundException(" Unable to locate file");
        }
        System.out.println(" Not vul code");


    }
}
