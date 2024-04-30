package src.Questions.Array;

public class Question_2 {
    public static void main(String[] args) {

        int [] marks = {82,92,93,90};
        int num= 90;
         boolean isArray = false;

         for (int element: marks)
         {
             if (num==element)
             {
                 isArray = true;
                 break;
             }
         }

         if (isArray)
         {
             System.out.println(" Num is present " + num);
         }
         else
         {
             System.out.println(" Num is not prsent " + num);
         }


    }
}
