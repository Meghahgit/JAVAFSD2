package javaFSDPhase1AssidtedPRojects;

public class Methodwithdifferentreturntype {

		  // method defined
		  private static int getSquare(int x){
		    return x * x;
		  }
		  private static double getcube(double x){
			    return x * x *x;
			  }
		 public static void display(){
			 System.out.println("Squares and cubes of numbers fron 1 to 5");
		 }

		  public static void main(String[] args) {
			  
		      // method call
			    display();

		    for (int i = 1; i <= 5; i++) {

		      // method call
		    	double result1 = getcube(i);
			      System.out.println("Cube of " + i + " is: " + result1);
		    }
		    
		    for (int j = 1; j <= 5; j++) {
		    	
			      // method call
		      int result2 = getSquare(j);
		      System.out.println("Square of " + j + " is: " + result2);
		    }
		  }
		}

