

public class StackLink<T> implements StackLinkAdt<T> {
	private int count;
	private StackNode<T> top;

	//Constructor
	public StackLink() {
		this.count = 0;
		this.top = null;
	}


	//Push Function
	public void push(T element) {
		StackNode temp = new StackNode<T>(element);

		temp.setNext(this.top);
		this.top = temp;
		this.count++;
	}


	//Pop Function
	public T pop() {
		if (isEmpty()) {
			throw new RuntimeException("Impossible to pop an element from the Stack when is empty");
		}
		T result = this.top.getElem();
		this.top = this.top.getNext();
		this.count--;

		return result;
	}


	//Peek Function
	public T peek() {
		if (isEmpty()) {
			throw new RuntimeException("Impossible to peek an element from the Stack when is empty");
		}
		return this.top.getElem();
	}

	//isEmpty Function
	public boolean isEmpty() {
		return (this.count == 0);
	}

	//Size Function
	public int size() {
		return this.count;
	}

	//toString Function
	public String toString() {
		String result = "";
		StackNode<T> current = this.top;

		while (current != null) {
			result = result + (current.getElem()).toString() + "\n";
			current = current.getNext();
		}

		return result;
	}
}


