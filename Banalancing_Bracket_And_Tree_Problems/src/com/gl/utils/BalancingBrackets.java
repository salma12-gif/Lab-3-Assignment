package com.gl.utils;

import java.util.Stack;

public class BalancingBrackets {
  // p1
	// static function
	// arg.string
	
	// static boolean checkBalacingBracket(stringBrackets)
	// Init a stack 
	//across each character of the string 
	// if character is opening bracket...
	// push character to stack 
	
	//p2 
	//
	 
	public static boolean checkBanalacingBrackets(String bracketExpression) {
		Stack<Character> bracket= new Stack<Character>();
		for(int i=0;i<bracketExpression.length();i++) {
			char character = bracketExpression.charAt(i);
			if(character=='('|| character=='['|| character=='{'){
				bracket.push(character);
				continue;
			}
			if(bracket. isEmpty()) {
				return false;
			}
		
			// pop from the stack
			//switch case on the character 
			//}==>character !='{'=>return false 
			//default: return falsse
		}
		return true;
	}
}
