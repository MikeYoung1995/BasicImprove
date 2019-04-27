package data_structure.array;

/**
 * 下面我们建立一个类，对数组的检索、插入、删除、打印操作进行封装，简便起见，
 * 我们假设数组中没有重复值（实际上数组可以包含重复值）
 *更新了一些东西
 */
public class Array {

    public String[] strArray;
    public int length=0;

    public Array(int max)
    {
        strArray = new String[max];
    }


    //检测数组是否包含某元素，存在返回下表，不存在返回-1
    public int contains(int target)
    {
        int index=-1;
        for(int i=0;i<length;i++)
        {
            if(strArray[i].equals(target))
            {
                index =i;
                break;
            }
        }

        return index;

    }


    //insert

    public void insert(String element)
    {
        strArray[length] = element;
        length++;
    }




}
