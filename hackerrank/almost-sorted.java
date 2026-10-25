// Problem: Almost Sorted
// Link: https://www.hackerrank.com/challenges/almost-sorted/problem?isFullScreen=true

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

    public static void almostSorted(List<Integer> arr) {
        int n = arr.size();
        
        // Check if already sorted
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                isSorted = false;
                break;
            }
        }
        
        if (isSorted) {
            System.out.println("yes");
            return;
        }
        
        // Find all out-of-order indices
        List<Integer> outOfOrder = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // Compare with the sorted version or check neighboring elements
        }
        
        // Let's find the left and right bounds of the unsorted segment
        int l = -1, r = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                l = i;
                break;
            }
        }
        
        for (int i = n - 1; i > 0; i--) {
            if (arr.get(i) < arr.get(i - 1)) {
                r = i;
                break;
            }
        }
        
        // Try Swapping arr[l] and arr[r] (1-based indices for printing: l+1 and r+1)
        List<Integer> tempArr = new ArrayList<>(arr);
        int tempVal = tempArr.get(l);
        tempArr.set(l, tempArr.get(r));
        tempArr.set(r, tempVal);
        
        if (isSortedList(tempArr)) {
            System.out.println("yes");
            System.out.println("swap " + (l + 1) + " " + (r + 1));
            return;
        }
        
        // Try Reversing from index l to r
        tempArr = new ArrayList<>(arr);
        int start = l, end = r;
        while (start < end) {
            int t = tempArr.get(start);
            tempArr.set(start, tempArr.get(end));
            tempArr.set(end, t);
            start++;
            end--;
        }
        
        if (isSortedList(tempArr)) {
            System.out.println("yes");
            System.out.println("reverse " + (l + 1) + " " + (r + 1));
            return;
        }
        
        System.out.println("no");
    }
    
    private static boolean isSortedList(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.almostSorted(arr);

        bufferedReader.close();
    }
}