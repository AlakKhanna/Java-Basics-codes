package src.Basics_06;

public class Lab088 {
    public static void main(String[] args) {

        int[] marks = new int[4];
        marks[0]= 90;
        marks[1]= 80;
        marks[2]= 70;
        marks[3]= 60;

        int i =0;
        while (i<marks.length)
        {
            System.out.print(marks[i] + " , ");
            i++;
        }
        System.out.println();
        int j =0;
        do {
            System.out.print(marks[j] + " , ");
            j++;
        }while (j<marks.length);


    }
}
