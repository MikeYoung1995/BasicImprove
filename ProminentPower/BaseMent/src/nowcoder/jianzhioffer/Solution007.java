package nowcoder.jianzhioffer;
//斐波那契数列
/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Solution007 {
    public static int Fibonacci(int n) {
        int a=1,b=1,c=0;
        if(n<0)
        {return 0;}
        else if(n==1||n==2)
        {
            return 1;
        }
        else if(n>=3&&n<=39)
        {
            for(int i=3;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }

        }
        return  c;

    }
//1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args)
    {
        System.out.print(Fibonacci(7));
    }

}
