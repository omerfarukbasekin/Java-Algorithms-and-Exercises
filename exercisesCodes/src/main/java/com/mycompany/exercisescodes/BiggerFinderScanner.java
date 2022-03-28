
package com.mycompany.exercisescodes;

import java.util.Scanner;


public class BiggerFinderScanner {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String girilenSayilar;
        System.out.print("Siralanmasini istediginiz sayilari boslularla giriniz :");
        girilenSayilar = scn.nextLine();
        System.out.println("En buyuk sayi : "+enbuyukBulucu(girilenSayilar));
    }
    public static int enbuyukBulucu(String say){
        String[] enBuyuk = say.split(" ");
        int[] enBuyukSayi = new int[enBuyuk.length];
        int buyukDonus = 0;
        for (int i = 0; i < enBuyuk.length; i++) {
            enBuyukSayi[i] = Integer.parseInt(enBuyuk[i]);
        }
        
        for (int i = 0; i < enBuyuk.length-1; i++) {
            for (int j = i+1; j < enBuyuk.length; j++) {
                if (enBuyukSayi[i] < enBuyukSayi[j]) {
                    int temp;
                    temp = enBuyukSayi[i];
                    enBuyukSayi[i] = enBuyukSayi[j];
                    enBuyukSayi[j] = temp;
                }
            }
        }
        buyukDonus = enBuyukSayi[0];
        return buyukDonus;
    }
    
}
