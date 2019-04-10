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

            String productString = "";
            int productInt = 0;
            int maxPalindrome = 0;
            boolean palindrome = true;
            for (int i = 999; i >= 100 ; i--){
                int maxJ = n/i;
                if(maxJ > 999)
                    maxJ = 999;
                for (int j = maxJ; j >= 100 ; j--){

                    productInt = i*j;
                    if (productInt > maxPalindrome){
                    palindrome = true;
                    productString = String.valueOf(productInt);
                    int maxLength = productString.length();
                    int half = maxLength/2;
                    if(half > 0){
                        for (int k = 0 ; k < half ; k++){
                            if( productString.charAt(k) != productString.charAt(maxLength - (1 + k)))
                                palindrome = false;
                        }
                    }
                    if(palindrome && productInt < n)
                        maxPalindrome = productInt;
                    }
                    else
                        break;
                }

            }
            System.out.println(maxPalindrome);

        }
    }
}
