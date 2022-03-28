
package com.mycompany.exercisescodes;

public class SpelLettersSpace {


    public static void main(String[] args) {
        System.out.println(backSpell("ozann"));
        underLineFunc("omerr");
        
    }
    public static String backSpell(String kelam){
        String kelamulkel = "";
        for (int i = kelam.length()-1; i >= 0; i--) {
            kelamulkel += kelam.charAt(i);
        }
        return kelamulkel;
    }
    public static String underLineFunc(String kelime ){
        char[] newForm = new char[kelime.length()];
        for (int i = 0; i < kelime.length(); i++) {
            newForm[i] = kelime.charAt(i);
        }
        for (int i = 0; i < newForm.length; i++) {
            System.out.println(newForm[i]);
        }
        return "";
    }
    
}
