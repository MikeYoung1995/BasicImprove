package data_structure.array;

/**
 * somthing has Changed
 * 松木
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
