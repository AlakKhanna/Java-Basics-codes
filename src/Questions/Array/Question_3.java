package src.Questions.Array;

public class Question_3 {
    public static void main(String[] args) {
        int [] marks = {82,92,93,90};
        int sum =0;

        for (int element: marks)
        {
            sum = sum + element;
        }
        System.out.println(" this is the average value of marks " + sum/marks.length);
    }
}
