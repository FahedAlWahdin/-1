class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;

        for (int s : salary) {
            if (s < min) min = s;
            if (s > max) max = s;
            sum += s;
        }

        // Відняти min та max від загальної суми
        sum -= (min + max);

        // Поділити на кількість елементів без двох (min та max)
        return sum / (salary.length - 2);
    }
}
