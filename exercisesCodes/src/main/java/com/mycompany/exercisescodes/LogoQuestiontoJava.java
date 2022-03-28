
package com.mycompany.exercisescodes;

import java.util.ArrayList;

public class LogoQuestiontoJava {

public static void main(String[] args) {
	System.out.println(Execute("Logo 11 elma -10 111 69"));
	}
	
	public static ArrayList<Integer> Execute(String input){
	    String[] array = input.split(" "); //lenght , chatAt() , parseInt() , valueOf()
	    //array[0] = Logo
	    //array[1] = 11
	    //array[2] = elma
	    //array[3] = -10
	    //array[4] = 111
	    //array[5] = 69
	    
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    
	    for (int i = 0; i < array.length;){ //i[0]: Logo, i[1]: 11
	        try{
	            result.add(Integer.parseInt(array[i])); //array[0]:Logo int'e çevrilemeyecek exception fırlatacak
	            i++;
	        }
	        catch(Exception e){
	            i++;
	        }
	        
	    }
	    
	    //bu döngü sonucu result ArrayList'i result = {11,-10,111,69}
	    
	    for(int i = 0; i< result.size()-1;i++){ //i=0
	        for(int y = i+1; y < result.size();y++){ //i=0 iken y=1, i=0 iken y=2, ... i=1,y=o
	            if(result.get(i) > result.get(y)){
	                int temp;
	                temp = result.get(i);
	                result.set(i,result.get(y)); //virgülün solu index no yu sağ kısmı ise value kısmı 
	                result.set(y,temp);
	                
	            }
	        }
	    }
	    
	    //11 -10 111 69
	    //1 kez çalıştıktan sonra -10 11 111 69
	    //3.kez çalıştıktan sonra -10 11 69 111
	    
	    return result;
	}
    
}
