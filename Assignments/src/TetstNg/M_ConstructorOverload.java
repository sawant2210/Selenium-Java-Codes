package TetstNg;

public class M_ConstructorOverload {
	int age, DOB,calc;
	M_ConstructorOverload(int a, int b){
		age= a;
		DOB=b;
	}
	M_ConstructorOverload(int a, int b, int c){
		age= a;
		DOB=b;
		calc=c;
	}
	void display()
	{
		System.out.print(age+" "+DOB+" "+calc+"\n ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M_ConstructorOverload m= new M_ConstructorOverload(23,30);
		M_ConstructorOverload m2= new M_ConstructorOverload(25, 32, 40);
		m.display();
		m2.display();
	}

}
