package nowcoder.jianzhioffer;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Solution005 {
   static Stack<Integer> stack1 = new Stack<Integer>();
   static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int first=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return first;
    }


    public static void main(String[] args)
    {
        int[] array =new int[]{3,4,8,21,6};
        for(int i=0;i<array.length;i++)
        {
            push(array[i]);
            System.out.print(pop()+" ");
        }

    }
}
