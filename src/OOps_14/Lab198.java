package src.OOps_14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab198 {
    public static void main(String[] args) {

        Map<String, Integer> hm = new LinkedHashMap<>();
        hm.put("id", 1);
        hm.put("id2", 2);
        hm.put("id3", 3);
        System.out.println(hm);
        System.out.println(hm.isEmpty());
        System.out.println(hm.size());
        System.out.println(hm.containsKey("id"));
        System.out.println(hm.containsKey("ID"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());


        for (Map.Entry<String, Integer> item: hm.entrySet())
        {
            System.out.println(item.getKey() + " = " + item.getValue());
        }



    }
}
