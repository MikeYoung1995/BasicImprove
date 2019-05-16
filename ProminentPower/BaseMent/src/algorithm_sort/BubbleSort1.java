package algorithm_sort;

/**
 * 冒泡排序
 */
public class BubbleSort1{

    private static final int ArrayNumber[]={12,24,25,65,32,25,29,87,94,35};//只能本类访问
    protected static void sort(){ //本类 本包 不同包的子类访问

        for(int i=0;i<ArrayNumber.length-1;i++)
            for(int j=0;j<ArrayNumber.length-i-1;j++)
            {
                if(ArrayNumber[j]>ArrayNumber[j+1])
                {
                    int temp=ArrayNumber[j];
                    ArrayNumber[j]=ArrayNumber[j+1];
                    ArrayNumber[j+1]=temp;
                }
            }
    }

    void sort1(){} //只能本包访问 默认为default
    public static void main(String[] args)
    {
        sort();
        for(int i=0;i<ArrayNumber.length;i++)
        {
            System.out.print(ArrayNumber[i]+" ");
        }
    }
}
