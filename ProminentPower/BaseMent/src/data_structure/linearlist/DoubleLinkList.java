package data_structure.linearlist;

/**
 * Operations about doubleLinkList
 * 1.build innerclass
 * 2.initialLinkList
 * 3.insert
 * 4.delete
 * 5.get the element in the position of i
 * 6.get the size of linklist
 * 7.tell if the element exist
 * 8.print linklist
 */
public class DoubleLinkList {
    class DoubleNode
    {
        Object value=null;
        DoubleNode prior=null,next=null;
    }

    DoubleNode HeaddoubleNode=null;

    /**
     * initial DoubltNode
     *
     */

    void initial_DoubleNode()
    {
        HeaddoubleNode =new DoubleNode();
        HeaddoubleNode.value=null;
        HeaddoubleNode.prior=null;
        HeaddoubleNode.next=null;
    }

    /**
     * insert
     */

    void insertNode(Object data)
    {
        DoubleNode doubleNode =new DoubleNode();
        doubleNode.value=data;
        if(HeaddoubleNode.prior==null&&HeaddoubleNode.next==null)
        {
            HeaddoubleNode.next=doubleNode;
        }
        else
        {


        }

    }

}
