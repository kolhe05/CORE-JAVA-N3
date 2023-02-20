package org.tnsif.stringexample;

//program to demonstrate a String comparison
public class StringComparisonDemo {

	public static void main(String[] args) 
	{
		//creating a string using literals
		String s1="DNYANESHWAR";
		String s2="DNYANESHWAR";
		
		//creating a string using new operator
		String s3=new String("DNYANESHWAR");
		String s4=new String("DNYANESHWAR");
		
		//string comparison
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s4));
		
		//using  --> compareTo
		System.out.println(s1.compareTo("dnyaneshwar"));
		System.out.println(s1.compareToIgnoreCase("dnyaneshwar"));
		System.out.println(s1.compareTo(s2));
	}

}


/*OUTPUT
true
false
true
-32
0
0
*/
