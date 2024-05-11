package src.Questions;


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class worldcount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr your string here ");
        String input= sc.nextLine();

        String[] split = input.split(" ");
        int count =0;

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i =0; i<split.length; i++)
        {
            count =0;
            for (int j=0; j<split.length; j++)
            {
                if (split[i].equals(split[j]))
                {
                    count++;
                }
            }
            map.put(split[i], count);
        }
        System.out.println(map);


    }
}
