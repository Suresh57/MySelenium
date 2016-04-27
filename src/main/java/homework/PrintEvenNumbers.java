package homework;


public class PrintEvenNumbers {
	public static void main(String[] args) {
	int x;
	int y;
	
	for(x=100;x<=200;x++)
	{
	
		y=x%2;
		
		if(y==0)
		{
		System.out.println(x + ": is Even Number");
		}
	}
		

	}
}
