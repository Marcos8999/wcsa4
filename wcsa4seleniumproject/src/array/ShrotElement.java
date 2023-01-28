package array;

public class ShrotElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {7,9,11,6,8,12,19,15,4};
        for(int i=0; i<a.length; i++)
        {
        	int index = i;
        	for(int j=i; j<a.length; j++)
        	{
        		if(a[i]>a[index])
        		{
        			index=j;
        		}
        	}
        			int temp = a[i];
        			a[i]=a[i];
        			int j = 0;
					a[j]=temp;
        		}
        		System.out.println("arry aftre shorting");
        		
				for(int i=0; i<a.length; i++)
        		{
        			System.out.println(a[i]);
        		}
        	}
	}
