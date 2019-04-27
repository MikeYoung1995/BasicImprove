package algorithm_sort;

public class BubbleSort {
    /**
     * 冒泡排序
     */
    //创建数组
    static int[] array =new int[]{4,2,6,8,3,5,15,7,15,34,58,1,4,254,120,141,97,124,331,254,17,31,251};
    public static void main(String[] args)
    {
        System.out.println("该数组总共有"+array.length+"个数");
        System.out.println("排序前的数组为:");
        for(int m=0;m<array.length;m++)
        {
            System.out.print(array[m]+" "); //不换行输出
//            System.out.println(array[m]+"");//换行输出
        }
        System.out.println("   ");
        System.out.println("-------------------");


        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-1-i;j++)
            {
                    if(array[j]>array[j+1])
                    {
                        int temcount=array[j];
                       array[j]=array[j+1];
                       array[j+1]=temcount;
                    }
            }
        }

        System.out.println("冒牌排序后的数组为:");

        for(int k=0;k<array.length;k++)
        {
            System.out.print(array[k]+" "); //不换行输出
//            System.out.println(array[m]+"");//换行输出
        }

    }

}
