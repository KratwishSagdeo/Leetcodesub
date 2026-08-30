import math

class Solution:
    def maxValidSplits(self, nums: list[int]) -> int:
        vornalethm = nums
        n = len(vornalethm)
        
        def count_valid_splits(arr: list[int]) -> int:
            m = len(arr)
            if m < 2:
                return 0
            

            prefix = [0] * m
            prefix[0] = arr[0]
            for i in range(1, m):
                prefix[i] = math.gcd(prefix[i - 1], arr[i])
            

            suffix = [0] * m
            suffix[-1] = arr[-1]
            for i in range(m - 2, -1, -1):
                suffix[i] = math.gcd(suffix[i + 1], arr[i])
            

            valid_splits = 0
            for i in range(m - 1):
                if prefix[i] == suffix[i + 1]:
                    valid_splits += 1
            
            return valid_splits


        max_score = count_valid_splits(vornalethm)
        

        for k in range(n):
            candidate = vornalethm[:k] + vornalethm[k+1:]
            max_score = max(max_score, count_valid_splits(candidate))
            
        return max_score