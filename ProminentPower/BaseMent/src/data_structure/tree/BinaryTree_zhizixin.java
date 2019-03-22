package data_structure.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 之字形打印二叉树
 */
class TreeNode1 {
    public int val;
    public TreeNode1 left;
    public TreeNode1 right;
    public TreeNode1(int data)
    {
        this.val=data;
    }

    public static ArrayList<ArrayList<Integer>> printFromTopToBottom(TreeNode1 pRoot)
    {
        ArrayList<ArrayList<Integer>> aList=new ArrayList<ArrayList<Integer>>();
        if(pRoot==null)
            return aList;

        Stack<TreeNode1> s1=new Stack<TreeNode1>();
        s1.add(pRoot);
        Stack<TreeNode1> s2=new Stack<TreeNode1>();
        while(!s1.isEmpty()||!s2.isEmpty()){
            if(!s1.isEmpty()){
                ArrayList<Integer> aList2=new ArrayList<Integer>();
                while(!s1.isEmpty()){
                    TreeNode1 p=s1.pop();
                    aList2.add(p.val);
                    if(p.left!=null)
                        s2.add(p.left);
                    if(p.right!=null)
                        s2.add(p.right);
                }
                aList.add(aList2);

            }
            else {
                ArrayList<Integer> aList2=new ArrayList<Integer>();
                while(!s2.isEmpty()){

                    TreeNode1 p=s2.pop();
                    if(p.right!=null)
                        s1.add(p.right);
                    if(p.left!=null)
                        s1.add(p.left);
                    aList2.add(p.val);

                }
                aList.add(aList2);
            }
        }
        return aList;

    }
    //队列操作 先进先出



    public static void main(String[] args)
    {
        TreeNode1 head =new TreeNode1(8);
        head.left = new TreeNode1(6);
        head.right = new TreeNode1(10);
        head.left.left=new TreeNode1(5);
        head.left.right=new TreeNode1(7);
        head.right.left=new TreeNode1(9);
        head.right.right = new TreeNode1(11);

        System.out.print(printFromTopToBottom(head));
    }

}
