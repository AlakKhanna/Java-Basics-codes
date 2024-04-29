package src.Questions;

public class Question_14 {
    public static void main(String[] args) {

        int [] arr ={ 10,13, 4, 5, 2, 1, 0, 1, 2, 4, 10};

        for (int i =0; i<arr.length; i++)
        {
            int temp =0;

            for (int j = 1+i ; j<arr.length; j++)
            {
              if (i<j)
              {
                  temp = arr[j];
                  arr[j]= arr[i];
                  arr[i]= temp;
              }
            }
        }
        for (int i =0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }


    }


}
