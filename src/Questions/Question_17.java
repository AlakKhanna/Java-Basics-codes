package src.Questions;

public class Question_17 {

    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,5,5,6,6,11,12,13,14,14,13};
        for (int i = 0; i<=arr.length-1; i++)
        {
            for (int j =1+i; j<=arr.length-1; j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.print(arr[i]  + " , ");
                }
            }
//            System.out.println();

        }
    }
}
