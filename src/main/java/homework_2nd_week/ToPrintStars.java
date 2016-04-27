package homework_2nd_week;

public class ToPrintStars {
	public static void main(String[] args) throws InterruptedException {
		
	
	int i;
	String s="";
	
	for (i=1;i<10;i++)
	{
		
		s = s.concat("*");
		
		int a = i%2;
		
		if (a!=0)
		{
			System.out.println(s);
		}
		
	}
	}

}
