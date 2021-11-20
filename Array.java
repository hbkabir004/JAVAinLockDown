class Array
{
	public static void main(String[] args)
	{
		//int a[]={5,7,2,1,6};

		int x[] = {6,7,8,9}; 					//2D Array Implementation
		int y[] = {2,3,4,5}; 
		int z[] = {11,12,13,14};

		int p[][] =	{
						{6,7,8,9}, 
						{2,3,4,5},
						{11,12,13,14}
					};


		for(int i[] : p)						//Enhanced Forloop (2D ARRAY) 
		{
			for(int j:i)
				System.out.print(j +" ");

			System.out.println();

		}

		/*for(int i=0; i<3; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print(p[i][j]+" ");	
			}
			

		System.out.println("");	
		}*/
		


		/*for(int i=0; i<5; i++)      	//using ForLoop to print Index of an array..
		{
			a[i]=i+1;
		}
		for(int i=0; i<5; i++)
		System.out.println(a[i]);*/

		/*for(int i : a)      			//using Enhanced ForLoop..
		System.out.println(i);*/		
	}
}