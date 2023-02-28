package org.tnsif.genericsdemo;

import java.awt.List;
	import java.util.ArrayList;
	//program to demonstrate on Advantages of generic
	public class GenericsAdvantagesExample {

		public static void main(String[] args) {
			
			//1.Type-safety
			//without generic
			ArrayList obj=new ArrayList<>();
			obj.add(15);
			obj.add("15");
			System.out.println("Without Generics "+obj);
			
			//with Generic
			ArrayList<Integer> obj1=new ArrayList<>();
			obj1.add(15);
			//obj1.add("15");
			System.out.println("With Generics "+obj1);

			//2.Type casting is **allowed** before generic
			ArrayList obj2=new ArrayList<>();
			obj2.add("MET");
			//type casting
			String str=(String)obj2.get(0);
			System.out.println(str);
			
			//with generic ,Type casting is **not allowed**
			ArrayList<String> obj3=new ArrayList<>();
			obj3.add("MET");
			String str1=obj3.get(0);
			System.out.println(obj3);
			
			
		}
	}


