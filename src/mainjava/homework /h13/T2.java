class Solution {
    public int maximumCount(int[] nums) {
        int neg = countNegatives(nums);
        int pos = countPositives(nums);
        return Math.max(neg, pos);
    }

    // Шукаємо індекс першого елемента, який >= 0
    private int countNegatives(int[] nums) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // Індекс дорівнює кількості від'ємних елементів
    }

    // Шукаємо індекс першого елемента, який > 0
    private int countPositives(int[] nums) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums.length - left; // Кількість додатних елементів
    }
}
