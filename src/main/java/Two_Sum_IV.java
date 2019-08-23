import java.util.*;

/**
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.
 */

public class Two_Sum_IV {

    public static void main(String[] args) {
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

        System.out.println(findTarget(bt, 9));
    }


    public static boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        Map<Integer, TreeNode> map = new HashMap<>();

        while (!nodes.isEmpty()) {
            TreeNode node = nodes.remove();
            System.out.print(" " + node.val);
            int complement = k - node.val;
            if (map.containsKey(complement)) {
                return true;
            }
            map.put(node.val, node);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }

        return false;
    }

    public boolean findTarget2(TreeNode root, int k) {
        Set<Integer> set = new HashSet();
        return find(root, k, set);
    }

    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null)
            return false;
        if (set.contains(k - root.val))
            return true;
        set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
    }

    public boolean findTarget3(TreeNode root, int k) {
        Set<Integer> set = new HashSet();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            if (queue.peek() != null) {
                TreeNode node = queue.remove();
                if (set.contains(k - node.val))
                    return true;
                set.add(node.val);
                queue.add(node.right);
                queue.add(node.left);
            } else
                queue.remove();
        }
        return false;
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
