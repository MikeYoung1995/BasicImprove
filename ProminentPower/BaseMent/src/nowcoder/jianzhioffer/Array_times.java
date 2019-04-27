package nowcoder.jianzhioffer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 7.数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，
 * 因此输出2。如果不存在则输出0。
 * 更改了一些代码
 */
// Jvm heap,stack,data,

public class Array_times {

    static int getElement()
    {
        Scanner scanner =new Scanner(System.in);
        int[] array =new int[9];
        int m=0;
        int num=0;
        for(m=0;m<array.length;m++)
        {
            if(scanner.hasNext())
            {
                array[m]=scanner.nextInt();
            }
        }

        int count=0;
        int flag=0;
        Arrays.sort(array);//默认升序排列

        for(int i=0;i<array.length;i++)
        {
            int number=array[array.length/2];
            if(array[i]==number)
            {
                count++;
                if(count>array.length/2)
                    flag=array[i];
            }

        }

//        System.out.print(count);
        return flag;
    };


    public static void main(String[] args)
    {
        System.out.print(getElement());
    }

}
