// merge sort
class Merge
{
	   static void mergesort(int a[],int si,int ei)
		{
			int mid=(ei+si)/2;
			if(si<ei)
			{
				mergesort(a,si,mid);
				mergesort(a,mid+1,ei);
				merge(a,si,mid,ei);
			}
		}
		
		static void merge(int a[],int si,int mid,int ei)
		{
			int lsi=si,rsi=ei;
			int aux[]=new int[ei-si+1];
			int ptr=0;
			while(lsi<=mid&&rsi<=ei)
			{
				if(a[lsi]<a[rsi])
					aux[ptr++]=a[lsi++];
				else
					aux[ptr++]=a[rsi++];
			}
			
			if(lsi==mid)
			{
				while(rsi<=ei)
					aux[ptr++]=a[rsi];
				
			}
			else
			{
				while(lsi<=mid)
					aux[ptr++]=a[lsi];
			}
		
		for(int i=si;i<=ei;i++)
			a[i]=aux[ei-si];
		}

   public static void main(String args[])
	{
	int a[]={5,8,1,2,9,4,2,7};
		int si=0;
		int ei=7;
	
		mergesort(a,si,ei);
		for(int i=0;i<8;i++)
			System.out.println(a[i]);

	}	
}