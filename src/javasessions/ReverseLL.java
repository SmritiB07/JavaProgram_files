package javasessions;

import java.util.LinkedList;

import javasessions.LL.Node;

public class ReverseLL {
	Node head;
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

	public static void main(String[] args) {
	
	}

}
