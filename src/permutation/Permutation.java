package permutation;

public class Permutation {
	public static void main(String args[]){
		System.out.print(permutation("pala","lapa"));
	}
	
	/*public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) { 
			return false; 
			} 
		int[] letters = new int[256]; 
		char[] s_array = s.toCharArray(); 
		for (char c : s_array) { 
			letters[c]++;
		}
			for (int i = 0; i < t.length(); i++) {
				int c1 = (int) t.charAt(i); 
				if (--letters[c1] < 0) { 
					return false; 
				} 
			} 
			return true; 
	}*/

	 public static String sort(String s) {
		 char[] content = s.toCharArray();
		 java.util.Arrays.sort(content); 
		 return new String(content); 
		 }
	 public static boolean permutation(String s, String t) { 
		 if (s.length() != t.length()) { 
			 return false; 
			 } 
		 return sort(s).equals(sort(t)); 
		 }
	
}
