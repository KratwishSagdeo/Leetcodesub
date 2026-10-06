// Problem: Migratory Birds
// Link: https://www.hackerrank.com/challenges/migratory-birds/problem

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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    int maxFreq = 0;
    int ans = 0;
    
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int key = entry.getKey();
        int val = entry.getValue();
        
        // Only update if frequency is strictly greater. 
        // Since TreeMap sorts keys in ascending order, if frequencies are 
        // equal, the smaller key was already processed first and kept.
        if (val > maxFreq) {
            maxFreq = val;
            ans = key;
        }
    }
    
    return ans;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
