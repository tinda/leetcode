import java.util.Arrays;
import java.util.Stack;

/**
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 * <p>
 * The binary search tree is guaranteed to have unique values.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
 * Output: 32
 * <p>
 * Example 2:
 * <p>
 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * Output: 23
 */

public class Range_Sum_of_BST {

    public static void main(String[] args) {
        TreeNode treenode = new TreeNode(10);

        int L = 3;
        int R = 6;

        /**
         * Input:
         *     5
         *    / \
         *   3   6
         *  / \   \
         * 2   4   7
         *
         * Target = 9
         */

        TreeNode bt = new TreeNode(5);
        bt.left = new TreeNode(3);
        bt.right = new TreeNode(6);
        bt.left.left = new TreeNode(2);
        bt.left.right = new TreeNode(4);
        bt.right.right = new TreeNode(7);

        System.out.println(rangeSumBST(bt, L, R));
    }

    int ans;

    public int rangeSumBST2(TreeNode root, int L, int R) {
        ans = 0;
        dfs(root, L, R);
        return ans;
    }

    public void dfs(TreeNode node, int L, int R) {
        if (node != null) {
            if (L <= node.val && node.val <= R)
                ans += node.val;
            if (L < node.val)
                dfs(node.left, L, R);
            if (node.val < R)
                dfs(node.right, L, R);
        }
    }

    public int rangeSumBST3(TreeNode root, int L, int R) {
        int ans = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (L <= node.val && node.val <= R)
                    ans += node.val;
                if (L < node.val)
                    stack.push(node.left);
                if (node.val < R)
                    stack.push(node.right);
            }
        }
        return ans;
    }

    int arr = 0;
    int i = 0;

    public int rangeSumBST4(TreeNode root, int L, int R) {

        if (root != null) {
            if (root.val >= L && root.val <= R)
                arr += root.val;
            if (L < root.val)
                rangeSumBST4(root.left, L, R);
            if (R > root.val)
                rangeSumBST4(root.right, L, R);
        }
        return arr;
    }

    static String tree = "";

    public static int rangeSumBST(TreeNode root, int L, int R) {
        printInorder(root);
        int count = 0;
        int can = 0;
        String[] treeitem = tree.split(",");

        Arrays.sort(treeitem);
        for (int i = 0; i < treeitem.length - 1; i++) {
            if (L <= Integer.parseInt(treeitem[i]) && Integer.parseInt(treeitem[i]) <= R)
                count += Integer.parseInt(treeitem[i]);
        }
        return count;
    }

    public static void printPreorder(TreeNode node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.val + " ");
        /* then recur on left sutree */
        printPreorder(node.left);
        /* now recur on right subtree */
        printPreorder(node.right);
    }

    public static void printInorder(TreeNode node) {
        if (node == null)
            return;
        /* first recur on left child */
        printInorder(node.left);
        tree = tree + node.val + ",";
        /* then print the data of node */
        System.out.print(node.val + " ");
        /* now recur on right child */
        printInorder(node.right);
    }

    void printPostorder(TreeNode node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);
        // then recur on right subtree
        printPostorder(node.right);
        // now deal with the node
        System.out.print(node.val + " ");
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
