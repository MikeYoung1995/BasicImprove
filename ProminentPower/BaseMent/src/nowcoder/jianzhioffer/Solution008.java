package nowcoder.jianzhioffer;

/** 青蛙跳台阶
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Solution008 {





    public static int JumpFloor(int target) {
        int s1=1,s2=2,result=0;//放到栈
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        else
            for(int i=2;i<target;i++)
            {
                result=s1+s2;
                s1=s2;
                s2=result;
            }
            return result;
    }


    public static void main(String[] args)
    {
        System.out.print(JumpFloor(5));
    }




}
