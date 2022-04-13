package javaFSDPhase1AssidtedPRojects;

public class Typecasting { 
	
		// Main driver method
		public static void main(String[] args)
		{

			// Double datatype
			double d = 100.04;

			// data from long datatype to integer type
			long l = (long)d;

			// Explicit type casting
			int i = (int)l;
			
            byte b=21;
            
			// implicit type casting
            int a=b;
            
			System.out.println("Int value " + i);
			
			System.out.println("Int value " + a);

			System.out.println("Double value " + d);

			System.out.println("Long value " + l);

			System.out.println("Int value " + i);
		}
	}



