class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // Очікувана сума чисел від 0 до n
        int expectedSum = n * (n + 1) / 2;
        
        // Обчислюємо фактичну суму масиву
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // Різниця і є відсутнім числом
        return expectedSum - actualSum;
    }
}class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // Очікувана сума чисел від 0 до n
        int expectedSum = n * (n + 1) / 2;
        
        // Обчислюємо фактичну суму масиву
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // Різниця і є відсутнім числом
        return expectedSum - actualSum;
    }
}
