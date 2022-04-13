package javaFSDConstractorExample.java;

public class ConstructorDemo {

	
	public static void main(String[] args) {
	
				
		Display1 d = new Display1() ;   // non parameterized constructor
		  
		Add add= new Add(2,7);    //parameterized constructor
		{
		System.out.println("sum of num1 and num2 is"+" "+ ( add.num1 +add.num2));
		}
		
	}
}

