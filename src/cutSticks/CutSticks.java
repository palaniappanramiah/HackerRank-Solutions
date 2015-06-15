package cutSticks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class CutSticks {
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sticks[] = new int[N];
        TreeMap<Integer,Integer> h = new TreeMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            sticks[i] = in.nextInt();
            int tmp = sticks[i];
            if(h.containsKey(tmp)){
                h.put(tmp,h.get(tmp)+1);
            }
            else{
                h.put(tmp,1);
            }
        }
        int cut[] = new int[h.size()];
        int j = 0;
        for(Integer e:h.keySet()){
            cut[j] = h.get(e);
            j++;
        }
        int output[] = new int[h.size()];
        output[0] = N;
        System.out.println(output[0]);
        for(int m=1;m<h.size();m++){
            output[m] = output[m-1]-cut[m-1];
            System.out.println(output[m]);
        }
    }
     
}