
package com.mycompany.exercisescodes;

import java.util.Scanner;

public class FindBiggerandSmallerNumber {


    public static void main(String[] args) {
        //String[] names = {"omer","kucuk-ozan"};
        //System.out.println(combiner(names));
        Scanner scn = new Scanner(System.in);
        int i;
        System.out.println("How many time do you wanna work : ");
        i = scn.nextInt();
        while (i>0) {        
            System.out.println(i);
            i--;
        }
  
        
    }
    //public static String combiner(String[] isimler){
        //return isimler[0]+isimler[1];
    //}
}
