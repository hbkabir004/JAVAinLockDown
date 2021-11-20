class Palindrome
{
	public static void main(String[] args)
	{
		int n=121, s=0, r, t=n;

		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}

		if(s==t)
		System.out.print("The given number is Palindrome.");

		else
			System.out.print("The given number is not Palindrome.");
	}
}