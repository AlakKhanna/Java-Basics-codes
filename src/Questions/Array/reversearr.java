package src.Questions.Array;

import java.util.HashMap;
import java.util.Map;

public class reversearr {
    public static void main(String[] args) {

       String input ="Alak";
       char[] chararr = input.toCharArray();

       int count =0;

       Map<Character, Integer> map = new HashMap<>();

       for (int i=0; i<chararr.length; i++)
       {
           count= 0;
           for (int j=0; j<chararr.length; j++)
           {
            if (chararr[i]==chararr[j])
            {
                count++;
            }
           }
           map.put(chararr[i],count);
       }
        System.out.println(map);

    }
}
