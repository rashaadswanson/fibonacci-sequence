package cop2805;

public class Fibonacci_main {

	
		public static void main(String[] args) {
			Fibonacci_Thread1 fib_method1 = new Fibonacci_Thread1();
			Fibonacci_Thread2 fib_method2 = new Fibonacci_Thread2();
			fib_method1.start();
			// how to make not run concurently?
			fib_method2.start();

		}

		

}


