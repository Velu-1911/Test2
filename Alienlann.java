package Question2;

	import java.util.ArrayList;

	import java.util.Arrays;

	import java.util.Collections;

	import java.util.Scanner;

	 
	class order

	{   

	    int findorder(int n,int k,ArrayList<String> s,String o)

	    {
	    	String sg;

	        int flag=0;

	        char[] c=o.toCharArray();

	        Arrays.sort(c);

	        sg= new String(c);

]
	        ArrayList<String> sorts=new ArrayList<String>();

	        for(int i=0;i<n;i++)

	        {
	        	String st=s.get(i);

	            char[] ch=st.toCharArray();

	            Arrays.sort(ch);

	            String sh= new String(ch);
	            if(sg.compareTo(sh)==1)

	            {

	                return 1;

	            }

	        }

	        return 0;

	        

	    }

	}

	 

public class Alienlann {

public static void main(String[] args)
{

	        int no_input,k;

	        ArrayList<String> s=new ArrayList<String>();

	        String o;

	        Scanner sc=new Scanner(System.in);

	        no_input=sc.nextInt();

	        k=sc.nextInt();

	        for(int i=0;i<no_input;i++)

	        {

	            s.add(sc.next());

	        }

	        o=sc.next();

	        order obj=new order();

	        System.out.println(obj.findorder(no_input,k,s,o));

}

	 

}

	 

