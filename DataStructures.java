//create a simple Linked List of 56, 30 and 70
public class DataStructures {
    public static void main(String[] args) {
        System.out.println("**************Data STructures*************");

        Operations myLinkedList = new Operations();
        Operations myLinkedList1 = new Operations();
        Operations myLinkedList2 = new Operations();
        Operations myLinkedList3 = new Operations();
        Operations myLinkedList4 = new Operations();
        Operations myLinkedList5 = new Operations();
        Operations myLinkedList6 = new Operations();
        Operations myLinkedList7 = new Operations();
        Operations myLinkedList8 = new Operations();

        System.out.println("<------------Add node in start----------->");
        myLinkedList.addNode(70);
        myLinkedList.addNode(30);
        myLinkedList.addNode(56);
        myLinkedList.PrintList();

        System.out.println("<------------Add node in last----------->");
        myLinkedList1.append(56);
        myLinkedList1.append(30);
        myLinkedList1.append(70);
        myLinkedList1.PrintList();

        System.out.println("<------------Insert between two nodes----------->");
        myLinkedList2.insert(56);
        myLinkedList2.insert(70);
        myLinkedList2.insertBetweenNode(56, 70, 30);
        myLinkedList2.PrintList();

        System.out.println("<------------Delete first node----------->");
        myLinkedList3.insert(56);
        myLinkedList3.insert(30);
        myLinkedList3.insert(70);
        myLinkedList3.PrintList();
        System.out.println("After removing first node: ");
        myLinkedList3.pop();
        myLinkedList3.PrintList();

        System.out.println("<------------Delete last node----------->");
        myLinkedList4.insert(56);
        myLinkedList4.insert(30);
        myLinkedList4.insert(70);
        myLinkedList4.PrintList();
        System.out.println("After removing last node: ");
        myLinkedList4.popLastNode();
        myLinkedList4.PrintList();

        System.out.println("<------------Search node----------->");
        myLinkedList5.insert(56);
        myLinkedList5.insert(30);
        myLinkedList5.insert(70);
        myLinkedList5.PrintList();
        myLinkedList5.search(30);

        System.out.println("<------------Insert new node----------->");
        myLinkedList6.insert(56);
        myLinkedList6.insert(30);
        myLinkedList6.insert(70);
        myLinkedList6.PrintList();
        System.out.println("After inserting new node: ");
        myLinkedList6.insertAfter(30, 40);
        myLinkedList6.PrintList();

        System.out.println("<------------Delete node----------->");
        myLinkedList7.insert(56);
        myLinkedList7.insert(30);
        myLinkedList7.insert(40);
        myLinkedList7.insert(70);
        myLinkedList7.PrintList();
        //System.out.println("Size of the linkedList: ");
        myLinkedList7.size();

        System.out.println("Search node: 40 ");
        myLinkedList7.search(40);

        System.out.println("Delete node: 40 ");
        myLinkedList7.deleteNode(40);

        myLinkedList7.PrintList();
        myLinkedList7.size();

        System.out.println("<------------Sort node----------->");
        myLinkedList8.insert(56);
        myLinkedList8.insert(30);
        myLinkedList8.insert(40);
        myLinkedList8.insert(70);
        System.out.println("Linked List Before Sorting:");
        myLinkedList8.PrintList();
        myLinkedList8.sort();
        System.out.println("Linked List After Sorting:");
        myLinkedList8.PrintList();
    }
}