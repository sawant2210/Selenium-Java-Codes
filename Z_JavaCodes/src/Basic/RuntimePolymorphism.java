  package Basic;

class Vehicle
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


class Bike extends Vehicle
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

class Car extends Bike
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

public class RuntimePolymorphism {

	public static void main(String[] args) 
	{
//        Vehicle obj= new Vehicle();
//        obj.a();obj.b();obj.c(); 
//        
//        Vehicle obj1= new Bike();   // up casting 
//        obj1.a();obj1.b();obj1.c();
//
//		Vehicle obj2= new  Car();
//		obj2.a();obj2.b();obj2.c();
		
				
//	 	Bike obj3= new Car();
//		obj3.a();obj3.b();obj3.c();obj3.d();

//
//		Bike obj4= new Bike();
// 		obj4.a();obj4.b();obj4.c();obj4.d();
//		
//		Car obj5= new Car();
//		obj5.a();obj5.b();obj5.c();obj5.d();obj5.e();
//		
//	Bike obj=new Bike();
//	((Vehicle)obj).a();
				
//		Bike obj6=new Bike();
//		Vehicle obj7= (Vehicle)obj6;    //  up casting OR Vehicle obj7=new Bike();
//		
//		obj7.a();obj7.b();obj7.c();
//		
//		Vehicle obj=new Car();
		
		
		
//		((Bike)obj).d();
		
//		Bike obj1= (Bike)obj;
		
		
		
//		((Car)obj).e();
		
		
//		Bike obj8=(Bike)obj7;     // down casting
//		obj8.a(); obj8.b(); obj8.c();obj8.d();
		 
		
//		Vehicle v=new Bike();
//		 
//		((Bike)v).d();
//		
		
		
		
	}
	 
	

}
