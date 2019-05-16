package algorithm_sort;

/**
 * 四种排序实现 快速排序 插入排序 冒泡排序 选择排序
 */

/**
 * public 本包 本类 外包 子类
 * private 本类
 * protected 本包 子类
 * default 本包
 */
public class Sort {
    private static final int[] arr = {10,7,2,4,7,62,3,4,2,1};
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);


    }
    //插入排序
    public static int[] insert_sort(int[] array)
    {
        return  array;
    }
    //选择排序
    public static int[] choose_sort(int[] array)
    {
        return  array;
    }
    //冒泡排序
    public static int[] bubble_sort(int[] array) {
        for(int i=0;i<array.length;i++)
         for(int j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                int temp=0; //局部变量必须手动初始化 编译器不会自动为其初始化
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                }
        }
        return  array;
    }



    public static void main(String[] args)
    {
        quickSort(arr,0,arr.length-1);
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");//换行输出
        }

    }
}
