package Array;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		
		int a[]={1,2,4,2,3,3,4,1,5,7,8,9};  // --- applicable when there is only 1 duplicate for each each no.
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
		
//		
//int a[]={1,2,1,1,3,3,5};
//		
//		int fr[]=new int[a.length];
//		
//		int visited=-1;
//		for(int i=0;i<a.length;i++)
//		{  
//			int c=1;
//			for(int j=i+1; j< a.length;j++)
//			{
//				
//				if(a[i]==a[j])
//				{
//					c++;
//					fr[j]=visited;
//				}
//			}
//			
//			if(fr[i]!=visited)
//			{
//				fr[i]=c;
//			}
//		}
//		
//		
//	for(int i=0;i<a.length;i++)
//	{
//		if(fr[i]!=visited && fr[i]>1)
//		{
//		System.out.println(a[i]);	
//		}
//	}
//		
//		
//		
	}

}
