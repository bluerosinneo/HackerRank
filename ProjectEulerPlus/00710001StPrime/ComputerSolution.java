import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// modified from Solution to ComputerSolution
public class ComputerSolution {

    public static void main(String[] args) {
        // provided by HackerRank
        // Scanner in = new Scanner(System.in);
        // int t = in.nextInt();
        // for(int a0 = 0; a0 < t; a0++){
        //     int n = in.nextInt();
        // }

        // I wonder how long it will be to sieve through
        // integers smaller than 110000

        // defaults to all false
        // so asume every integer is prime at first
        // later to be determined not to be a prime

        boolean[] sieve = new boolean[110000];

        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = 2; i < 110000; i++){
            //System.out.println(sieve[i]);
            if(sieve[i] == false){
                primeList.add(i);
                int counter = 2;
                while(i*counter < 110000){
                    sieve[i*counter] = true;
                    counter = counter + 1;
                }
            }
        }

        System.out.println(primeList.get(100-1));
    }
}
