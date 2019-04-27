package algorithm_sort;

/**
 * 四种排序实现 快速排序 插入排序 冒泡排序 选择排序
 */
public class Sort {

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
    public static int[] bubble_sort(int[] array)
    {   for(int i=0;i<array.length;i++)
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
//        final int max=10;
//        int[] array =new int[max];
//        Scanner scanner =new Scanner(System.in);
//        if(scanner.hasNext())
//        {
//            for(int i=0;i<array.length;i++)
//            {
//                array[i]=scanner.nextInt();
//            }
//        }

        int[] arr = {10,7,2,4,7,62,3,4,2,1};
        quickSort(arr,0,arr.length-1);

//        System.out.println("快速排序的结果为:"+fast_sort(array));
//        System.out.println("插入排序的结果为:"+insert_sort(array)) ;
//        System.out.println("选择排序的结果为:"+choose_sort(arra   y));
        for(int k=0;k<arr.length;k++)
        {
//            System.out.print(bubble_sort(array)[k]+" ");
            System.out.print(arr[k]+" ");//换行输出
        }



    }
}
