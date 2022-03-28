

package com.mycompany.exercisescodes;




public class StarGenerator {

    public static void main(String[] args) {
        starFonk();
        
    }
    
    public static void starFonk(){
            
        for (int i = 0; i < 10; i++) {
            System.out.print("\n");
            for (int t = 10; t >= i+2; t--) {
                System.out.print("-");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                if (i==0) {
                    System.out.print("*");
                }
                if(i >= 1){
                    System.out.print("*");
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.print("\n");
            for (int t = 0; t <= i; t++) {
                System.out.print("-");
            }
            for (int j = 9; j >= i+1; j--) {
                System.out.print("*");
              if (i==9) {
                    System.out.print("*");
                }
                if(i <= 8){
                    System.out.print("*");
                }
            }
        }
        
    }
    
}
