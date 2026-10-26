import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        
        // Знаходимо максимальну кількість цукерок серед усіх дітей
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        
        List<Boolean> result = new ArrayList<>();
        
        // Перевіряємо, чи отримає кожна дитина найбільшу кількість цукерок після додавання extraCandies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        
        return result;
    }
}
