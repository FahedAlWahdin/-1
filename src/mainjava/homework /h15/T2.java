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
 *         }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        
        // Якщо значення поточного вузла менше за low,
        // шукаємо суму тільки у правому піддереві
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        
        // Якщо значення поточного вузла більше за high,
        // шукаємо суму тільки у лівому піддереві
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        
        // Якщо значення вузла в межах [low, high],
        // додаємо його значення і рекурсивно обходимо обох дітей
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }
}
