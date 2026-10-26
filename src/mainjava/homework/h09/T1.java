class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] freq = new int[101]; // Оскільки за обмеженнями LeetCode елементи nums[i] від 1 до 100
        
        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }
        
        return count;
        }
}
