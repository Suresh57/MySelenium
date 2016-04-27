package homework;

public class FibanocciSeries {
	
public static void main(String[] args) {
		
		int x=1;
		int y=0;
		int fib=0;
		
		while (fib<89) {
            
			fib=x+y;
			
			System.out.println(fib);
			
			x=y;
			y=fib;
		}
		
		
		}

}
