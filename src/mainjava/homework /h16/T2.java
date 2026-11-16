class Solution {
    public int findJudge(int n, int[][] trust) {
        // Якщо записів про довіру менше ніж n - 1, судді точно не існує
        if (trust.length < n - 1) {
            return -1;
        }

        // Масив для підрахунку балансу довіри для кожної людини (від 1 до n)
        int[] trustScores = new int[n + 1];

        for (int[] relation : trust) {
            trustScores[relation[0]]--; // Людина довіряє комусь (втрачає статус судді)
            trustScores[relation[1]]++; // Людині довіряють
        }

        // Шукаємо людину з балансом n - 1
        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
