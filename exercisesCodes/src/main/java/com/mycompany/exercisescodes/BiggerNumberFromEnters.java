
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class BiggerNumberFromEnters {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ans;
        int bigger = 0, smaller = 99910;
        do {            
            System.out.println("Enter a number for compare : ");
            int num = scn.nextInt();
            if(num > bigger)
                bigger = num;
            if(num < smaller)
                smaller = num;

            System.out.println("Do you wanna keep doing this y/n ? :");
            ans=scn.next().charAt(0);
        } while (ans == 'y' || ans == 'Y');
        System.out.println("Bigger number is : " + bigger);
        System.out.println("Smaller number is : " + smaller);
    }

}
