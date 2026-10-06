// Problem: Picking Numbers
// Link: https://www.hackerrank.com/challenges/picking-numbers/problem

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
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    int max = 0;
    int prevVal=0;
    TreeMap <Integer,Integer> map = new TreeMap<>();
    for(int num:a){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    int prevKey = map.firstKey();
    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        int currVal = entry.getValue();
        int currKey = entry.getKey();
        max = Math.max(currVal,max);
        if(map.containsKey((currKey+1))){
            int sum = currVal+map.get(currKey+1);
            max = Math.max(max,sum);
        }
        
    }
    return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
