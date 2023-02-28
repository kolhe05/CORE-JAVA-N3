package org.tnsif.genericsdemo;
//program to demonstrate on GenericMethod******

	class GenericMethod
	{
		public <E> void print(E[] elements)
		{
			for(E itr:elements)
			{
				System.out.print(itr+ " ");
			}
			System.out.println();
		}
	}

	//driver class******
	public class GenericMethodDemo {

		public static void main(String[] args) {
			GenericMethod m=new GenericMethod();
			Integer[] array1= {10,20,35,100};
			Character[] array2= {'d','N','Y','A'};
			System.out.println("Integer array: ");
			m.print(array1);
			System.out.println("Character array: ");
			m.print(array2);


		}
	}


