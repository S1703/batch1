
public class Areas {
	double pi=3.14;
	
	public Areas(double a)
	{
		a=a*a*pi;
		System.out.println("Circle="+a);
	}
	
	public Areas(int a)
	{
		a=a*a;
		System.out.println("Square="+a);
	}
	
	public Areas(int a,int b)
	{
		a=a*b;
		System.out.println("rectangle="+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areas c=new Areas(2.5);
		Areas s=new Areas(10);
		Areas r=new Areas(11,12);
	}

}
