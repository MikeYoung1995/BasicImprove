package nowcoder.jianzhioffer;

import java.util.Scanner;

public class OrderArray {
    static int getTimes(int[] array , int k)
    {
        int count=0;
            //对数组进行冒泡排序
            for(int i=0;i<array.length-1;i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            /**
             *统计一个数的出现次数
             */
            for(int i=0;i<array.length;i++)
                if(array[i]==k)
                {
                    count++;
                }


        return  count;
    }
    public static void main(String[] args)
    {
        int[]  array=new int[10];
        int number,i=0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            while (i < array.length)
            {
                array[i] = scanner.nextInt();
                i++;
            }
        }
//        System.out.println("请输入你想要搜索的数字");
        number=scanner.nextInt();
        System.out.print(getTimes(array,number));
    }
}
