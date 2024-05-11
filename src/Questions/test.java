package src.Questions;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {

        String input = "abcdedartfgaab";
        char[] chararray= input.toCharArray();

        int count =0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i =0; i<chararray.length; i++)
        {
            count =0;
           for (int j =0; j< chararray.length; j++)
           {
               if (chararray[i]==chararray[j])
               {
                   count++;
               }
           }
           map.put(chararray[i],count);
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> map2 : map.entrySet())
        {
            System.out.println(map2.getKey() + " = " + map2.getValue());
        }
    }


}
