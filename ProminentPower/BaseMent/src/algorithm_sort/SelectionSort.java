package algorithm_sort;

/**
 * BubbltSort
 */
public class SelectionSort {

        public static void main(String[] args){
                int i;
                int[] array = new int[]{10,21,34,5,1,9,4,4,17};
                System.out.println("排序前的数组为");
                for (int m=0;m<array.length;m++)
                {
                        System.out.print(array[m]+" ");
                }

                System.out.println(" ");
                System.out.println("----------------------------------");
                for(int k=1;k<=array.length-1;k++)
                {
//                        for(int j=1;j<=array.length-1;j++)
                        for(int j=0;j<array.length-1;j++)
                        {
                                if(array[j]>array[j+1])
                                {
                                        int tmp =array[j];
                                        array[j] = array[j+1];
                                        array[j+1] =tmp;
                                }
                        }
                }
                System.out.println("排序后的顺序为");
                for(int m=0;m<array.length;m++)
                {
                        System.out.print(array[m]+" ");
                }
        }

}
