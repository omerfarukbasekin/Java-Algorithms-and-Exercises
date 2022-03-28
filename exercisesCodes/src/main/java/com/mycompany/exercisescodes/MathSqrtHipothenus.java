
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class MathSqrtHipothenus {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("triangles height : ");
        int x = scn.nextInt();
        System.out.println("triangles width : ");
        int y = scn.nextInt();
        double hippo = Math.sqrt(x*x+y*y);
        System.out.println("Hipothenus : "+ hippo);
    }
    
}
