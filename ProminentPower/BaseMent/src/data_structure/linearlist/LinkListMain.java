package data_structure.linearlist;

public class LinkListMain {

    public static void main(String[] args) {
        LinkList lList = new LinkList();
        lList.initList();
        lList.insertList(1);
        lList.insertList(2);
        lList.insertList(3);
        lList.insertList(4);
        lList.insertList(5);
        lList.print();
        lList.deletelist(2);
        lList.print();
        System.out.println("链表长度："+lList.size());
        System.out.println("第1个元素值为："+lList.getElement(1).value);
        System.out.println("第2个元素值为："+lList.getElement(2).value);
        System.out.println("第3个元素值为："+lList.getElement(3).value);
        System.out.println("第4个元素值为："+lList.getElement(4).value);

        System.out.println(lList.isContain(2));
        System.out.println(lList.isContain(6));
        System.out.println(lList.isContain(5));
    }
}
