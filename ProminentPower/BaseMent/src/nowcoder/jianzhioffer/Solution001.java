package nowcoder.jianzhioffer;
//二维数组查找

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */

public class Solution001 {
    public static boolean Find(int[][] array,int target)
    {
        int len =array.length-1;
        int index=0;
        while ((len>=0)&&(index<array[0].length)) //可以连续判断
        {
            if(array[len][index]>target)
            {
                len--;
            }
            else if(array[len][index]<target)
            {
                index++;
            }
            else
            { return true;}


        }

        return false;


    }

    public static void main(String[] args)
    {
        int number=5;
        int[][] array1 =new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}}; //4行4列
//        for(int i=0;i<array.length;i++)//遍历行
//        {
//            for (int j = 0; j < array[i].length; j++)//遍历当前行所在列
//            {
//                System.out.print(array[i][j]+" ");
//            }
//
//            System.out.println("");
//        }
        System.out.println(Find(array1,number));

//        System.out.println(array.length);

    }
}
