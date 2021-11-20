class varargs
{
	public static void main(String[] args) 
	{
		Display obj = new Display();
		obj.show(5,8,102,15);	
	}
}

class Display
	{
		public void show(int ... a)
		{
			for(int i : a)
			System.out.println(i);
		}
		
	}
