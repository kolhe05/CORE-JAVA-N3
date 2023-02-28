package org.tnsif.lamdaexpression;


	//Program to demonstrate without lambda expression 
	//Functional interface which contains exactly one abstract method
	interface Message
	{
		void greet(String name);
		
	}

	//implementable class for an interface
	//without lambda expression
	/*class MessageImpl implements Message
	{
		@Override
		public void greet(String name) {
			System.out.println("Hello "+name);
			
		}
		
	}*/
	//without Lambda Expression
	public class WithoutLambdaExpression {

		public static void main(String[] args) {
			
			//without lambda expression
			/*MessageImpl i=new MessageImpl();
			i.greet("Gauri");*/
			
			//without lambda, Message implementation using anonymous class
			Message m=new Message()
			{

				@Override
				public void greet(String name) {
					System.out.println("Hello "+name);
					
				}
				
				
			};
			m.greet("Rohan");
			
			//using Lambda Expression
			Message obj=(name)->
			{
				System.out.println("Hello "+name);

			};
			obj.greet("Gauri");
		}
	}


