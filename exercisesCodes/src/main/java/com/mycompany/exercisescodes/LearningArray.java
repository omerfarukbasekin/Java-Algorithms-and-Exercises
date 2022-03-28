
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class LearningArray {

    public static void main(String[] args) {
        
        //3 farklı şekilde dizi oluluşturabiliriz
        
        String[] arrayExp = {"süslü" , "little" ,"the ozan"};
        int[] arrayExpInt = new int[3];
        for (int i = 0; i < arrayExpInt.length; i++) {
            arrayExpInt[i] = i+1;
        }
        for (int i = 0; i < arrayExpInt.length; i++) {
            System.out.println(arrayExpInt[i]);
        }
        System.out.println(arrayExpInt);
        
        int[] arrayExpDinamic;
        Scanner scn = new Scanner(System.in);
        int sizeofArrays = 0;
        System.out.print("Enter size of array : ");
        sizeofArrays = scn.nextInt();
        arrayExpDinamic = new int[sizeofArrays];
        System.out.println(arrayExpDinamic.length);
        
    }
    
}
