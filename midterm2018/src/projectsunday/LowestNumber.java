package projectsunday;

public class LowestNumber {
	public  static void main (String [] args) {
		 int numbers[] = new int[] {10,15,20,25,25,30,40,50,52};
		 int smallest = numbers[0];
		 for(int i=1; i< numbers.length; i++)
		 {
			 if(numbers[i]<smallest)
				 smallest = numbers[i];
		 }
		 System.out.println("Smallest Number is:"+ smallest);
		 
	
		 
		 
	
			 
		 
		 
		 
		
		
		
	}
	
	
	

}
