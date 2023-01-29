package com.Q1.Serivce;

import java.util.*;
public class BracketBalance {

	// function to check if brackets are balanced
	public boolean areBracketsBalanced(String expr)
	{
		//      Using Stack class
		Stack <Character> stack = new Stack<>();
		
		int flag = 0;
		
		// Traversing the Expression
		for (int i = 0; i < expr.length(); i++)
		{
			char ch;
			
			char x = expr.charAt(i);


			if (x == '(' || x == '[' || x == '{')
			{
				// Push the element in the stack
				stack.push(x);
				continue;
			}

			if (x == ')' || x == ']' || x == '}') {
				
				if (stack.isEmpty())
					return false;
				
				else {
					
					ch = stack.pop();
					
					if( x =='}' && ch!='{') {
	                    flag=1;
	                    break;
	                }

	                if( x ==']'&& ch!='[') {
	                    flag=1;
	                    break;
	                }

	                if( x ==')'&&ch!='(') {
	                    flag=1;
	                    break;
	                }
				}
			}
		}
			
		if (flag == 0 && stack.isEmpty())
			return true;
		else
			return false;
			
	}

}
	

