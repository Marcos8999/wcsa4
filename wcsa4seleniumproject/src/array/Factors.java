package array;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<a.length; i++)
		{
			int factors=0;
			for(int j=1; j<a[i]; j++)
		    {
				if(a[i]%j==0)
				{
					factors++;
				}
				if(factors==1)
				{
					System.out.println(a[i]);
				}
		    }
		}
	}

}
