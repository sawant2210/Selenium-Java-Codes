package Basic;

class Vehicle1
{
	
	void a()
	{
		System.out.println("Parent class override: a");
	}
	void b()
	{
		System.out.println("Parent class : b");
	}
	void c()
	{
		System.out.println("Parent class  : c");
	}
}


class Bike1 extends Vehicle1
{
 	void a()
	{
		System.out.println("child class override: a");
	}
	void d()
	{
		System.out.println("child class : d");
	}

}

class Car1 extends Vehicle1
{	
	
	void a()
	{
		System.out.println("Child2 class override: a");
	}
	void e()
	{
		System.out.println("Child2 class : e");
	}
	

}



public class RunTimePolyform2
{
	
	public static void main(String args[])
	{
		
		Vehicle1 obj=new Bike1(); 
			
		obj.a();
		
		 obj=new Car1();
		
		obj.a();
		
	((Car1)obj).e();
		
		
		
		
		
	}

	
	
}
