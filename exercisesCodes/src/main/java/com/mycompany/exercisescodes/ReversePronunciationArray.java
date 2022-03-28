
package com.mycompany.exercisescodes;

public class ReversePronunciationArray {

    public static void main(String[] args) {
        int[] firstArray = new int[5];
        
        // Adding 5  thing for firstArray
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (i+3);
        }
        //firstArray[0] = 3
        //firstArray[1] = 4
        //firstArray[2] = 5
        //firstArray[3] = 6
        //firstArray[4] = 7
        System.out.println(firstArray.length);
        // Write firstArray reverse pronunciation
        for (int i = firstArray.length-1; i >= 0; i--) {
            System.out.println(firstArray[i]);
        }
    }
    
}
