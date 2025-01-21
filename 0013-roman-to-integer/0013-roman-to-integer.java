class Solution {
    public int romanToInt(String s) {
        int count = 0;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'I') {
                if ((i + 1) < arr.length && (arr[i + 1] == 'V')) {
                    count = count + 4;
                    i = i + 1;
                } else if ((i + 1) < arr.length && (arr[i + 1] == 'X')) {
                    count = count + 9;
                    i = i + 1;
                } else {
                    count = count + 1;
                }
            } else if (arr[i] == 'X') {
                if ((i + 1) < arr.length && (arr[i + 1] == 'L')) {
                    count = count + 40;
                    i = i + 1;
                } else if ((i + 1) < arr.length && (arr[i + 1] == 'C')) {
                    count = count + 90;
                    i = i + 1;
                } else {
                    count = count + 10;
                }
            } else if (arr[i] == 'C') {
                if ((i + 1) < arr.length && (arr[i + 1] == 'D')) {
                    count = count + 400;
                    i = i + 1;
                } else if ((i + 1) < arr.length && (arr[i + 1] == 'M')) {
                    count = count + 900;
                    i = i + 1;
                } else {
                    count = count + 100;
                }
            } else if (arr[i] == 'M') {
                count = count + 1000;
            } else if (arr[i] == 'V') {
                count = count + 5;
            } else if (arr[i] == 'D') {
                count = count + 500;
            } else if (arr[i] == 'L') {
                count = count + 50;
            }
        }
        return count;
    }
}
