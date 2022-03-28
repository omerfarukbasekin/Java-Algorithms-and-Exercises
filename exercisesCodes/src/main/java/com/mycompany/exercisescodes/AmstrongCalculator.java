
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class AmstrongCalculator {


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter for scannin is it amstrong :" );

        String a = scn.nextLine();
        dondurucu(a);
        }
        public static String dondurucu(String a){
        char[] b = new char[a.length()];
        int[] c = new int[a.length()];
        
        for (int i = 0; i < a.length(); i++) {
           b[i] = a.charAt(i);
        }
        for (int i = 0; i < a.length(); i++) {
             c[i] = Character.getNumericValue(b[i]);
             System.out.println(c[i]);
        }
        
        
        
        int isIt = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i]= c[i]*c[i];
            }
        }
        if (isIt == Integer.parseInt(a)) {
            System.out.println("What you enter is a amstrong "+a);
        }
        else{
            System.out.println("What you enter is not a amstrong"+a+" "+isIt);
        }
        return "";
        }
       
    }
    

