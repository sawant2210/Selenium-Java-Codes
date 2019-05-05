 package Basic;

public class StringEquals {

	public static void main(String[] args) 
	{
		 String s1="kunal";   
		 String s2="kunal";  // both the objects will be referring same location
		 String s3= new String("kunal");  // new objects will be created every time 
		 String s4= new String("kunal");
		 System.out.println(s1==s2);   // this is reference comparator
		 System.out.println(s1.equals(s2));  // this is content comparator
		 System.out.println(s3==s4);
		 System.out.println(s3.equals(s4));
		 System.out.println(s1.compareTo(s2));
		 System.out.println(s3.compareTo(s4));
		 System.out.println(s1.compareTo(s3));
		 
		 CharSequence a="Nishant Hagala";
		 System.out.println(a);
		 
		 
		 CharSequence b;		 
		 b=new String("Mohs Hagala");
		 System.out.println(b);
		 
		 CharSequence b1= new StringBuilder(b);
//		 b1="Kunal Hasala";	
		 System.out.println(b1);
		 StringBuilder b2= new StringBuilder("Mohs Ragavala....ka pan???");
		 System.out.println(b2.reverse());
		 
		 
//		StringBuilder b2= ((StringBuilder)b1);
//		 System.out.println(b2);
		 
		 
		 //Difference between replace and replaceAll()
		 //CharSequence // is Interface // String // builder buffer implements that
		 // trim -- do always
		 // Substring -- 2 types  .trim().substring() can be converted to Int by parseint ..for removing , needs to replace
		 //Split
		 
		 
	}

}
