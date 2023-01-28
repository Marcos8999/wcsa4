package array;

import java.lang.reflect.Array;

public class ArrayShrort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {7,9,11,6,8,12,19,15,4};
        System.out.println("Before Shorting");
        for(int i=0; i<a.length; i++)
        {
        	System.out.println(a.clone()[i]);
        }
        ArrayShrort(a);
        System.out.println("After Shorthing");
        for(int i=0; i<a.length; i++)
        {
        	System.out.println(a[i]);
        }
	    
		
	}

}
