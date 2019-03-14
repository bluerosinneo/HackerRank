import java.io.*; // for Scanner

public class Notes{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in); // open scanner
        String s = scan.next(); // read the next token and save it to 's'
        scan.close(); // close scanner
        System.out.println(s); // print 's' to System.out, followed by a new line

        /*
        scan.next(); // returns the next token of input
        scan.hasNext(); // returns true if there is another token of input (false otherwise)
        scan.nextLine() // returns the next LINE of input
        scan.hasNextLine(); // returns true if there is another line of input
        */
    }
}
