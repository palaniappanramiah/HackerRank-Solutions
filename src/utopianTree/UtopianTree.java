package utopianTree;

import java.io.*;
import java.util.*;

public class UtopianTree {

    public static void main(String[] args) {
        int t, ht = 1, n = 0;
        int[] res = new int[60];
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for (int i=0; i<t; i++){
            n = in.nextInt();
            for (int j=0; j <= n; j++){
                if (j==0)
                    ht = 1;
                else if (j%2 != 0)
                    ht *= 2;
                else
                	ht++;            
            }
            res[i] = ht;            
        }
        for (int j=0; j < t; j++){
            System.out.println(res[j]);
        }
    }
}