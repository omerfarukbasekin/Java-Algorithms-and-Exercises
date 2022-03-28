
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class NonStopWorker {


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter a Number for Check is it Primer Number : ");
            int num=scn.nextInt();
            System.out.println(primerNumFunc(num));
            System.out.print("Do you want to continue y/n? ");
            choice = scn.next().charAt(0);
        }while (choice=='y' || choice == 'Y');
        

           
        }
    
    public static String primerNumFunc(int num){

        for (int i = 2; i < num; i++) {
           if(num%i == 0)
               return "Number is not primer num";
        }
        return "Number primer num";
    }
    }
    

