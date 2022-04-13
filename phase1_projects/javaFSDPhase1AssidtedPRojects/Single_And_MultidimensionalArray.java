package javaFSDPhase1AssidtedPRojects;

class Single_And_MultidimensionalArray {
    public static void main(String[] args) {
    	System.out.println("This is Single Dimentional Array\n");
    	System.out.println(SingleDimentionArray());
    	System.out.println("This is MultiDimentional Array\n");
    	System.out.println(MultidimensionalArray());

    	

    	
    	
    }
    	 static int MultidimensionalArray() {
    		  // create a 2d array
    	        int[][] a = {
    	        		
    	            {1, -2, 3}, 
    	            {-4, -5, 6, 9}, 
    	            {7}, 
    	        };
    	      
    	        // first for...each loop access the individual array
    	        // inside the 2d array
    	        for (int[] innerArray: a) {
    	            // second for...each loop access each element inside the row
    	            for(int data: innerArray) {
    	                System.out.println(data);
    	            }
    		
    	}
       return 0 ;
       
        }
    static int SingleDimentionArray()
    	 {
    		 int[] b= {1,2,3,4,5};
    		 for(int array:b) {
    			 System.out.println(array);
    		 }
			 return 0;

    	 }  
    	 }
