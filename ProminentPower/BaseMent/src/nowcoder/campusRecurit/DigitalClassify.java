package nowcoder.campusRecurit;

import java.math.BigDecimal;
import java.util.*;

/**
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 *
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 *
 * 输入描述:
 * 每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，
 * 随后给出N个不超过1000的待分类的正整数。数字间以空格分隔。
 */
public class DigitalClassify {

    static  int digital_num,m=0;
    static  int[] arry;

   static void deal_figure()
    {

        Scanner scanner =new Scanner(System.in);
        if(scanner.hasNext())
        {
            digital_num=scanner.nextInt();
            if(digital_num>=1&&digital_num<=1000)
            {
                arry=new int[digital_num];
                for (m=0;m<digital_num;m++)
                {
                    arry[m]=scanner.nextInt();
                }
            }
            else
            {
                System.out.print("输入的数字错误");
                System.exit(0);
            }

        }

//        for(int i:arry)
//        System.out.print(i+" ");
    }

    /**
     * 求得能被5整除的数字中所有偶数的和；
     *
     */

    static void getSumOf_Five()
    {
        List list =new ArrayList();
        int m=0;
        for(m=0;m<arry.length;m++)
        {
            if(arry.length!=0)
            {
                if((arry[m]%5)==0&&(arry[m]%2)==0)
                {list.add(arry[m]);}
            }
        }
        if(list.size()!=0)
        {
            int i=0;
            int sum=0;
            while(i<list.size())
            {
                int count=(int)list.get(i);
                sum=sum+count;
                i++;
            }
            System.out.print(sum+" ");
        }
        else if(list.size()==0)
        {
            System.out.print("N"+" ");
        }
    }

    /**
     * 被5除后余1的数字，将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
     *
     */

    static void getSumof_Fiveleft1()
    {
        List list =new ArrayList();

        for(int i=0;i<arry.length;i++)
        {
            if(arry[i]%5==1)
            {
                list.add(arry[i]);
            }
        }
        if(list.size()>0)
        {

            int count=0,i=0,sum=0;
            while(i<list.size())
            {
                if(i%2==0)
                {
                    count=count+(int)list.get(i);
                }
                else if(i%2!=0)
                {
                    sum=sum+(int)(list).get(i);
                }
                i++;
            }

            System.out.print(count-sum+" ");
        }
        else if(list.size()==0)
        {
            System.out.print("N"+" ");
        }

    }

    static void getSumof_Fiveleft2()
    {

        List list =new ArrayList();

        int i;
        for(i=0;i<arry.length;i++)
        {
            if(arry[i]%5==2)
            {
                list.add(arry[i]);
            }
        }
        if(list.size()>0)
        {
            System.out.print(list.size()+" ");
        }
        else if(list.size()==0)
        {
            System.out.print("N"+" ");
        }


    }

    static void getSumof_Fiveleft3() {
        List list = new ArrayList();
        int i;
        for (i = 0; i < arry.length; i++)
        {
            if (arry[i] % 5 == 3)
            {
                list.add(arry[i]);
            }

        }
        if (list.size() > 0)
        {
            double count = 0;
            for (i = 0; i < list.size(); i++)
            {
                count = count + (int) list.get(i);
            }
            /**
             * 四舍五入 保留一位小数
             */
            BigDecimal bd= new BigDecimal(count/list.size());
            double count1=bd.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.print(count1+" ");
        }
        else if (list.size() == 0)
        {
            System.out.print("N" + " ");
        }

    }

   static void getSumof_Fiveleft4()
   {
       List list =new ArrayList();
       int i=0,m=0;
       for(i=0;i<arry.length;i++)
       {
           if(arry[i]%5==4)
           {
                list.add(arry[i]);
           }
       }
       if(list.size()>0)
       {
           Collections.sort(list);
           System.out.print(list.get(list.size()-1));
       }

       else if(list.size()==0)
       {
           System.out.print("N");
       }
   }


    public static void main(String[] args)
    {
        deal_figure();
        getSumOf_Five();
        getSumof_Fiveleft1();
        getSumof_Fiveleft2();
        getSumof_Fiveleft3();
        getSumof_Fiveleft4();

    }

}
