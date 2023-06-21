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
class Solution 
{
    public int kthSmallest(TreeNode root, int k) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        traversal(root,arr);
        return arr.get(k-1);

    }

    static void traversal(TreeNode root,List<Integer> arr)
    {
         if(root == null)
        {
            return;
        }

        traversal(root.left, arr);
        arr.add(root.val);
        traversal(root.right, arr);

    }
}