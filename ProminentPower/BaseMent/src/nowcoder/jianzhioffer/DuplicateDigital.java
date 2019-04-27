package nowcoder.jianzhioffer;

import java.util.Scanner;

public class DuplicateDigital {
    public static boolean duplicate(int numbers[],int length,int [] duplication)
    {
        if(numbers==null||numbers.length==0)
        {
            return false;
        }
        int flag=0;
        for(int m=0;m<length;m++)
            for(int j=m+1;j<length;j++)
            {
                if(numbers[m]==numbers[j])
                {
                    duplication[0]=numbers[m];
                    flag=1;
                }
            }
        return flag==1?true:false;

    }
    public static void main(String[] args)
    {

        int[] array1=new int[1];
        int num=0;
        Scanner scanner =new Scanner(System.in);
        num=scanner.nextInt();
        int[] array= new int[num];
        if(scanner.hasNext())
        {
            for(int i=0;i<num;i++)
            {
                array[i]=scanner.nextInt();
            }
        }
        System.out.print(duplicate(array,num,array1));
        System.out.print(array1[0]);



    }
}
