import java.util.*;
import java.io.*;

class compSolution{
    public static void main(String[] args){
        long n = 100;

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
