package array;

public class DuplicateRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {3,7,1,5,7,2,1,4,6,5,8};
        for(int i=0; i<a.length; i++)
        {
        	for(int j=i+1; j<a.length; j++)
        	{
        		if(a[1]==a[j])
        		{
        		a[j]=0;
        		}
        		
        	}
        	System.out.println("after removing duplicate records");
        	for(int k=0; k<a.length; k++)
        	{
        		if(a[k]!=0)
        		System.out.println(a[k]);	
        	}
        	
        }
	}
	
}
