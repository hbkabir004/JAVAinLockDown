import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp=n, r, sum=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum= sum+(r*r*r);
		}

		if(tmp==sum)
			System.out.print("This a Armstrong Number");
		else
			System.out.print("Not a Armstrong Number");
	}

}