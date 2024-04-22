package src.OOPS_07;

public class Lab0115 {
    public static void main(String[] args) {

        int[] array= {1,2,1,2,5,3,4,4,8,9,0};
        System.out.println(array.length);

        for (int i =0; i<=array.length-1; i++)
        {
            for (int j = i+1; j<=array.length-1; j++)
            {
                if (array[i]== array[j])
                {
                    System.out.println(array[j]);
                }
            }
        }






    }
}
