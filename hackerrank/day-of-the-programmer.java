// Problem: Day of the Programmer
// Link: https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true

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
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
    String Leap = "12.09.";
    String notLeap = "13.09.";
    String ear = Integer.toString(year);
    StringBuilder sb = new StringBuilder(Leap);
    if(year<1919 && year%4 == 0){
        return Leap.concat(ear);
    }else if(year<1919 && year %4 != 0){
        return notLeap.concat(ear);
    }else if(year > 1918&& ((year % 400 == 0) || (year % 4 == 0 && year %100 !=0))){
        return Leap.concat(ear);
    }else{
        return notLeap.concat(ear);
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
