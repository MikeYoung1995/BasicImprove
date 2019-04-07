package nowcoder.jianzhioffer;
//从尾到头打印链表

import java.util.ArrayList;
import java.util.Stack;


public class Solution003 {


    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //方法一 递归
//        if(listNode!=null)
//        {
//            this.printListFromTailToHead(listNode.next);
//            arrayList.add(listNode.val);
//        }

        //方法二 利用栈

        Stack<Integer>  stack = new Stack<>();
        while(listNode!=null)
        {
            stack.push(listNode.val);
            listNode= listNode.next;
        }
        ArrayList<Integer> arrayList =new ArrayList<>();
        while(!stack.isEmpty())
        {
            arrayList.add(stack.pop());
        }

        return  arrayList;
    }





    public static void main(String[] args)
    {
      ListNode listNode = new ListNode(3);
      listNode.next=new ListNode(4);
      listNode.next.next=new ListNode(5);
      listNode.next.next.next=new ListNode(6);
      listNode.next.next.next.next=new ListNode(7);
      listNode.next.next.next.next.next=new ListNode(8);
      System.out.println(printListFromTailToHead(listNode));


    }

}