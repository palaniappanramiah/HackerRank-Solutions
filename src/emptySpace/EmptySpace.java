package emptySpace;

public class EmptySpace {
	
	public static void main (String args[]){
		char[] pal = "palalna palal".toCharArray();
		System.out.println(replaceSpaces(pal, 13));
	}
	
	public static char[] replaceSpaces(char[] str, int length) {
		int spaceCount = 0, newLength, i; 
		for (i = 0; i < length; i++) {
		if (str[i] == ' ') { 
			spaceCount++;}
		}
	newLength = length + spaceCount * 2;
	char[] str1 = new char[newLength];
	for (i = length - 1; i >= 0; i--) {
		if (str[i] == ' ') { 
				str1[newLength - 1] = '0';
				str1[newLength - 2] = '2';
				str1[newLength - 3] = '%';
				newLength = newLength - 3;
				} else { 
					str1[newLength - 1] = str[i]; 
					newLength = newLength - 1;
					}
				} 
	return (str1);
	}
	
	}
