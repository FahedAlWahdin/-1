class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        
        // Якщо початковий колір вже збігається з цільовим, змін не потрібно
        if (originalColor != color) {
            dfs(image, sr, sc, originalColor, color);
        }
        
        return image;
    }
    
    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        // Перевірка виходу за межі матриці або невідповідності кольору
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != originalColor) {
            return;
        }
        
        // Зафарбовуємо поточний піксель
        image[r][c] = newColor;
        
        // Рекурсивно перевіряємо 4 сусідні напрямки
        dfs(image, r - 1, c, originalColor, newColor); // вгору
        dfs(image, r + 1, c, originalColor, newColor); // вниз
        dfs(image, r, c - 1, originalColor, newColor); // вліво
        dfs(image, r, c + 1, originalColor, newColor); // вправо
    }
}
