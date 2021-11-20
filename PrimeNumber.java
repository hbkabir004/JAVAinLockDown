import java.util.Scanner;

class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isPrime = true;

		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
				isPrime=false;
				break;
		}	

		if(isPrime)
			System.out.print(n+" is a Prime Number.\n");
		else
			System.out.print("This is not Prime.\n");
	}
}