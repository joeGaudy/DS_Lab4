
public class MyStack<T>
{
	public class Node{
		public T v;
		public Node n;
		
		public Node(T val, Node next){
			v = val;
            n = next;
		}
	}
	
	private Node head;
	
	public MyStack()
	{
		head = null;
	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{
		if (head == null) {
			head = new Node(val, null);
		}
		else {
			head = new Node(val, head);
		}
	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top()
	{
		
		return null;
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop()
	{
		if(head == null) {
			throw new StackUnderFlowException();
		}
		Node temp = head;
		head = temp.n;
		return temp.v;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		return true;
	}

}