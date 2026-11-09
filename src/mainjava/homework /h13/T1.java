public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid)) {
                // Якщо mid зіпсована, перша зіпсована версія
                // лежить під індексом mid або лівіше
                right = mid;
            } else {
                // Якщо mid хороша, перша зіпсована знаходиться строго правіше
                left = mid + 1;
            }
        }
        
        return left;
    }
}
