package javabase.sytaxbasement;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型测试
 */
public class Genericity{

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();

        list.add("KOBE");
        list.add("James");
//        list.add(100);

        for(int i=0;i<list.size();i++)
        {
            String name =list.get(i);
            System.out.println("name"+name);
        }
    }


}


