package Array;

public class MinNumber 
{

	
	public static void main(String args[])
	{
		int a[]={1,1,5,8,-3,2,4};
		
		int min=a[0];
		
		for(int i=1; i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
