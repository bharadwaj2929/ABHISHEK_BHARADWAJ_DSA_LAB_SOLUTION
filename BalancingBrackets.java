package com.greatlearning.lab;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Inputs:");
		String inputs = scanner.next();
		System.out.println("Balanced Input:" + isBalanced(inputs));
		scanner.close();
		
	}
	
	static boolean isBalanced(String inputs){
		
		if(inputs.length()%2==1){
			
			return false;
			
		}
		
		else{
			
			Stack<Character> stack = new Stack<Character>();
			for(int i=0;i<inputs.length();i++){
				
				char ch = inputs.charAt(i);
				
				if(ch=='(' || ch=='{' || ch=='['){
					
					stack.push(ch);
				
				}
				
				else{
					
					char c = stack.pop();
					
					switch(ch){
					
						case ')': if(c=='{' || c=='[')
								  {
							      	return true;
							      	
								  }
						
						case '}': if(c=='(' || c=='[')
								  {
							      	return true;
							      	
								  }
						
						case ']': if(c=='(' || c=='{')
								  {
									return true;
									
								  }
					
					}
				
				}
			
			}
		
		}
		
		return false;
	
	}
	
}