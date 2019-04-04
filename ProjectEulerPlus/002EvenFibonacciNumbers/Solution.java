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
            long n = in.nextLong();

            long largerF = 2;
            long smallerF = 1;
            long holdF = 0;
            long sum = 0;
            while(largerF <= n){
                if (largerF%2 == 0)
                    sum = sum + largerF;
                holdF = largerF;
                largerF = smallerF + largerF;
                smallerF = holdF;
            }
            System.out.println(sum);
        }
    }
}
