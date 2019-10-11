package nowcoder.campusRecurit;

/**
 * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
 * 给定一个原字符串A，请返回逆序后的字符串。例，输入"I am a boy!", 输出"boy! a am I"
 * 输入一行字符串str。(1<=strlen(str)<=10000)
 *
 * 输出描述:
 * 返回逆序后的字符串。
 *
 * 输入例子1:
 * It's a dog!
 *
 * 输出例子1:
 * dog! a It's
 */
public class StringReversedOrder {
    public static  String fun1(String str){
        //方法一 将字符串转换为字符数组
        char[] arr = str.toCharArray();
        // 逆序输出字符数组
        for(int i = 0;i<arr.length/2;i++){
            char temp;
            temp = arr[i];
            arr[i] = arr[arr.length-i-1] ;
            arr[arr.length-i-1] = temp;
        }
        return new String(arr);
    }

    public static String fun2(String str){
        StringBuilder sb = new StringBuilder(str);
        return  sb.reverse().toString();
    }
    public static void main(String[] args){
        String str = "It's a dog!";
        System.out.println(fun1(str));
        System.out.println(fun2(str));
    }

}
