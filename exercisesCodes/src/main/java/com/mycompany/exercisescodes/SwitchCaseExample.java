
package com.mycompany.exercisescodes;

import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("9'un faktöriyel hesabı yap 1\n 100'e kadar kaç tane tek var 2\n 100'e kadar kaç tane çift var 3");
        System.out.println("Sayi giriniz");
        int var=scn.nextInt();
        
        switch (var) {
            case 1 -> {
                int number = 1;
                for (int i = 1; i <= 9; i++) {
                    number = i*number;
                }
                System.out.println("faktoriyeli : "+ number);
                break;
            }
            case 2 -> {
                int ctr_even=0;
                for (int i = 100; i >= 0; i--) {
                    if (i%2 == 0) {
                        ctr_even++;
                        System.out.println(i);
                    }
                }
                System.out.println("çift sayi sayisi : "+ ctr_even);
                break;
            }
            case 3 -> {
                int ctr_odd=0;
                for (int i = 100; i >= 0; i--) {
                    if (i%2 != 0) {
                        ctr_odd++;
                        System.out.println(i);
                    }
                }
                System.out.println("tek sayi sayisi : "+ ctr_odd);
                break;
            }
            
            default -> throw new AssertionError();
        }
    }
    
}
