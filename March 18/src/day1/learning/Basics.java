package day1.learning;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Basics obj = new Basics();
    //https://wiki.mozilla.org/Matrix
    //obj.swap_two();
    //obj.swap_notemp();
    //obj.swap_three();
    //obj.swap_four();
   //obj.unary_oper();
    //obj.bitwise_oper();
    //obj.printBinary(), 0);
   //obj.purse();
   //obj.dosa();
   //obj.purse3();
   //obj.printRevers(122134);
   // obj.binToDecimal(111);
   //obj.decToBinary(15);
  //  obj.gcd(100,1000);
	//obj.newBintoDec(11011);
    //obj.divisor(19);
    //obj.lcm(30,15);
    //obj.learn_break();
    //obj.neonnum(9);
    //obj.neongen();
    //obj.strong(145);
    //obj.perfect(6);
    //obj.amstrang(153);
    //obj.add_n_no(5);
    //obj.Fact_n_no(5);
//    obj.fibo(15);
    
    //obj.prime_gen(18);
    Scanner sc = new Scanner(System.in);
    System.out.println("pls enter value to generate prime no.");
    int no = sc.nextInt();
    obj.prime_gen(18);
    
    //add the digits of no. till become single digit no<09
    // read input from user
    Scanner sc1 = new Scanner(System.in);
    System.out.println("pls enter value to add digits");
     no = sc1.nextInt();
    obj.add_dig(no);
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

	private void fibo(int num) {
		// TODO Auto-generated method stub
		int b1 = -1; int b2 = 1;
		int i = 1;
		int b3;
		while (num>=i)
		{
			b3 = b1 +b2;
			System.out.println(b3);
			i++;
			b1 = b2;
			b2 = b3;
		}
	}

	private void Fact_n_no(int num) {
		// TODO Auto-generated method stub
		int mul=1;int n =1;
		while(n<= num )
		{
			mul = mul*n;
			n++;
		}
	System.out.println(mulwhy);
	}
	private void add_n_no(int num) {
		// TODO Auto-generated method stub
		int sum=0;int n =1;
		while(n<= num )
		{
			sum = sum+n;
			n++;
		}
	System.out.println(sum);
	}
	
	private void amstrang(int no1) {
		// TODO Auto-generated method stub
		int amsno = no1;
		int amsno1 = no1;
		int sum = 0;
		while (amsno > 0)
		{
		amsno = amsno1%10;
		sum= sum + pow(amsno,3);
		amsno1 = amsno1/10;
		
		}
		
		System.out.println();
		if (no1 == sum)
			System.out.println("amstrong no...");
		else
			System.out.println("not amstrong no...");
		//call method from same class without obj..
		
		Basics obj1 = new Basics();
		obj1.perfect(6);
	}
	private void perfect(int no1) 
	 {
		// TODO Auto-generated method stub
		int per_no = no1;
		int i = 2;
		int sum = 1;
		while (i< no1-1)
		{
			if (per_no%i == 0)
			{
				sum=sum+i;
						
			}
			i++;
			
		}
		System.out.println("sum .."+ sum);
		if (sum == no1)
		{
			System.out.println("perfect no...");
		}
			else
			{
				System.out.println("not perfect no...");
		}
	}
	private void strong(int sno) {
		// TODO Auto-generated method stub
		
		System.out.println("strong no..");
	int sum = 0;
	int fact =1 ; int snod= sno;
	int snom = sno;
		while (snod != 0)
		{
			//fact =1;
			snom = snod%10;
	//		System.out.println("inside while no.."+snom);
			
			fact = 1;
			for (int i=1;i<= snom;i++)
			{
				fact =fact * i;
				
		//		System.out.println("inside for no..");
			}
			
			sum = sum + fact;
			snod = snod/10;
		}
		System.out.println("strong no....." + sum + "fact..."+fact);
		if (sum == sno)
		{
			System.out.println("strong no..");
		}
		else
		{
			System.out.println("not strong no........");
		}	
		
	}
	private void neongen() {
		// TODO Auto-generated method stub
		
		int neonno ;
		int sum = 0;
		for (int i=0; i<10000;i++)
		{
			
			 neonno = i *i;
			 sum = 0;
			while (neonno != 0)
			{
				//System.out.println("test" +neonno 
					//	+"sum.." +sum);
			sum = sum + neonno%10;
					neonno= neonno/10;
			}
			if (i == sum )
			{
				System.out.println("neon no..gen."+ i);
			}
			
		}
	}
	private void neonnum(int num) {
		// TODO Auto-generated method stub
		int neonno= num;
		neonno =  num * num;
		int sum = 0;
		while (neonno != 0)
		{
			
		sum = sum + neonno%10;
				neonno= neonno/10;
		}
		if (num == sum )
		{
			System.out.println("neon no...");
		}
		else
		{
			System.out.println("not neon no...");
		}
		
	}
	private void learn_break() {
		// TODO Auto-generated method stub
		int no = 1;
		while (no<=10)
		{
			System.out.println(no);
			if (no==5)
			{
				no = 8;
				continue;
			}
				
			no++;
		}
		System.out.println("after break");
	}
	private void lcm(int no1, int no2) {
		// TODO Auto-generated method stub
		
		int big = no1>no2? no1:no2;
		while (true)
		{
		if (big%no1 ==0 && big%no2==0)
		{
			System.out.println("lcm is "+ big);
			break;
		}
		big++;
		}
	}
	private void divisor(int no) {
		// TODO Auto-generated method stub
		int div = 2; int count = 0;
		
		System.out.println("not prime no");
		while (no < div)
		{
		if (no % div== 0)
		{
			div++;
		}
			count++;
		}
		
		if (count == 0)
			System.out.println("prime no");
		
		else
			System.out.println("not prime no");
		
		System.out.println("count");
}		
	private void newBintoDec(int bin) {
		// TODO Auto-generated method stub
	int deci =0;
	int exp =0;
	while (bin >0)
	{
		int rem = bin %10;
		deci = deci + rem * pow(2,exp);
		bin = bin/10;
		exp++;
		
	}
	System.out.println("new dec--"+deci);
	}
	private void gcd(int n1, int n2) {
		// TODO Auto-generated method stub
		int gcd1 = 1;
		int div = 2;
		int lcm;
		n1 = ( n1 > 0) ? n1 : -n1;
	    n2 = ( n2 > 0) ? n2 : -n2;
			while ((n1 > 0 &&  n2> 0 )
					&& (div <= n1 && div <= n2)) 
			{
				if (n1%div == 0 && n2%div == 0)
				{
					gcd1 = div;
					
				}
				div++;
			}
			
			System.out.println("gcd1"+gcd1);
			lcm = (n1 * n2)/ gcd1;
			System.out.println("lcm"+lcm);
	}
	
	 int pow(int base, int exp)
	{
		int result =1;
		while (exp > 0)
		{
			result = result * base;
			exp--;
		}
		return result;
	}
	private void binToDecimal(int bin) {
		// TODO Auto-generated method stub
		
		int sum = 0, multi = 1; int bin_param = bin;
		while (bin_param > 0)
		{
			bin = bin_param % 10;
			sum = sum + bin * multi;
			multi = multi *2;
			bin_param = bin_param/10;
			
			System.out.println("bin" + bin);
		}
		System.out.println("decimal" + sum);
		
	}
	private void decToBinary(int dec) {
		// TODO Auto-generated method stub
		String str = "";
		int binary = 0;
		while (dec > 0)
		{
			
			int bin = dec % 2;
			binary = binary * 10 + bin;
			System.out.println("insise"+ bin);
			str =  bin + str;
			dec = dec /2;
		}
		System.out.println("binary"+ str);
		System.out.println("test bina " + binary);
	}
	private void printRevers(int i) {
		// TODO Auto-generated method stub
		int num = i;
		int total = 0;
		int count = 0;
		while (num >0)
		{
		//num = num	% 10;
			count++;
		System.out.println(num	% 10);
		total = total * 10 + num%10;
		num = num /10;
		}
		System.out.println(count);
		System.out.println(total);
	if (total == i)
		System.out.println("palyndrome");
	else
		System.out.println("not palyndrome");
	}
	/*static void printBinary(int[] binary, int id)
    {
        // Iteration over array
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }*/
	
	private void dosa()
	{
		int dosa =8;
		int per3 = 8*3;
		int per2 = per3*3;
		int per1 = per2*3;
		System.out.print(per1);
	}
		
	private void purse3()
	{
		int count = 0;
		int purse =8;
		while (count < 3)
		{	
			purse = purse + purse/2;
			//System.out.println("inside" + purse);
			count++;
	}
		System.out.print(purse);
	}
	
		/*while (count < 7)
				{
			 money = money * 2;
			 count++;
				}
		
		 System.out.print(money);
	}*/

	private void purse()
	{
		int count =1;
		int money = 1;
		while (count < 7)
				{
			 money = money * 2;
			 count++;
				}
		
		 System.out.print(money);
	}
	
	private void bitwise_oper()
	{
		int i = 10;
		  //System.out.print(binary[i] + "");
    	System.out.println("shift right   " + (i >> 1));
    	 // System.out.print(binary[i] + "");
    	System.out.println("shift left    " + (i << 1));
	}
    private void unary_oper()
    {
    	int i = 10;
    	System.out.println(i);
    	//System.out.println(i++);
    	//System.out.println(i);
    	System.out.println(i++ + i++ + i++ + i++ + ++i);
    	System.out.println(i);
    }
	private void swap_two()
	{
		int no1 = 100;
		  int no2 = 200;
		  int no3 = no1;
		  System.out.println("before swap");
		  System.out.println(no1);
		  System.out.println(no2);
		  no1 = no2;
		  no2 = no3;
		  System.out.println("after swap");
		  System.out.println(no1);
		  System.out.println(no2);

	}
	private void swap_three()
	{
		int no1 = 100;
		  int no2 = 200;
		  int no3 = 300;

		  System.out.println("before swap");
		  System.out.println(no1);
		  System.out.println(no2);
		  System.out.println(no3);
		  no1 = no1 + no2 + no3;


		  no2 = no1 - ( no2 + no3);
		  no3 = no1 - ( no2 + no3);
		  no1 = no1 - ( no2 + no3);
		  System.out.println("after swap");
		  System.out.println(no1);
		  System.out.println(no2);
		  System.out.println(no3);

	}
	private void swap_four()
	{
		int no1 = 100;
		  int no2 = 200;
		  int no3 = 300;
		  int no4 = 400;

		  System.out.println("before swap");
		  System.out.println(no1);
		  System.out.println(no2);
		  System.out.println(no3);
		  System.out.println(no4);
		  no1 = no1 + no2 + no3 + no4;


		  no2 = no1 - ( no2 + no3+ no4);
		  no3 = no1 - ( no2 + no3+ no4);
		  no4 = no1 - ( no2 + no3+ no4);
		  no1 = no1 - ( no2 + no3+ no4);

		  System.out.println("after swap");
		  System.out.println(no1);
		  System.out.println(no2);
		  System.out.println(no3);
		  System.out.println(no4);

	}
	private void swap_notemp()
	{
		int no1 = 100;
		  int no2 = 200;
		  //int no3 = no1;


		  System.out.println("before swap");
		  System.out.println(no1);
		  System.out.println(no2);

		  no1 = no1 + no2;
			 no2 = no1 -no2;
			  no1= no1 - no2;

		  System.out.println("after swap");
		  System.out.println(no1);
		  System.out.println(no2);

	}
}
