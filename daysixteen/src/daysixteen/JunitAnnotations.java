package daysixteen;


	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.AfterAll;
	import org.junit.jupiter.api.AfterEach;
	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Disabled;
	import org.junit.jupiter.api.DisplayName;
	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.TestInstance;
	import org.junit.jupiter.api.TestInstance.Lifecycle;
	@TestInstance(Lifecycle.PER_CLASS)

	class JunitAnnotations {

		@Test
		@DisplayName("SimpleJUnitTestingMethod")
		void test() {
			//fail("Not yet implemented");
			System.out.println("First JUnit Test case");
		}
		@Test
		@BeforeAll
		/*if we make this method as static will 
		 * not get method name in testing so to overcome 
		 * this we must have to use to this line
		 * @TestInstance(Lifecycle.PER_CLASS)
	    */
		void display() {
			//fail("Not yet implemented");
			System.out.println("Welcome to JUnit5 testing");
		}
		
		@Test
		@AfterEach
		@Disabled
		 void accept() {
			System.out.println("After each method demo");
		}
		
		@Test
		@BeforeEach
		void demo()
		{
			System.out.println("Before each method demo");
		}
		@Test
		@AfterAll
		void before()
		{
			System.out.println("After All method demo");
		}

	}


