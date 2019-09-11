
//Node Class for Linked List
public class StackNode<T> {
	
	//Private Variables
	private StackNode<T> next;
	private T elem;

	//Constructor
	public StackNode() {
		this.next = null;
		this.elem = null;
	}

	//Constructor (One Parameter)
	public StackNode(T elem) {
		this.next = null;
		this.elem = elem;
	}

	//Get Function (Next)
	public StackNode<T> getNext() {
		return this.next;
	}

	//Get Function (Element)
	public T getElem() {
		return this.elem;
	}

	//Set Function (Next)
	public void setNext(StackNode<T> node) {
		this.next = node;
	}

	//Set Function (Element)
	public void setElem(T elem) {
		this.elem = elem;
	}
}

