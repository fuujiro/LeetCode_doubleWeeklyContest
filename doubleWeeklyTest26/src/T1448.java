public class T1448 {
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
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    class Solution {
        static int res;
        public int goodNodes(TreeNode root) {
            res = 0;
            dfs(root, Integer.MIN_VALUE);
            return res;
        }

        private void dfs(TreeNode node, int cur_max) {
            if(node == null)
                return;
            cur_max = Math.max(cur_max, node.val);
            if(cur_max==node.val)
                res++;
            dfs(node.left,cur_max);
            dfs(node.right,cur_max);
        }
    }
}
