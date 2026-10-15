// Problem: Caesar Cipher
// Link: https://www.hackerrank.com/challenges/caesar-cipher-1/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    StringBuilder sb = new StringBuilder();
    
    // Normalize k in case it's larger than 26
    k = k % 26; 
    
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        
        // Check if it's a lowercase letter
        if (ch >= 'a' && ch <= 'z') {
            char shifted = (char) ('a' + (ch - 'a' + k) % 26);
            sb.append(shifted);
        }
        // Check if it's an uppercase letter
        else if (ch >= 'A' && ch <= 'Z') {
            char shifted = (char) ('A' + (ch - 'A' + k) % 26);
            sb.append(shifted);
        }
        // If it's a symbol, number, or punctuation, leave it unencrypted
        else {
            sb.append(ch);
        }
    }
    
    return sb.toString();
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
