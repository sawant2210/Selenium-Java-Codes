package Codes;

public class StringT {

	
	public static void main(String args[]) 
	{
		String Str = "vest string";
		String Str2 = "second string";
		String Str3 = "test string";
		System.out.println("String Str : "+ Str);
		System.out.println("String Str1 : "+ Str2);
		System.out.println("String Str2 : "+ Str3);
		System.out.println("value returned by Str.compareTo(Str2) i.e. mis-match condition:  "+ Str.compareTo(Str2));
		System.out.println("value returned by Str.compareTo(Str3) i.e. match condition:  "+ Str.compareTo(Str3));
		System.out.println("value returned by Str.equals(Str2) i.e. mis-match condition:  "+ Str.equals(Str2));
		System.out.println("value returned by Str.equals(Str3) i.e. match condition:  "+ Str.equals(Str3));
		System.out.println("value returned by Str.charAt(1):  "+ Str.charAt(1));
		System.out.println("value returned by Str.concat(Str3):  "+ Str.concat(Str3));
		System.out.println("value returned by Str.concat(\"text\"):  "+ Str.concat("text"));
		System.out.println("value of Str after concat: " + Str);
//		System.out.println("value returned by Str.repeat(3):  "+ Str.repeat(3));
		System.out.println("value returned by Str.length():  "+ Str.length());
		System.out.println("value returned by Str.replace(\"test\", \"replace\"):  "+ Str.replace("test", "replace"));
		System.out.println("value returned by Str.replace(Str, \"replace\"):  "+ Str.replace(Str, "replace"));
		System.out.println("value returned by Str.replaceAll(Str, Str2):  "+ Str.replaceAll(Str, Str2));
		System.out.println("value returned by Str.replaceAll(Str, \"replaceAll\"):  "+ Str.replaceAll(Str, "replaceAll"));
		System.out.println("value returned by Str.replaceFirst(Str, \"replaceFirst\"):  "+ Str.replaceFirst(Str, "replaceFirst"));
		System.out.println("value returned by Str.replaceFirst(\"test\", \"replaceFirst\"):  "+ Str.replaceFirst("test", "replaceFirst"));
//		System.out.println("value returned by Str.strip():  "+ Str.strip());
		System.out.println("value returned by Str.substring(1):  "+ Str.substring(1));
		System.out.println("value returned by Str.substring(1,5):  "+ Str.substring(1,5));
		System.out.println("value returned by Str.trim():  "+ Str.trim());
		char chara[]= {'t','e','s','t'};
		System.out.println("value returned by Str.copyValueOf(chara) where char chara[]= {'t','e','s','t'}:  "+ Str.copyValueOf(chara));
		System.out.println("value returned by Str.join(\"-\", \"fake\",\"string\"):  "+ Str.join("-", "fake","string"));
		System.out.println("value returned by Str.contains(\"test\"):  "+ Str.contains("test"));
		System.out.println("value returned by Str.contentEquals(Str2):  "+ Str.contentEquals(Str2));
		System.out.println("value returned by Str.contentEquals(\"string\"):  "+ Str.contentEquals("test string"));
		String sp[]=Str.split(" ");
		System.out.println("value returned by Str.split(\" \"): {"+ sp[0] + ","+sp[1] +"}");
		System.out.println("Str.toCharArray() operation: ");
		char ca[];
		ca= Str.toCharArray();
		for (int i=0;i<ca.length;i++)
		{
		       System.out.print("ca["+i+"]:"+ca[i]+" ");
		}


		       }   
		
	}

