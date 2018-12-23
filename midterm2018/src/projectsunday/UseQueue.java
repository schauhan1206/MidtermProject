package projectsunday;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue 
{

	public static void main(String[] args) {
	    Queue<Integer> q = new LinkedList<Integer>(); 
	    for (int i=0; i<5; i++)
	    	q.add(i);
	    System.out.println("Elements of queue-"+q);
	    
	    int removedele = q.remove(); 
	    System.out.println("removed element-" + removedele); 
	    



	}
		
	}
		
		  
		     
