package day1.learning;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerDemo sd = new ScannerDemo();
		sd.findFact();
		
		 //obj.prime_gen(18);
	    Scanner sc = new Scanner(System.in);
	    System.out.println("pls enter value to generate prime no.");
	    int no = sc.nextInt();
	    sd.prime_gen(no);
	    
	    //add the digits of no. till become single digit no<09
	    // read input from user
	    Scanner sc1 = new Scanner(System.in);
	    System.out.println("pls enter value to add digits");
	     no = sc1.nextInt();
	    sd.add_dig(no);
	}
	
	private void findFact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no.");
	int no=sc.nextInt();
	int total = 1;
	int i=1;
	while (i <= no)
	{
		total = total *i;
		i++;
	}
	System.out.println(total);
	}
	
	private void add_dig(int no) {
		// TODO Auto-generated method stub
		int sum =0;
		int no1 = no;
		System.out.println(no1);
		while (no1 > 9)
		{
			sum =0;
			System.out.println(no1);
		while (no1 > 0)
		{
			sum = sum + no1%10;
			no1 = no1/10;
			System.out.println(no1);
		}
		no1 = sum;
		}
		System.out.println(sum);
	}

	private void prime_gen(int prime_limit) {
		// TODO Auto-generated method stub
		boolean flg = true;
		int i,j;
		//System.out.println("prime no....");
		for (i = 1; i <= prime_limit; i++)
		{
			flg = true;
			//System.out.println("prime no..i.."+i);
			for(j = 2; j <= i/2; j++)
			{
				if (i % j == 0)
				{
					flg = false;
					break;
				}
				else
				{
			flg = true;
			continue;
				}
			}	
			if (flg == true)
			{
			System.out.println("prime no" + i);	
			}
		}
		
	}

}
