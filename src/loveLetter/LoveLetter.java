package loveLetter;

import java.util.Scanner;

public class LoveLetter {

	public static void main(String args[]){
		int t;
		String[] pal = new String[10];
		Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for (int i=0; i<t; i++){
        	
        	pal[i] = in.next();
        }
        for (int i=0; i<t; i++){
        	int  med, left = 0, right = 0;
        	int len = pal[i].length();
        	if ( len % 2 != 0){
        		med = len/2;
        		left = med - 1;
        		right = med + 1;
        	}
        	else{
        		med = (len/2) - 1;
        		left = med;
        		right = med + 1;
        	}
        	int opr = 0;
        	char[] c = pal[i].toCharArray();
        	while(left >= 0 && right<=len-1){
        	int a = (int) (c[left]);
        	int b = (int) (c[right]);
        	opr = opr + Math.abs(b-a);
        	left--;
        	right++;
        	
        }
        System.out.println(opr);
        }
	}	
}