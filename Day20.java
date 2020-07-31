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
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        for(int i = 1;i<preorder.length;i++)
        {
            TreeNode node = stack.peek();
            TreeNode child = new TreeNode(preorder[i]);
            while(!stack.isEmpty() && child.val > stack.peek().val)
            {
                node = stack.pop();
            }
            if(node.val < child.val)
            {
                node.right = child;
                System.out.println("Right");
            }
            else
            {
                node.left = child;
                System.out.println("Left");
            }

            stack.push(child);
        }

        return root;
    }
}
