package src.Basics_06;

public class Lab084 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for (int b :arr)
        {
            System.out.print(b + " ,");
        }

        System.out.println();

        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " '");
        }
        System.out.println();

        for (int i =0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i] + " ,");
        }

    }
}
