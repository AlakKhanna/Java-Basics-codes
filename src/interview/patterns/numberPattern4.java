package src.interview.patterns;

public class numberPattern4 {

    public static void main (String[] args){
            int rows =0;
    {
        for (int i =1; i<=4;i++)
        {
            for (int j =4; j>=i; j-- )
            {
                rows = rows +1;
                System.out.print (rows + "  ");
            }
            System.out.println();
        }
    }
    }
}
