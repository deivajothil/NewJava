
public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 1;

for (int row = 5;row > 0; row-- )
{
	for (int col = 1;col <= row; col++ )
	{
		System.out.print(num + "    ");
		num++;
	}
	System.out.println();
}
		
// pattern 2

System.out.println();

for (int row = 1;row <= 5; row++)
{
	for (int col = row;col <= 5; col++ )
	{
		System.out.print(col + "    ");
		
	}
	System.out.println();
}

//pattern 3

System.out.println();

for (int row = 5;row > 0; row--)
{
	for (int col = row;col >0; col-- )
	{
		System.out.print(col + "    ");
		
	}
	System.out.println();
}


//pattern 4

System.out.println();

for (int row = 1;row <= 5; row++)
{
	for (int col = row;col <= 5; col++ )
	{
		System.out.print("*" + "    ");
		
	}
	System.out.println();
}



//another method
int col =1; int val = 0;
for(int row=5; row>0; row--)
{
val = val + row; 
for(;col<=val;col++){
System.out.print(col+" "); 
}
System.out.println(); 
}

// pattern 5

num = 15;

for (int row = 5;row > 0; row-- )
{
	for ( col = 1;col <= row; col++ )
	{
		System.out.print(num + "    ");
		num--;
	}
	System.out.println();
}


//pattern 6

num = 1; int mul=1;

for (int row = 5;row > 0; row-- )
{
	for ( col = 1;col <= row; col++ )
	{
		System.out.print(num *mul + "    ");
		num++;
		mul++;
	}
	mul++;
	System.out.println();
}
	}

}
