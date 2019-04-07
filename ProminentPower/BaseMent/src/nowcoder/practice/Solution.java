package nowcoder.practice;

public class Solution {
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
