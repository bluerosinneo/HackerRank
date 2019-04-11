import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();

            int pendingProduct = 0;
            int largestProduct = 0;
            int digit = 0;
            for (int i = 0; i < n-k; i++ ){
                //Character.digit(c2, 15)
                pendingProduct = 1;
                for (int j = 0; j < k; j++){
                    pendingProduct = pendingProduct * Character.digit(num.charAt(i+j), 15);
                }
                if (pendingProduct > largestProduct){
                    largestProduct = pendingProduct;
                }
            }
            System.out.println(largestProduct);

        }
    }
}
