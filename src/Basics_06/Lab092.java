package src.Basics_06;

public class Lab092 {
    public static void main(String[] args) {
//2d array

        int [][] arr = new int[3][3];
        int [][] arr2 = new int[3][3];
        arr[0][0] =12;
        arr[0][1] =34;
        arr[0][2] =97;

        arr[1][0] =100;
        arr[1][1] =98;
        arr[1][1] =45;

        arr[2][0] =1;
        arr[2][1] =43;
        arr[2][2] =45;

        for (int i =0; i<arr.length; i++)
        {
            for (int j =0; j<arr[i].length; j++)
            {
                System.out.print(arr [i] [j] + "\t");
            }
            System.out.println();
        }

    }
}
