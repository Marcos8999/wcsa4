package array;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] A= {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<a.length; i++)
        {
        	prime(i);
        }
	}
    public static void prime(int n)
    {
    	int flag=0;
    	if(n==0 // n==1)
    			{
    		        flag=1;
    			}
    	else
    	{
    		for(int i=2; i<n; i++)
    		{
    			if(n%i==0)
    			{
    				flag=1;
    				break;
    			}
    		}
    		if(flag=0)
    		{
    			System.out.println(n);
    		}
    	}
    }
}
