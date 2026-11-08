
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // 1. Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Convert map entries to a List
        List<Map.Entry<Integer, Integer>> list =
            new ArrayList<>(map.entrySet());

        // 3. Sort by frequency in descending order
        list.sort((a, b) ->
            b.getValue().compareTo(a.getValue()));

        // 4. Extract top k keys
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
