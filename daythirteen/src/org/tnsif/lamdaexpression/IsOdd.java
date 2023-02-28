package org.tnsif.lamdaexpression;


	//program to demonstrate on Lambda Expression to implement functional interface
	/*below annotation ensures that interface contains only 
	one abstract method*/
	@FunctionalInterface
	public interface IsOdd {
		boolean checkOdd(int a);

	}



