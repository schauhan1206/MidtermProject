package projectsunday;

public class DetermineLargestWord {

	static int LongestWordLength(String str)
		{
			String[] words = str.split("");
			int length = 0;
			for(String word: words) {
				if(length < word.length()) {
					length = word.length();
					
				}
			}
			return length;
			
			
		}
		public static void main(String[] args) {
			String str = "My name is seemal abrar";
			System.out.println(LongestWordLength(str));
	
		

	}

}
