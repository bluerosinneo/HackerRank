import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        int n = 100;

        long threeTimes = 0;
        long fiveTimes = 0;
        long threeFiveInter = 0;

        threeTimes = (n-1)/3;
        System.out.println(threeTimes);
        fiveTimes = (n-1)/5;
        System.out.println(fiveTimes);
        threeFiveInter = (n-1)/15;
        System.out.println(threeFiveInter);
        System.out.println( ((threeTimes*(threeTimes+1))/2) *3+ ((fiveTimes*(fiveTimes+1))/2) *5- ((threeFiveInter*(threeFiveInter+1))/2) *15);

    }
}
