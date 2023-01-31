package week2.day1;

public class Calculator3 {
	
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public void sub(int e,int f) {
		int d=e-f;
		System.out.println("Sub : "+d);
	}
	public void multi(double i,double j) {
		double k=i*j;
		System.out.println("Multi : "+k);
	}
	public void div(double x,double y) {
		double z=x/y;
		System.out.println("Div : "+z);
	}
public static void main(String[] args) {
	Calculator3 cal=new Calculator3();
	int v=cal.add(49, 5);
	System.out.println("ADD : "+v);
	cal.sub(59,v);
	cal.multi(v,5.6);
	cal.div(v,4.1);
	
}

}
