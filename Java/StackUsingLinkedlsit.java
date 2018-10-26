package stackandqueue;

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}
}

public class StackUsingLinkedList<T> {

	private Node<T> top;
	private int size;

	public StackUsingLinkedList() {
		top = null;
		size = 0;
	}

	public void push(T data) {
		Node<T> nyaNode = new Node<>(data);
		size++;
		if (top == null) {
			top = nyaNode;
			return;
		}
		nyaNode.next = top;
		top = nyaNode;
	}

	public T pop() throws StackUnderFlowException {
		if (top == null) {
			throw new StackUnderFlowException();
		}
		size--;
		Node<T> temp = top;
		top = top.next;
		return temp.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

}
