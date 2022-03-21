package day1.learning;

public class My_First_Java_Program implements Test{

	private int a,b,c;
	public int getA() {
		return a;
	}

	public My_First_Java_Program(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}
}
