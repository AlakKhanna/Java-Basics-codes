package src.Questions.Array;
import java.util.Scanner;
public class Question_5 {

public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println (" Enter the array length here");
    int leng= sc.nextInt();
    int[] arrayLength= new int[leng];

    for (int i =0; i<leng; i++)
    {
        System.out.println("Enter you array values here");
        arrayLength[i]= sc.nextInt();
    }

    for (int i =0; i<arrayLength.length; i++)
    {
        System.out.println(arrayLength[i]);
    }


}

}
