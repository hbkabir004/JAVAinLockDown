import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args) 
	{
		int a=1, b=1, k=0;
		//int n=100;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range: ");
		System.out.println("The Fibonacci Series: ");
		System.out.print("\n1 1 ");

		int n = sc.nextInt();
		
		while(k<=n)
		{
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;	
		}
		

	}
}