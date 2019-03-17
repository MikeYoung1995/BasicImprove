package nowcoder;

import java.util.Scanner;

/**
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 *
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 *
 * 输入描述:
 * 每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，
 * 随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。**/

public class OptimizeDigtClaf {

    static int dealprob()
    {
        int[] array;
        Scanner scanner =new Scanner(System.in);
        if(scanner.hasNext())
        {
            int value=scanner.nextInt();
            if(value>=1&&value<=1000)
            {
                array=new int[value];
                for(int i=0;i<value;i++) {
                    array[i] = scanner.nextInt();
                    switch (array[i] % 5)
                    {
                        case 0://能被5整除

                    }
                }

            }
            else
                System.exit(9);

        }
        else
           System.exit(0);
        return 0;
    }

    public static void main(String[] args)
    {

    }
}
