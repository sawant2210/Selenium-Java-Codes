package TetstNg;

public class M_MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul(20,30);
		mul(20,30,40);
	}
	public static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	public static void mul(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}
}
