import java.util.Scanner;

class Perfect
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter any Number: ");
		int n = sc.nextInt();
		boolean b = isPerfect(n);

		if(b)
			System.out.print("Number is Perfect");
		else
			System.out.print("Number is not Perfect");
 	}

 	public static boolean isPerfect(int n)
 	{
 		int sum=0;
 		for(int i=1; i<=n/2; i++)
 		{
 			if(n%2==0)
 				sum+=i;
 		}

 		if(n==sum)
 			return true;

 		return false;
 	}
}