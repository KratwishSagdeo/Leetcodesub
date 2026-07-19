// Problem: Next Permutation
// Link: https://www.geeksforgeeks.org/problems/next-permutation5226/1

class Solution {
    void nextPermutation(int[] arr) {
        int index = -1;

        // Step 1: Find the pivot
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i - 1] < arr[i]) {
                index = i - 1;
                break;
            }
        }

        // Step 2: If no pivot exists, reverse the whole array
        if (index == -1) {
            reverse(arr, 0);
            return;
        }

        // Step 3: Find the first element from the right greater than pivot
        for (int i = arr.length - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(arr, index + 1);
    }

    void reverse(int[] arr, int index) {
        int p = arr.length - 1;

        while (index < p) {
            int temp = arr[index];
            arr[index] = arr[p];
            arr[p] = temp;

            index++;
            p--;
        }
    }
}