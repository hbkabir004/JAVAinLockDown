import java.util.Scanner;
class Swap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		/*int temp=a;
		a=b;
		b=temp;*/

		/*a+=b;
		b=a-b;
		a-=b;*/

		/*a=a^b;
		b=a^b;
		a=a^b;*/

		b = a+b - (a=b);  //Easiest Way...

		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
}