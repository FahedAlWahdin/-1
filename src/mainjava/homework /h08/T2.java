import java.util.Collections;
import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                // Якщо сума елементів за індексами left і right менша за target,
                // то для поточного left усі елементи від left + 1 до right також утворюють суму < target.
                count += right - left;
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
