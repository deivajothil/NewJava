public class DigitalNumber {
	int n1 = 7;
	int n2 = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 7;
		int n2 = 5;
		DigitalNumber s1 = new DigitalNumber();
		//s1.display1();
		//s1.display7();
		s1.display2();
		//s1.display3();
		//s1.display5();
//		s1.display6();
	//s1.display8();
		//s1.display9();
	//s1.display4();
	}
	//4
	private void display4() {
		// TODO Auto-generated method stub
		for (int row= 1; row <= 5; row++)
		{
			for  (int col= 1; col <= n2; col++)
			{
				if ((row==3)||((row ==1 ||row ==2 ) 
						&& (col == 1 || col ==3))|| col==3)
							
				{
				System.out.print("* "); 
				}
				else
				{
					System.out.print("  "); 
				}
				}
			System.out.println(); 
		}
	
	}

	//7
	private void display7() {
		// TODO Auto-generated method stub
		for (int row= 1; row <= n1; row++)
		{
			for  (int col= 1; col <= n2; col++)
			{
				if (row ==1 || col== 5)
				{
				System.out.print("* "); 
				}
				else
				{
					System.out.print("  "); 
				}
				}
			System.out.println(); 
		}	
	}
	private void display9() {
// TODO Auto-generated method stub
		for (int row= 1; row <= n1; row++)
		{
			for  (int col= 1; col <= n2; col++)
			{
				if (row ==1 || row == 3 || row ==5 || (row==2 && (col ==1 ||col ==5))
						|| (row==4 && col ==5))
				{
				System.out.print("* "); 
				}
				else
				{
					System.out.print("  "); 
				}
				}
			System.out.println(); 
		}
		
	}
	public void display1()
	{
		for (int i= 1; i <= n1; i++)
		{
			/*for  (int j; j <= n2; j++)
			{DigitalNumber
				System.out.println(i); 
			}*/
			System.out.println("* "); 
		}
		}
	
	//  2
	public void display2()
	{
	
	for (int row= 1; row <= n1; row++)
	{
		for  (int col= 1; col <= n2; col++)
		{
			if (row ==1 || row == 3 || row ==5 || (row==2 && col ==5)
					|| (row==4 && col ==1))
			{
			System.out.print("* "); 
			}
			else
			{
				System.out.print("  "); 
			}
			}
		System.out.println(); 
	}
	}

	//3
	public void display3()
	{
	
	for (int row= 1; row <= n1; row++)
	{
		for  (int col= 1; col <= n2; col++)
		{
			if (row ==1 || row == 3 || row ==5 || (row==2 && col ==5)
					|| (row==4 && col ==5))
			{
			System.out.print("* "); 
			}
			else
			{
				System.out.print("  "); 
			}
			}
		System.out.println(); 
	}
	}

//  5
	public void display5()
	{
	
	for (int row= 1; row <= n1; row++)
	{
		for  (int col= 1; col <= n2; col++)
		{
			if (row ==1 || row == 3 || row ==5 || (row==2 && col ==1)
					|| (row==4 && col ==5))
			{
			System.out.print("* "); 
			}
			else
			{
				System.out.print("  "); 
			}
			}
		System.out.println(); 
	}
	}

//  6
	public void display6()
	{
	
	for (int row= 1; row <= n1; row++)
	{
		for  (int col= 1; col <= n2; col++)
		{
			if (row ==1 || row == 3 || row ==5 || (row==2 && col ==1)
					|| (row==4 && (col ==1 ||col ==5)))
			{
			System.out.print("* "); 
			}
			else
			{
				System.out.print("  "); 
			}
			}
		System.out.println(); 
	}
	}


//8


public void display8()
{

for (int row= 1; row <= n1; row++)
{
	for  (int col= 1; col <= n2; col++)
	{
		if (row ==1 || row == 3 || row ==5 || (row==2 && (col ==1 ||col ==5))
				|| (row==4 && (col ==1 ||col ==5)))
		{
		System.out.print("* "); 
		}
		else
		{
			System.out.print("  "); 
		}
		}
	System.out.println(); 
}
}
}


