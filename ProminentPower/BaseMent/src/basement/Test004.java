package basement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap和HashTable的区别和联系
 */
public class Test004 {

    public static void main(String[] args){
        HashMap<Integer,String> Man=new HashMap<>();
        for(int i=0;i<5;i++){
            Man.put(i,"小"+(int)(Math.random()*100));
        }
        //获取元素数量
        System.out.println(Man.size());
        //获取key是3的元素
        System.out.println(Man.get(2));
        /**
         * 遍历
         */

        //map遍历
        for(Map.Entry<Integer,String> entry:Man.entrySet())
        {
            System.out.println(entry.getKey()+"------>"+entry.getValue());
        }

        //遍历所有Key
        for(int key:Man.keySet()){
            System.out.println(key+"");
        }

        //遍历所有value
        for(String value:Man.values())
        {
            System.out.println(value+"");
        }

//迭代器遍历
        Iterator<Map.Entry<Integer, String>> it = Man.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> next = it.next();
            System.out.println(next.getKey()+" ——> "+next.getValue());
        }

        //通过键找值遍历
        for(int k: Man.keySet()) {
            System.out.println(k+" ——> "+Man.get(k));
        }

    }


}
