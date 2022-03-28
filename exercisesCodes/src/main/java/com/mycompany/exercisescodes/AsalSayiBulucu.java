

package com.mycompany.exercisescodes;




public class AsalSayiBulucu {

    public static void main(String[] args) {
        System.out.println("Asal sayi bulucu!");
        System.out.println("1'den 30'a kadar olan asal sayilar için ");
        
        asalSayiFonk();
        
        
    }
    
    public static void asalSayiFonk(){
            for (int i = 2; i < 100; i++) {
            int sayac = 0;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    sayac++;
                    break;
                }
            }
            if (sayac == 0) {
                System.out.println("sayi" + i);
                
            }
        }
    }
    
}
