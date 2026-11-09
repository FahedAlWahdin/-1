/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Базовий випадок: якщо вузол порожній (null), повертаємо null
        if (root == null) {
            return null;
        }

        // Міняємо місцями ліве та праве піддерева
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Рекурсивно інвертуємо ліве та праве піддерева
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
