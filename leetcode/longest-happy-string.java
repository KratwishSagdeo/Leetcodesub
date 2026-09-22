// Problem: Longest Happy String
// Link: https://leetcode.com/problems/longest-happy-string/

class Solution {
    // this is a helper class that stores character and its count
    static class Pair{
            char ch;
            int count;
            public Pair(Character ch,int count){
                this.ch = ch;
                this.count = count;
            }
        }
    public String longestDiverseString(int a, int b, int c) {
        // we have to implement heap using priority queue to store character+counts
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((x,y) -> Integer.compare(y.count,x.count));
        if(a>0){
            maxHeap.add(new Pair('a',a));
        }
        if(b>0){
            maxHeap.add(new Pair('b',b));
        }
        if(c>0){
            maxHeap.add(new Pair('c',c));
        }
        // string builder to built the happy string
        StringBuilder res = new StringBuilder();
        // process some character from heap to construct the string
        while(!maxHeap.isEmpty()){
            // Pop the most frequent character
            Pair first = maxHeap.poll();
            // check if adding this character would result in 3 consicative aaa jaise
            int resLen = res.length();
            if(resLen >= 2 && res.charAt(resLen-1) == first.ch && res.charAt(resLen-2) == first.ch){
                // if yes then we would need to take the next most frequent character
                // if no character is avaiable in heap
                if(maxHeap.isEmpty()){
                    break;
                }
                // get the next avaiable character
                Pair second = maxHeap.poll();
                res.append(second.ch);
                second.count--;
                //we have to check weather second has some more counts in it\
                if(second.count>0){
                    maxHeap.offer(second);
                }
                maxHeap.offer(first);
            }else{
                res.append(first.ch);
                first.count--;
                if(first.count>0){
                    maxHeap.offer(first);
                }
            }
        }
        return res.toString();
    }
}