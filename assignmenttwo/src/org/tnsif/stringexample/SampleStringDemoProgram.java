package org.tnsif.stringexample;

import java.util.Scanner;

public class SampleStringDemoProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//using string literal
		System.out.println("Enter the first string: ");
		
		String str1=s.nextLine();
		System.out.println("First String is: "+str1);//string 1
		
		//using new keyword
		System.out.println("Enter the second string: ");
		String str2=new String(s.nextLine());
		System.out.println("Second String is: "+str2);//string 2
		
		if(str1.equals(str2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("different");
		}
		char c[]= {'H','e','l','l','o'};
		
		String str3=new String(c);
		System.out.println(str3);
	}
}

/*OUTPUT
Enter the first string: 
dnyaneshwar
First String is: dnyaneshwar
Enter the second string: 
dnyaneshwar
Second String is: dnyaneshwar
same
Hello
*/