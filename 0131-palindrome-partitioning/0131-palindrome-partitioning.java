import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        f(0, s, path, res);
        return res;
    }

    void f(int index, String s, List<String> path, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        // ye if condition me ham ky kr rahe hai ki agar index ka length is equal to String s ki length and if they are the same we have to add the list to the res arraylist
        
        for (int i = index; i < s.length(); ++i) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                f(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
        // ye above for loop me ham index se loop start krre here we are iterating till the string's length isPalindrome() what this method is we are checking weather the all the characters from the index to i are in palindrome or not and if it returns true we need to add the palindromic string to the path list and then we again call the function we need to we need to remove the last element and then again start.
    }

    boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
    // what we are doing in this function we are checking weather the given string is palindrome or not 
}
