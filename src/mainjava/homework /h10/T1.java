class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        
        // Повторюємо, поки довжина рядка не стане принаймні k
        while (sb.length() < k) {
            int len = sb.length();
            for (int i = 0; i < len; i++) {
                // Отримуємо наступний символ за алфавітом
                char nextChar = (char) (sb.charAt(i) + 1);
                sb.append(nextChar);
            }
        }
        
        // Повертаємо символ на позиції k - 1 (так як індексація з 0)
        return sb.charAt(k - 1);
    }
}
