// Problem: Pangrams
// Link: https://www.hackerrank.com/challenges/pangrams/problem

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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
    char ch[] = s.toLowerCase().toCharArray();
    int alpha[] = new int[26];
    for(int i = 0;i<26;i++){
        alpha[i] = 0;
    }
    for(int i = 0;i<ch.length;i++){
        if(ch[i] == ' '){
            continue;
        }else{
        alpha[ch[i]-'a']+=1;
        }
    }
    for(int i = 0;i<26;i++){
        if(alpha[i] == 0){
            return "not pangram";
        }
    }
    return "pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
