package org.tnsif.stringexample;


//program to demonstrate on StringBuffer
public class StringBufferDemo {

	public static void main(String[] args) {
		
		//length vs capcity
		StringBuffer sb=new StringBuffer("dnyaneshwar");
		System.out.println(sb);
		
		//16 by default+length of the string(11)=27
		System.out.println(sb.capacity());//by default its 16
		System.out.println(sb.length());
		
		String str;
		int a=35;
		sb=new StringBuffer(40);
		str=sb.append(a).toString();
		System.out.println(str);
		System.out.println(sb);//35
		System.out.println(sb.reverse());//53

		

	}

}