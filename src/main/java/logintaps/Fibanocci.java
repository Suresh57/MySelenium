package logintaps;


public class Fibanocci {

		public static void main(String[] args) {
		
		int x=0;
		int y=1;
		int fib = 0;
		
		do {
			
			fib=x+y;
			
			System.out.println(fib);
			
			x=y;
			y=fib;
		} while (fib<100);
		
		}
		
		}

