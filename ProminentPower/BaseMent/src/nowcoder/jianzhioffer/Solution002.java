package nowcoder.jianzhioffer;
//替换字符串中的空格
/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution002 {

    /**
     *  StringBuffer和StringBuilder的区别
     * @param str
     * @return
     */
    public static String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer =new StringBuffer(); //线程安全
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)==' ')
        {
            stringBuffer.append('%');
            stringBuffer.append('2');
            stringBuffer.append('0');
        }
        else
        {
            stringBuffer.append(str.charAt(i));
        }
    }
        return  stringBuffer.toString();
    }
    public static void main(String[] args)
    {
         StringBuffer stringBuffer =new StringBuffer("hello world");
         System.out.println(replaceSpace(stringBuffer));

    }
}
