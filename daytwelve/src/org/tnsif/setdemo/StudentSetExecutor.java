//driver class
//program to demonstrate on user-defined objects

package org.tnsif.setdemo;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetExecutor {
	
	//user-defined method
	public static void addStudent(Set<Student>obj)
	{
		Student student1=new Student(101,"Gauri",87.56f);
		Student student2=new Student(102,"Harshada",79.57f);
		Student student3=new Student(103,"Yamini",57.30f);
		obj.add(student1);
		obj.add(student2);
		obj.add(student3);

	}

	//driver code
	public static void main(String[] args) {
		Set<Student>obj=new LinkedHashSet<Student>();
		addStudent(obj);
	
		System.out.println(obj);

	}
}
