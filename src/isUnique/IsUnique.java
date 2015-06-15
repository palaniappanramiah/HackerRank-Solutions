package isUnique;

public class IsUnique {
	
	public static void main(String args[]){
	//char a = isUniqueChars("paplani");
	boolean a = isUniqueChars("plani");
	System.out.println(a);
	}
	
	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i=0; i < str.length(); i++) { 
			int val = str.charAt(i) - 'a';
			int res1 = (1<< val);
			int res = (checker & res1);
			if ( res > 0) {
				return false;
			}
			checker |= (1<< val);
			}
		return true;
		}
}/*
	public static char isUniqueChars(String str) {
		boolean[] char_set = new boolean[256];
		for (int i=0;i<str.length();i++){
			int pos = str.charAt(i);
			if (char_set[pos])
				return str.charAt(i);
			char_set[pos] = true;
		}
		return '-';
	}
	public static char isUniqueChars(String str) {
		int[] char_set = new int[256];
		for (int i=0;i<str.length();i++){
			int pos = str.charAt(i);
			if (char_set[pos]>=0)
				char_set[pos]++;
		}
		for (int i=0;i<str.length();i++){
			if (char_set[str.charAt(i)] == 1)
				return str.charAt((i));
		}
		return '-';
	}
}*/

/*public static char firstNonRepeatedCharacter(String word) {
HashMap<Character,Integer> scoreboard = new HashMap<>();
// build table [char -> count]
for (int i = 0; i < word.length(); i++) {
    char c = word.charAt(i);
    if (scoreboard.containsKey(c)) {
        scoreboard.put(c, scoreboard.get(c) + 1);
    } else {
        scoreboard.put(c, 1);
    }
}
// since HashMap doesn't maintain order, going through string again
for (int i = 0; i < word.length(); i++) {
    char c = word.charAt(i);
    if (scoreboard.get(c) == 1) {
        return c;
    }
}
throw new RuntimeException("Undefined behaviour");
}

}
*/