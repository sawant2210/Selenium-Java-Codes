package Codes;

public class StaticKeyword {

	
	int a;
	static int b=2;
	
	static 
	{
		System.out.println("static block 1");
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main method");
		
		StaticKeyword obj=new StaticKeyword();
//		obj.run();
//		obj.walk();
		
		eat();  // static method will be called directly
		System.out.println(obj.a); // non static variable needs object
	    System.out.println(b); // also called like obj.b (but not required)
	}
	static   // static block will be executed before main method
	{
		System.out.println("static block 2");
	}
	
	
	
	StaticKeyword()
	{
		a=3;
	}
	
	 void  run()
	{
		System.out.println("Non static method - run");
		eat1();	// static method will be called directly inside 
		
	}
	
	void walk()
	{	
		
		System.out.println("Non static method - walk");
		run();
	}
	
	static void eat()
	{
		System.out.println("static method - eat");
		//run(); // can not call non static method in static method 
		StaticKeyword obj2=new StaticKeyword();  //  cannot use object  obj created above  directly here, need to write state ment again
//		obj2.run();   // need to create object to access 
//		obj2.walk();  // need to create object to access
		obj2.eat1();
		
	}
	static void eat1()
	{
		System.out.println("static method - eat1");
		
	}
	

}
//021903008974380 - Airtel 