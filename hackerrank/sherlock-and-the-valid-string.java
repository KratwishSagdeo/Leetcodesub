// Problem: Sherlock and the Valid String
// Link: https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem

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
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (char ch : s.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    
    // Frequencies ki frequency count karne ke liye ek map bana lo
    HashMap<Integer, Integer> freqCount = new HashMap<>();
    for (int freq : map.values()) {
        freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
    }
    
    // Case 1: Agar sirf 1 hi tarah ki frequency hai, matlab sabhi characters equal hain
    if (freqCount.size() == 1) {
        return "YES";
    }
    
    // Case 2: Agar 2 tarah ki frequencies hain, tabhi kuch remove karke valid ban sakta hai
    if (freqCount.size() == 2) {
        int freq1 = 0, freq2 = 0;
        int count1 = 0, count2 = 0;
        
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
            if (index == 0) {
                freq1 = entry.getKey();
                count1 = entry.getValue();
            } else {
                freq2 = entry.getKey();
                count2 = entry.getValue();
            }
            index++;
        }
        
        // Sub-case A: Agar koi aisi frequency hai jo '1' hai aur woh sirf 1 hi character ki hai (use uda sakte hain)
        if ((freq1 == 1 && count1 == 1) || (freq2 == 1 && count2 == 1)) {
            return "YES";
        }
        
        // Sub-case B: Agar do frequencies ka difference 1 hai, aur jo badi wali frequency hai woh sirf 1 hi baar aayi hai
        if ((freq1 - freq2 == 1 && count1 == 1) || (freq2 - freq1 == 1 && count2 == 1)) {
            return "YES";
        }
    }
    
    return "NO";
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
