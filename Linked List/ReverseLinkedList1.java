import java.util.Stack;

public class ReverseLinkedList1 {

	public static void main(String[] args) {
		 ListNode list = new ListNode(1, new ListNode(2));
	     list.next.next = new ListNode(3);

	}

	public static ListNode reverseList(ListNode head) {
		  ListNode current = head;
	      Stack<ListNode> stack = new Stack<ListNode>(); //created a stack of ListNodes not integers
	      while(current != null) { // going through each node in the list
	    	  stack.push(current);  // adding to the stack
	    	  current = current.next; 
	      }
	      
	      ListNode dummy = new ListNode(-1); // created a dummy node to help out
	      current = dummy; // current is now pointing to dummy which is -1
	      while(!stack.isEmpty()) { // Have to add the rest of the values from the stack
	    	  ListNode currentNode = stack.pop(); // grab the node from the stack
	    	  current.next = new ListNode(currentNode.data); 
	    	  current = current.next;
	      }
	      return dummy.next;
	}
}
