package com.gl.driver;

import com.gl.utils.BalancingBrackets;

public class Driver {
    
   public static void main(String[]args) {
	   String bracketExpression="{{}}";
	   boolean isBalanced= BalancingBrackets.checkBanalacingBrackets(bracketExpression);
	   if(isBalanced) {
		   System.out.println("The Entered String has Balanced brackets");
	   }else {
		   System.out.println("The entered String do not contain Balanced brackets");	 
	   }
   }

}
