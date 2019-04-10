import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int gcd(int a,int b){
        int temp = 0;
        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        while (b > 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();

            int smallMult = 1;
            int factorToAdd = 1;
            for (int i = 1 ; i <= n ; i++){
                if(smallMult % i != 0){
                    factorToAdd = i/gcd(smallMult, i);
                    smallMult = smallMult * factorToAdd;
                }
            }
            System.out.println(smallMult);

        }
    }
}
