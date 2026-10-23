class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2; // Якщо число парне, ділимо на 2
            } else {
                num -= 1; // Якщо непарне, віднімаємо 1
            }
            steps++; // Збільшуємо лічильник кроків
        }
        
        return steps;
    }
}
