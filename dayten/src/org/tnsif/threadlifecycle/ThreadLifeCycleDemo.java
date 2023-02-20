package org.tnsif.threadlifecycle;

//driver class
//program to demonstrate on Thread lifecycle
public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		Tech t=new Tech();
		SoftSkill s=new SoftSkill();
		t.start();
		
		// Move control to another thread
		
		t.yield();
		
		s.start();

	}

}
