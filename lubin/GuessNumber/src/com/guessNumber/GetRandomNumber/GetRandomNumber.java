package com.guessNumber.GetRandomNumber;

import java.util.Random;

public class GetRandomNumber{
 public static String GetRandomNumber(int n) {   
     String [] seed = {"0","1","2","3","4","5","6","7","8","9"};  
     int len=seed.length;
     String  ranArr ="";   
     Random ran = new Random();   
     for(int i = 0 ; i<n ; i++){  
    	 String tem;
         int j = ran.nextInt(len-i); 
         ranArr += seed [j];  
         tem=seed[len-1];
         seed[len-1]=seed[j];
         seed[j]=tem;
         len--;
     }   
     return ranArr;
   
 }   
}
