package javaFSDPhase1AssidtedPRojects;

	import java.util.*;
	class MapoExample {
		public static void main(String args[])
		{

			// Initialization of a Map
			// using Generics
			Map<Integer, String> hm1
				= new HashMap<Integer, String>();

			// Inserting the Elements
			hm1.put(new Integer(1), "Apple");
			hm1.put(new Integer(2), "Apple");
			hm1.put(new Integer(3), "Apple");

			System.out.println("Initial Map " + hm1);

			hm1.put(new Integer(2), "Red");

			System.out.println("Updated Map " + hm1);
		}
	}



