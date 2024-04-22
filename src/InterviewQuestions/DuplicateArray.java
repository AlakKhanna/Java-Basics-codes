package src.InterviewQuestions;

public class DuplicateArray {
    public static void main(String[] args) {

        int [] array = {2,2,2,3,4,5,6,4,5,6, 8,9,0};

                for (int i =0; i<=array.length-1; i++)
                {
                    for (int j = i+1; j<= array.length-1; j++)
                    {
                        if (array[i]== array[j])
                        {
                            System.out.println(array[i]);
                        }
                    }
                }
    }
}
