
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    String S;
	    int c=0,c1=0,c2=0;
	    for(int i=0;i<T;i++)
	    {
	        S=sc.nextLine();
	        for(int j=0;j<S.length();j++)
	        {
	            if(S.charAt(j)>='a' && S.charAt(j)<='z')
	            {
	                c++;
	            }
	            else if(S.charAt(j)>='A' && S.charAt(j)<='Z')
	            {
	                c1++;
	            }
	            else if(S.charAt(j)>='0' && S.charAt(j)<='9')
	            {
	                c2++;
	            }
	        }
	        if(c1>0 && c>0 && c2>0)
	    {
	        System.out.println("Yes");
	    }
	    else
	    {
	        System.out.println("No");
	    }
	    }
	    
		//code
	}
}
    
    
