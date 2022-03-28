
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class OzantheLittle {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberEntered;
        while (true) {            
            System.out.println("Enter a num : ");
            numberEntered = scn.nextInt();
            System.out.println(numberEntered);
            if (numberEntered == 35)
                return;
            
        }
    }
    
}
