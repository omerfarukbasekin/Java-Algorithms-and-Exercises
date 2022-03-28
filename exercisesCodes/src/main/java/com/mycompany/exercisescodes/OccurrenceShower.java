
package com.mycompany.exercisescodes;


public class OccurrenceShower {

    public static void main(String[] args) {

        System.out.println(occurranceFunc("ozanozannoanans"));
    }
    public static String occurranceFunc(String sasa){
       String asas = "";
        for (int i = 0; i < sasa.length()-1; i++) {
            for (int j = i+1; j < sasa.length(); j++) {
                if(sasa.charAt(i) == sasa.charAt(j) && kontroller(sasa.charAt(i),asas)){
                  asas += sasa.charAt(i);
                }
            }
        }
        
        return asas;
    }
    public static boolean kontroller(char sasa, String asas){
        boolean returner = true;
        for (int i = 0; i < asas.length(); i++) {
            
                if (asas.charAt(i)==sasa) {
                    returner = false;
                
            }
        }
        return returner;
    }
    
}
