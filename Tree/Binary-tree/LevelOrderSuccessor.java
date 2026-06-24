

import java.util.*;

class TreeNode{
    int val;
    TreeNode right,left;

    public TreeNode(int val) {
        this.val = val;
        right=left=null;
    }
    
}
public class LevelOrderSuccessor {
    TreeNode root;

    public LevelOrderSuccessor() {
        root = null;
    }
    public static void main(String[] args) {
        LevelOrderSuccessor tree = new LevelOrderSuccessor();

        tree.root = new TreeNode(20);
        tree.root.right = new TreeNode(10);
        tree.root.left = new TreeNode(15);
        tree.root.right.left = new TreeNode(30);
        tree.root.left.left = new TreeNode(50);
        tree.root.right.right = new TreeNode(40);
        tree.root.left.right = new TreeNode(45);

        TreeNode key = tree.root.right.left; // node with value 30
        TreeNode succ = successor(tree.root, key);

        if (succ != null) {
            System.out.println("Successor of " + key.val + " is " + succ.val);
        } else {
            System.out.println("Successor of " + key.val + " is null");
        }

    }

    private static TreeNode successor(TreeNode root, TreeNode key){
         if(root == null) return null;
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            TreeNode current = q.poll();

            
            if (current.left != null) q.offer(current.left);
            if (current.right != null) q.offer(current.right);

            if (current == key) {
                return q.peek(); // next node in queue is successor
            }
        }
        return null;
    }
}
