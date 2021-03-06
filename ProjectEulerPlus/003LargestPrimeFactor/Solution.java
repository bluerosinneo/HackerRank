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
            long check = 2;
            while(check*check <= n){
                while(n%check == 0)
                    n = n/check;
                if(n == 1)
                    n = check;
                check = check + 1;
            }
            System.out.println(n);
        }
    }
}
