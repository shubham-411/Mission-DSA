import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue();
        for (int n : nums) {
         
            heap.add(n);
            if (heap.size() > k) {
            
                heap.poll();
            }
        }
        return heap.peek();
    }
}