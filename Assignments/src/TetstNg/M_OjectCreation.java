package TetstNg;

public class M_OjectCreation {
	String name="Ann";
	int speed= 35;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M_OjectCreation obj= new M_OjectCreation();
		System.out.println(obj.name + obj.speed);
		String[] str=new String[]{"Mohs", "Kunnu", "Nish"};
		String[] rev= getRev(str);
		for(String t:rev)
			System.out.print(t+" ");
	}
	public static String[] getRev(String[] temp){
		int i= temp.length;
		String temp1[]= new String[i];
		for (int p=0, q=i-1; p < i; p++, q--)
		{
			temp1[q]=temp[p];
		}
		return temp1;
	}
}
