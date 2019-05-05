package Codes;


class staticUse
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
	
	static void display()
	{
		
		System.out.println("static method from parent class");
		staticUse obj=new staticUse();
		//run(); // not possible, needs call via object
//		obj.run();
		//obj.display(); // will start executing and give stack over flow error like infinite loop
		System.out.println(obj.a); // will print default values for both variables
		System.out.println(b);  // static varibale and can be accessed directly
	}

}

class something extends staticUse
{
	
	void eat()
	{
		System.out.println("non static method eat child class");
		walk();
		display();
		
	}
	
	static void test()
	{
		display();
		something obj=new something();
//		staticUse obj=new staticUse();
		obj.walk();
		
	}
	
}

public class Statickeyword2 {

	public static void main(String[] args) 
	{  
		
		
//		staticUse obj=new staticUse();
//		obj.walk();
//		staticUse.display();
		something obj1= new something();
		obj1.eat();
		
	}

}
