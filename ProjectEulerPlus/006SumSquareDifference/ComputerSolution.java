import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// changed from Solution to ComputerSolution
public class ComputerSolution {

    public static void main(String[] args) {

        // provided by HackerRank
        // Scanner in = new Scanner(System.in);
        // int t = in.nextInt();
        // for(int a0 = 0; a0 < t; a0++){
        //     int n = in.nextInt();
        // }

        // not to be provided in Solution
        int n = 10;

        long nLong = (long)n;

        long sumThenSquare = 0;
        long squareThenSum = 0;

        for (int i = 1; i <= n; i++){
            sumThenSquare = sumThenSquare + i;
            squareThenSum = squareThenSum + i*i;
        }

        System.out.println(sumThenSquare*sumThenSquare - squareThenSum);
    }
}
