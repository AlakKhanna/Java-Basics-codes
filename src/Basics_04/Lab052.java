package src.Basics_04;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        //double x,y,z

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the x value ");
        double X = sc.nextDouble();

        System.out.println("Please enter the y value ");
        double Y = sc.nextDouble();

        System.out.println("Please enter the Z value ");
        double Z = sc.nextDouble();

        sc.close();

        Double result = Math.cbrt(Math.pow(X,2)+ Math.pow(Y,2) - Math.abs(Z));
        System.out.println(result);



    }
}
