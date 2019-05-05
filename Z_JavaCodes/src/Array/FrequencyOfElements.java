package Array;

public class FrequencyOfElements {

	public static void main(String[] args) 
	{
		
		int a[]={-1,2,1,-1,1,3,5,-1};
		
		int fr[]=new int[a.length];
		
		int visited=-1;
		for(int i=0;i<a.length;i++)
		{  
			int c=1;
			for(int j=i+1; j< a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					c++;
					fr[j]=visited;
				}
				
			}
			if(fr[i]!=visited)
			{
				fr[i]=c;
			}
			
		
		}
		
		
	for(int i=0;i<a.length;i++)
	{
		if(fr[i]!=visited)
		{
		System.out.println(a[i]+"-----"+fr[i]);	
		}
	}
		

	}

}
