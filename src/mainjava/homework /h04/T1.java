class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        
        while (xor != 0) {
            count += xor & 1; // Перевіряємо останній біт
            xor >>= 1;        // Зсуваємо біти вправо
        }
        
        return count;
    }
}
