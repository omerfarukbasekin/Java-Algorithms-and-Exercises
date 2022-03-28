
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class ArrayGlobalArray {

    public static void main(String[] args) {
        int[] firstArray;
        
        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter lenght of array : ");
        int arrayDistence=scn.nextInt();
        
        firstArray = new int[arrayDistence];
        
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print((i+1)+". degeri giriniz : ");
            firstArray[i]=scn.nextInt();
            
        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(+firstArray[i]);
        }
        
    }
    
}
