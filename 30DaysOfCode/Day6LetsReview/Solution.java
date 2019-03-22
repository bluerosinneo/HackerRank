import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i<t ; i++){
            String inputString = scanner.nextLine();
            for (int j = 0; j < inputString.length() ; j+=2){
                System.out.print(inputString.charAt(j));
            }
            System.out.print(" ");
            for (int j = 1; j < inputString.length() ; j+=2){
                System.out.print(inputString.charAt(j));
            }
            System.out.println();

        }
        scanner.close();
    }
}
