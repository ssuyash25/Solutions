package helloworld;

public class LinkedList {
	
	static Node head1, head2;
	 
    static class Node {
        int data;
        Node next;
        Node(int d)  {
            data = d;
            next = null;
        }
    }

	//Add two numbers represented by linked lists
    Node addTwoList(Node r1, Node r2) {
    	Node res = null;
    	Node temp = null;
    	Node prev = null;
    	int carry=0, sum;
    	
    	while(r1 !=null || r2!= null) {
    		sum = carry + (r1 != null ? r1.data : 0) + (r2 != null ? r2.data : 0);
    		carry = sum > 9 ? 1 : 0;
    		sum = sum % 10;
    		temp = new Node(sum);
    		if(res == null) {
    			res = temp;
    		}else {
    			prev.next = temp;
    		}
    		prev = temp;
    		if(r1 != null)
    			r1=r1.next;
    		if(r2 != null)
    			r2=r2.next;
    	}
    	
    	if(carry > 0) {
    		temp.next = new Node(carry);
    	}
    	
    	return res;
    }
    
    void printList(Node head)

    {

        while (head != null) {

            System.out.print(head.data + " ");

            head = head.next;

        }

        System.out.println("");

    }
 

    // Driver Code

    public static void main(String[] args)

    {

        LinkedList list = new LinkedList();
 

        // creating first list

        list.head1 = new Node(7);

        list.head1.next = new Node(5);

        list.head1.next.next = new Node(9);

        list.head1.next.next.next = new Node(4);

        list.head1.next.next.next.next = new Node(6);

        System.out.print("First List is ");

        list.printList(head1);
 

        // creating seconnd list

        list.head2 = new Node(8);

        list.head2.next = new Node(4);

        System.out.print("Second List is ");

        list.printList(head2);
 

        // add the two lists and see the result

        Node rs = list.addTwoList(head1, head2);

        System.out.print("Resultant List is ");

        list.printList(rs);

    }
} 
