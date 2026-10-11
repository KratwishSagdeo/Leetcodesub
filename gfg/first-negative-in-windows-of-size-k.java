// Problem: First Negative in Windows of Size K
// Link: https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1

import java.util.*;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int n = arr.length;

        // Step 1: Process the first window of size k
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }

        // Record the answer for the first window
        if (!q.isEmpty()) {
            result.add(arr[q.peek()]);
        } else {
            result.add(0);
        }

        // Step 2: Process the rest of the windows
        for (int i = k; i < n; i++) {
            // Remove elements that are out of the current window boundary
            while (!q.isEmpty() && q.peek() <= i - k) {
                q.poll();
            }

            // Add current element if it's negative
            if (arr[i] < 0) {
                q.add(i);
            }

            // The front of the queue is the first negative element in the window
            if (!q.isEmpty()) {
                result.add(arr[q.peek()]);
            } else {
                result.add(0);
            }
        }

        return result;
    }
}