package data_structure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *从上到下输出二叉树的节点
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTree {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if(treeNode.left!=null){
                queue.offer(treeNode.left);
            }
            if(treeNode.right!=null){
                queue.offer(treeNode.right);
            }
            list.add(treeNode.val);
        }
        return list;

    }

    public static void main(String[] args)
    {
        TreeNode head1 =new TreeNode(8);
        head1.left = new TreeNode(6);
        head1.right = new TreeNode(10);
        head1.left.left=new TreeNode(5);
        head1.left.right=new TreeNode(7);
        head1.right.left=new TreeNode(9);
        head1.right.right = new TreeNode(11);
        System.out.print(PrintFromTopToBottom(head1));
    }
}
