package Day_3;
class Calculator{
	
	public  int add(int a,int b )
	{
		return a+b;
		
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;		
	}
	public double add(double a,double b)
	{
		return a+b;
	}
}
public class MethodOverloading {
   public static void main(String[] args) {
	int a=5;
	int b=6;
	int c=9;
	double d=6.78;
	double e=6.09;
	Calculator cl1 = new Calculator();
	System.out.println(cl1.add(a,b));
	System.out.println(cl1.add(a,b,c));
	System.out.println(cl1.add(d,e));
	
  }
}
