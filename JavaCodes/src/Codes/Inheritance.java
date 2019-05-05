package Codes;

public class Inheritance 
{


	int a;
	static float b;
	
	
	void run()
	{
		System.out.println("Non static method - run -  parent class");
//		display();   // static method can be called directly
	}
	
	void walk() 
	{
		System.out.println("Non static method - Walk - parent class");
		run(); // non static method can be called directly inside no static method
		
	}
	
	

}

class something1 extends Inheritance
{
	
	void eat()
	{
		System.out.println("non static method eat child class");
		walk();
		
		
	}
	
	static void test()
	{
		something1 obj=new something1();
		obj.walk();
		
	}
	
}

