package halloweenParty;

import java.io.*;
import java.util.*;

public class HalloweenParty {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long temp;
        int[] k = new int[t];
        long[] result = new long[t];
        for (int i=0;i<t;i++){
            k[i] = in.nextInt();
            temp = k[i];
            if ((temp%2)==0)
                result[i] = (temp/2)*(temp/2);
            else
                result[i] = (temp/2)*((temp/2)+1);
        }
        for (int j=0; j<t; j++){
            System.out.println(result[j]);
        }
    }
}
