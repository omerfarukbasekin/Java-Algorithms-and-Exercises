/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercisescodes;

import java.util.Scanner;


public class GirilenAsalSayiBulucu {

    public static void main(String[] args) {
        System.out.println("Prime number founder");
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter a number: ");
        int sayi =scan.nextInt();
        if (sayi == 0 || sayi == 1) {
            System.out.println("Number isn't a prime number");
            return;
        }
        primeNumberCheck(sayi);
    }
    public static void primeNumberCheck(int sayi){
        for (int i = 2; i < sayi; i++) {
            if (sayi%i == 0) {
                System.out.println("Number  isn't a Prime Number!");
                return;
            }
        }
        System.out.println("Number is a PRIME NUMBER");
    }
}
