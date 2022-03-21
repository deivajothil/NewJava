package day1.learning;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Basics obj = new Basics();
    obj.swap_two();
    obj.swap_notemp();
    obj.swap_three();
    obj.swap_four();
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
