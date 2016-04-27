package homework;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		int i;
		int n=10;
						
		Scanner ipt= new Scanner(System.in);
				
		System.out.println("Enter Number:");
		
				int prime = ipt.nextInt();
					
					for (i=1;i<=n;i++)
			
					{
						int y=prime%i;
			
						if (y==0)
						{
				
						}
						else
						{
							System.out.println(prime +": Diveded by " + i + " Then its a prime number and the Remider is: "+ y );
						}
					}
				}
		}

