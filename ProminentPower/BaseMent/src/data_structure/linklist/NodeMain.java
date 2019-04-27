package data_structure.linklist;

//默认为default 只能同包中的类访问访问
class NodeList {

    NodeList next;
    int value;

    NodeList(int value) {
        this.next = null;
        this.value = value;
    }

    NodeList() {
    }
}

//default 只能同一个包可见
class ListOperations {



    NodeList headNode=null;
    //初始化链表
    public static NodeList initNodeList(NodeList headNode) {
        headNode =new NodeList();
        headNode.next = null;
        headNode.value =0;
        return headNode;
    }

    static NodeList createNodeList(NodeList node){
        NodeList  newnodeList  =new NodeList();
        newnodeList.next=node.next;
        node.next=newnodeList;
        return newnodeList;
    }



    static void printNodeList(NodeList nodeList){

        NodeList nodeList1 = nodeList.next;
        while(nodeList1!=null) {
            System.out.print(nodeList.value);
            nodeList1=nodeList1.next;
        }
    }


}


//该类 子类 同包 别的包都能访问
public class NodeMain {
    public static void main(String[] args) {
        ListOperations listOperations =new ListOperations();
        NodeList nodeList =new NodeList();
        nodeList=listOperations.initNodeList(nodeList);
        nodeList=listOperations.createNodeList(nodeList);
        nodeList.value=3;
        listOperations.printNodeList(nodeList);

    }
}
