package src.Questions.Array;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class charcatercount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String input = sc.nextLine();
        char[] chararr = input.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        int count = 0;
        for (int i = 0; i < chararr.length; i++) {
            count = 0;
            for (int j = 0; j <= i; j++)
            {
                if (chararr[i] == chararr[j]) {
                    count++;
                }
            }
            map.put(chararr[i], count);
            for (Map.Entry<Character, Integer> print: map.entrySet())
            {
                System.out.println(print.getKey() + " = " + print.getValue());
            }
        }
        System.out.println();
    }
}
