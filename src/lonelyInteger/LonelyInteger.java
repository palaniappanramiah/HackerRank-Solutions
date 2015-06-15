package lonelyInteger;
import java.io.*;
import java.util.*;

public class LonelyInteger {

    public static void main(String[] args) throws IOException {
        String input2;
        int input, result=0, count=0;
        String[] inputArray = new String[100];
        int[] inputNumberArray = new int[100];
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = in.nextInt();
        input2 = br.readLine();
        in.close();
        inputArray = input2.split(" ");
        for (int i=0; i<input; i++){
            inputNumberArray[i] = Integer.parseInt(inputArray[i]);
        }
        for (int i=0; i<input; i++){
            for(int j=0; j<input; j++){
                if ((inputNumberArray[i]==inputNumberArray[j]) && i!=j)
                    count++;
            }
            if (count==0)
                result = inputNumberArray[i];
            count=0;
        }
        System.out.println(result);
    }
}

/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class Solution {
    static int lonelyinteger(int[] a) {
        int result = 0;
        for(int i=0;i<a.length;i++){
            result = result ^a[i];
        }
        return result;
 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
         
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
         
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
         
        res = lonelyinteger(_a);
        System.out.println(res);
         
    }
}*/