import java.util.*;

public class SubArrayCount

{

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
	   
        System.out.println("Enter the size of array");

	int n=sc.nextInt();

	System.out.println("Enter value of k");
	    
        int k=sc.nextInt();
	    
        int m=n+1-k;
	
        int ans=(m*(m+1))/2;
	    
        System.out.println("No. of subarrays >= k = "+ans);
	
    }

}

