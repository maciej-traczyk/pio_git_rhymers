package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int ERROR = -1;
	private Node last;
	private int newNode;

	public static int getERROR() {
		return ERROR;
	}

	public int getNewNode() {
		return newNode;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public void setNewNode(int newNode) {
		this.newNode = newNode;
	}

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.setPrev(last);
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return ERROR;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return ERROR;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
