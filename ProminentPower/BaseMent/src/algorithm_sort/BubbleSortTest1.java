package algorithm_sort;

import java.util.Scanner;

public class BubbleSortTest1 {
    static int[] TestIntegerArray;
    public static void main(String args[]){
        System.out.println("How many numbers do you wanna input?");
        Scanner scanner =new Scanner(System.in);
        int scale =scanner.nextInt();
        TestIntegerArray=new int[scale];
        if(scanner.hasNext()){
            for(int i=0;i<TestIntegerArray.length;i++){
                TestIntegerArray[i]=scanner.nextInt();
            }
        }

        for(int i=0;i<TestIntegerArray.length-1;i++) //趟数
            for(int j=0;j<TestIntegerArray.length-1-i;j++){ //每趟交换次数
                    if(TestIntegerArray[j]>TestIntegerArray[j+1]){
                        int tempnumber=TestIntegerArray[j];
                        TestIntegerArray[j]=TestIntegerArray[j+1];
                        TestIntegerArray[j+1]=tempnumber;
                    }
            }


        for(int i=0;i<TestIntegerArray.length;i++){
            System.out.print(" "+TestIntegerArray[i]+" ");
        }


    }
}
