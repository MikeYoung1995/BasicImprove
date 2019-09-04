package algorithm_sort;

import java.util.Scanner;

/**
 * 冒泡排序
 */
public class BubbleSort {
    static int[] array;
    static int max;
    public static void main(String[] args){
        System.out.println("How many numbers do you want input?");
        Scanner scanner =new Scanner(System.in);
        if(scanner.hasNext()){
            max=scanner.nextInt();
            array=new int[max];
            for (int i=0;i<array.length;i++){
                array[i]=scanner.nextInt();
            }
            BubbleSort(array);
        }

        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]+" ");
        }
    }


    public static void BubbleSort(int[] array){
        int temp=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
