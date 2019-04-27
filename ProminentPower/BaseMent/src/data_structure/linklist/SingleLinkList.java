package data_structure.linklist;

/**
 * This code is edited in 2019.3.14
 */

/**
 * Operations about SingleLinkList---
 * 1.initial LinkList
 * 2.insert LinkList
 * 3.delete LinkList
 * 4.get the element in the position of i
 * 5.get the size of LinkList
 * 6.Tell if the one element exist
 * 7.Print LinkList
 */

public class SingleLinkList {

    class Node
    {
        private Object value =null;//
        private Node next =null; //
    }

    private Node headnode;

    /**
     * initial node
     */

    void initial_node()
    {
        headnode =new Node();
        headnode.value=null;
        headnode.next=null;
    }


    /**
     * insert node
     */

    void insert_node(Object data)
    {
        Node new_node= new Node();
        new_node.value=data;
        //if the headnode.next is empty
        if(headnode.next==null)
        {
            headnode.next=new_node;
        }
        else
        {
            Node temp = headnode;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new_node;

        }

    }

    /**
     * 将元素插入某个位置i
     */
    void insertNodeInto_CertainPoi(int i,Object data)
    {
        Node insertnode =new Node();
        Node temp =headnode;
        int count=0;
        while (temp.next!=null)
        {
            count++;
            if(count==i)
            {
                insertnode.next=temp.next;
                temp.next=insertnode;
                insertnode.value=data;
            }
            temp=temp.next;
        }



    }

    /**
     * delete node
     * @param data
     */
    void delete_node(Object data)
    {
        Node temp = headnode;
        int count=0;
        while (temp.next!=null)
        {
            if(temp.next.value.equals(data))
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }

    }

    /**
     * get the element in the position of i
     */

    int node_size()
    {
        Node temp =headnode;
        int count=0;
        while (temp.next!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }

    Node getNode(int i)
    {
        if(i<=0||i>node_size())
        {
            System.out.println("您要查找的节点位置不对");
            return null;
        }
        else
        {
            int count=0;
            Node node=new Node();
            Node temp = headnode;
            while (temp.next!=null)
            {
                count++;
                if(count==i)
                {

                    node.value=temp.next.value;
                }

                temp=temp.next;
            }

            return node;


        }

    }

    boolean isContain(Object data)
    {
        Node temp =headnode;
        while (temp.next!=null)
        {
            if(temp.next.value.equals(data))
            {
                System.out.println(data+"该节点存在");
                return true;
            }
              temp=temp.next;

        }

        System.out.println(data+"该节点不存在");
        return false;
    }


    void print_node()
    {
        System.out.println("打印链表");
        Node temp =headnode;
        while (temp.next!=null)
        {
            temp=temp.next;
            System.out.println(temp.value+"\t");
        }
    }




public static void main(String[] args)
{
    SingleLinkList siglinklist =new SingleLinkList();
    siglinklist.initial_node();//initial
    siglinklist.insert_node(1);
    siglinklist.insert_node(2);
    siglinklist.insert_node(3);
    siglinklist.insert_node(4);
    siglinklist.insert_node(5); //insert
    siglinklist.delete_node(3); //delete
    siglinklist.insertNodeInto_CertainPoi(3,2787);
    System.out.println("该链表的长度是"+siglinklist.node_size()); //size
    siglinklist.print_node(); //print
//    System.out.println("请输入你想要查找的节点的位置");
//    Scanner scanner =new Scanner(System.in);
//    int i =scanner.nextInt();
//    System.out.println("第"+i+"个位置的节点是"+siglinklist.getNode(i).value); //position
//    System.out.println("输入你想检查的是否存在的节点");
//    Scanner scanner1 =new Scanner(System.in);
//    Object data=scanner1.nextInt();
//    siglinklist.isContain(data); //exist



}


}
