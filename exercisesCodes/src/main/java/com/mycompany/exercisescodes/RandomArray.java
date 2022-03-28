
package com.mycompany.exercisescodes;

import java.util.Random;


public class RandomArray {


    public static void main(String[] args) {
        int[] arrayRandom = new int[5];
        Random rnd = new Random();
        // int x = rnd.nextInt(50);
        
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = rnd.nextInt(15,50);
        }
        
        System.out.println("sayilar : ");
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.println(arrayRandom[i]);
        }
        
        System.out.println("Değerlerin küçükten büyüğe doğru sıralama işlemi");

        for (int i = 0; i < arrayRandom.length-1; i++) { //i=0 j=1, i=0 j=2 i=0 j=3... i=1 j=2
            
            for (int j = i+1; j < arrayRandom.length; j++) {
                if(arrayRandom[i] > arrayRandom[j]){
                    int temp;
                    temp = arrayRandom[i];
                    arrayRandom[i] = arrayRandom[j];
                    arrayRandom[j] = temp;
                    
                }
            }
           
        }
         for (int j = 0; j < arrayRandom.length; j++) {
                System.out.println(arrayRandom[j]);
            }
        for (int i = 0; i < arrayRandom.length; i++) {
                    if(arrayRandom[i]%2!=0)
                        System.out.println("tek : " + arrayRandom[i]);
                    
                  
        }
    }
    
}
