package src.Basics_06;

public class Lab083 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
        int arr2 []= {1,2,3,4};
        System.out.println(arr==arr2);
        //both are not equal because both saved by JVM differently
        //memory allocation is different
        int arr3[] = arr;
        System.out.println(arr3 == arr);
        System.out.println(arr.equals(arr2));

        arr3[0]= 24;
        System.out.println(arr3[0]);
        System.out.println(arr[0]);

    }
}
