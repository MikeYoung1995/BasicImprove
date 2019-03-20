package nowcoder.campusRecurit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 求任一正整数的阶乘（注意：是任意正整数）
 * 该正整数不大于1000。  已封装
 */
public class GetFactorial {
    public static BigInteger product,num;
    public static  BigInteger i;

    public static BigInteger getProduct(int vaule)
   {
       BigInteger d =new BigInteger(String.valueOf(vaule));
       num=new BigInteger("1");
       product=new BigInteger("1");
       i=new BigInteger("1");
       while(i.compareTo(d)==-1) //i小于d
       {
           product=product.multiply(i.add(num));
           i=i.add(num);
       }
        return  product;
   }
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        if(scanner.hasNext())
        {
            int data =scanner.nextInt();
            System.out.println(getProduct(data));
        }

    }
}
