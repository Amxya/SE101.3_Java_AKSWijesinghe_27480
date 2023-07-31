package com.mycompany.q4;
public class NewClass {
    //break
    int [] numbers = {10, 20, 30, 40, 50};
    for(int x : numbers ){
        if( x == 30 ){
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
            
      }
        System.out.println("I’m  out of the Loop now");   


//continue


    int [] numbers = {10, 20, 30, 40, 50};
    for(int x : numbers ){
        if( x == 30 ){
	    continue;
         }
         System.out.print( x );
         System.out.print("\n");
            
      }
        System.out.println("I’m  out of the Loop now");

}
    

