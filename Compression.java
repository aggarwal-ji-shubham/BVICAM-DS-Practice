// compress function
class Compression
{
 public static void main(String args[])
 {
	 char a[]={a,a,a,b,c,c,c,d,d,e,a,e,e};
	 int count=1;
	 for(int i=0;i<a.length();i++)
	 {
		 if(a[i]=a[i+1])
			 count++;
		 if(count>1)
			 System.out.println(a[i]+count);
		 else
			 System.out.println(a[i]);
		 count=1;
	 }
 }
} 