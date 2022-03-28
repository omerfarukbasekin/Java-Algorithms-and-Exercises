
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class HeightWeightIndex {

  
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Your height : ");
        float height = scn.nextFloat();
        System.out.println("he"+height);
        System.out.println("Your weight : ");
        int weight = scn.nextInt();
        System.out.println("weight"+weight);
        System.out.println("Height Weight Index is: "+inputFunc(height,weight));
        
    }
    
    public static float inputFunc(float height, float weight){
        System.out.println("h"+height+"w"+weight);
        return weight/(height*height);
    }
    
}
