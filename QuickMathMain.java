package com.qa.mainPackage;



/**
 * @author SmilingGecko
 *
 */
public class QuickMathMain {

	public int sumInput(int a, int b){
		return a + b; 
	}
	
	public int minusInput(int a, int b){
		return a - b;
	}
	
	public int multiplyInput(int a, int b){
		return a * b;
	}
	
	public float divideInput(float a, float b){
		return a /b;
	}
	
	public static void main(String[] args) {
		
		QuickMathMain thisTask = new QuickMathMain();
		
		System.out.println("If we add two Numbers together we get: " + thisTask. sumInput(10, 10));
		
		System.out.println("If we were to subtract then we get: " + thisTask.minusInput(10, 5));
		
		System.out.println("If we were to multiply then : " + thisTask.multiplyInput(5, 10));
		
		System.out.println("This is division WITHOUT modulo : " + thisTask.divideInput(10, 2));
		

	
		
		
	}

}
