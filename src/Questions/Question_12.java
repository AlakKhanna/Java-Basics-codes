package src.Questions;

import src.OOPS_10.Abstraction.Interfaces.RealTimeExample.Break;

public class Question_12 {

    public static void main(String[] args) {


       for (int i =2; i<=100; i++)
       {
           int temp =0;
           for (int j =2; j<i; j++)
           {
               if (i%j ==0)
               {
                   temp = temp +1;
                   break;
               }
           }
           if (temp ==0)
           {
               System.out.println(" Prime Number " + i);
           }
//           else
//           {
//               System.out.println(" Non prime number " + i);
//           }
       }
    }
}
