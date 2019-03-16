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
            long threeTimes = 0;
            long fiveTimes = 0;
            long threeFiveInter = 0;
            
            threeTimes = (n-1)/3;
            fiveTimes = (n-1)/5;
            threeFiveInter = (n-1)/15;
            System.out.println( ((threeTimes*(threeTimes+1))/2) *3+ ((fiveTimes*(fiveTimes+1))/2) *5- ((threeFiveInter*(threeFiveInter+1))/2) *15);
        }
    }
}
