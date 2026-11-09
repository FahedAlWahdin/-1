class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int len = sb.length();
            // Якщо стек не порожній і останній символ дорівнює поточному
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1); // Видаляємо дублікат
            } else {
                sb.append(c); // Додаємо символ
            }
        }
        
        return sb.toString();
    }
}
