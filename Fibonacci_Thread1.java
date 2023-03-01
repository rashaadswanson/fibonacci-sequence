package cop2805;

import java.util.Scanner;

/*
Objective: Implement both methods of solving the Fibonacci sequence into two separate classes that extend the Thread class. 
The threads will have some way to set n before the thread is started. In the run() function, you will execute the algorithm 
and time how long it takes to get an answer.
At the end, the thread will output the answer to the screen along with the number of milliseconds it took.
*/
//       m  n       
// 1, 1, 2, 3, 5,8,13,21,34

//int fibonacci(int n)
//if(n == 0) return 0
//if(n == 1) return 1
//return fibonacci(n-1) + fibonacci(n-2)
//Very simple. Too simple as we will find out. The second method uses dynamic programming to store the previous calculations rather than re-calculating them. This one looks like:
//
//int fibonacci(int n)
//v1 = 0, v2 = 1, v3 = 0
//for(i=2 to i <= n)
//v3 = v1 + v2
//v1 = v2
//v2 = v3


public class Fibonacci_Thread1 extends Thread{

	public void run() { 
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter position of number in Fibonacci for timed Method #1: ");
		int n = scan1.nextInt();

		long start = System.currentTimeMillis();
		
		System.out.println(fibonacci((double) n));
		
		
		long end = System.currentTimeMillis();
		long timeElapsed = end - start;

		System.out.println("Time Elapsed for method 1: " + timeElapsed + "ms");
	}

	public static double fibonacci(double n) {
		if(n == 0 || n == 1) {
			return n;
		}
//		if(n == 1) {
//			return 1;
//		}
		
		// Actual Growth Algorithm
//		double temp = n;
//		n = n + m;
//		m = temp;
		
		return fibonacci(n-1) + fibonacci(n-2);
		

		// decrease counter & recursive call function
//		x--;
//		return fibonacci(m,n,x);
		
		// handle return type requirement will never reach
		
		
	}


}





