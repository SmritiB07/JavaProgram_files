package javasessions;

import javasessions.LL.Node;

public class LL {
	Node head;
	private int size;
	
	public LL() {
		this.size=0;
	}
	
	class Node {
		int data;
		Node next;
		public Node(int data) {// New Node
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
//	//adding from first
//   public void addFirst(String data) {
//	   Node newNode=new Node(data);
//	   if(head==null) {
//		 head=newNode;
//		 return;
//	   }
//	   newNode.next=head;
//	   head=newNode; 
//   }
   //adding from last
   public void addLast(int data) {
	   Node newNode=new Node(data);
	    if(head==null) {
	    	head=newNode;
	    	return; 	
	    }
	    Node currNode=head;
	    while(currNode.next!=null) {
	    	currNode=currNode.next;
	    }
         currNode.next=newNode;
    
   }
   //print list
   public void printList() {
	   if(head==null) {
	    	System.out.print("List is empty====");	
	    	return;
	    }
	   Node currNode=head;
	    while(currNode!=null) {
	    	System.out.print(currNode.data+"-->");
	    	currNode=currNode.next;
	    }
        System.out.println("null");
   }
//   //delete first
//   public void deletefirst() {
//	   if(head==null) {
//	    	System.out.print("The List is empty====");	
//	    	return;
//	    }
//	   size--;
//	   head=head.next;
//   }
//   //delete last node:
//    public void deletefromlast() {
//    	if(head==null) {
//	    	System.out.print("The List is empty====");	
//	    	return;
//	    }
//    	size--;
//    	if(head.next==null) {
//	    	head=null;
//	    	return;
//	    }
//	  Node secondLastNode=head;
//	  Node lastNode=head.next;//head.next=null->lastnode=null
//	  while(lastNode.next!=null){//null.next=== will give error
//		lastNode=  lastNode.next;
//		secondLastNode=secondLastNode.next;
//	  }
//	  secondLastNode.next=null;  
//    }
//    public int getSize() {
//    	return size;
//    }
    
    public void reverseIterate() {
		if(head==null|| head.next==null) {
			return;
		}
	Node prevNode=head;
	Node currNode=head.next;
	while(currNode!=null){
        Node nextNode=currNode.next;
        currNode.next=prevNode;//reverse is done
        prevNode=currNode;//update positions
        currNode=nextNode;
	}
	head.next=null;
	head=prevNode;
	}
    public Node reverseRecursive(Node head) {
    	if(head==null||head.next==null) {
    		return head;
    	}
    	Node newHead=reverseRecursive(head.next);
    	head.next.next=head;
    	head.next=null;
    	return newHead;
    	
    }
   
	public static void main(String[] args) {
		LL list=new LL();
//       list.addFirst("a");
//       list.addFirst("is");
       list.addLast(1);
       list.addLast(2);
       list.addLast(3);
       list.addLast(4);
       list.printList();
      //list.printList();
//     list.addFirst("LinkedList");
//     list.addLast("List"); 	
//     list.deletefromlast();
//     list.deletefirst();
//   
//     list.getSize();
//     list.addLast("List");
//     list.addFirst("LinkedList");
//     System.out.println(list.getSize());
//     list.printList();
    list.head= list.reverseRecursive(list.head);
     list.printList();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
