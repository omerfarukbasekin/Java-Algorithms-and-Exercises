
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class WhichOneisBigger {

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner scn=new Scanner(System.in);
        System.out.println("First number is : ");
        num1=scn.nextInt();
        System.out.println("Second number is : ");
        num2=scn.nextInt();
        System.out.println("The bigger number is : "+ biggerFunc(num1, num2));
    }
    public static String biggerFunc(int num1, int num2){
        int question;
        String answer;
        question = num1 - num2;
        if(question == 0){
            answer = "Fist number and Second is Equal";
        }
        else if(question > 0){
            answer = "First number is bigger then Second one";
        }
        else{
            answer = "Second number is bigger then First one";
        }
        return answer;
    }
    
}
