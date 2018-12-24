package projectsunday;

import java.util.HashSet;

public class DuplicateWordSearcher {

	public static void main(String[] args) {

	      String[] rawList = {"abc", "cba", "BCa", "bac", "xyz", "zyx", "123", "321"};
	      HashSet<String> uniqueStrings = new HashSet<String>();
	      for(String s : rawList){
	          uniqueStrings.add(sortString(s.toLowerCase()));
	       }
	      System.out.println(uniqueStrings);
	   }
	private static String sortString(String s){
		char[] c = s.toCharArray();
		java.util.Arrays.sort(c);
		return new String(c);

        
        }
    

	}


