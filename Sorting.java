

import java.util.*;

	class Stack
	{
	class Node
	{
	public int data;
	public Node next;
	}
	private Node head;
	public Stack()
	{
	head = null;
	}
	public void push(int x)
	{
	Node next = new Node();
	next.data = x;
	next.next = head;
	head = next;
	System.out.print("\nPushed "+x+"\nCurrent Stack: ");
	print();
	}
	public int peek()
	{
	if (head == null)
	{
	throw new NoSuchElementException();
	}
	else
	{
	int out = head.data;
	return out;
	}
	}
	public int pastPeek()
	{
	if (head == null)
	{
	throw new NoSuchElementException();
	}
	else
	{
	int out = head.data;
	return out;
	}
	}
	public int pop()

	{

	if (head == null)

	{

	throw new NoSuchElementException();

	}

	else

	{

	Node t = head;

	head = head.next;

	return t.data;

	}

	}

	

	public void swap(Node a,Node b)

	{

	System.out.println("\nSwap "+a.data+" and "+b.data);

	int t=a.data;

	a.data=b.data;

	b.data=t;

	}

	public void insertionSort()

	{

	Node t1=head.next,t2=null;

	while(t1!=null)

	{

	t2=head;

	while(t2.data!=t1.data)

	{

	if(t2.data>t1.data)

	swap(t1,t2);

	t2=t2.next;

	}

	t1=t1.next;

	}

	System.out.println("Sort Finished");

	}

	public void print()

	{

	Node t=head;

	while(t!=null)

	{

	System.out.print(t.data+ " ");

	t=t.next;

	}

	}

	}

public class Sorting {

	public static void main (String[] args)

	{

	Stack list = new Stack();
	

	list.push(1);
	list.push(45);
	list.push(4);
	list.push(33);
	list.push(89);
	list.push(67);


	list.insertionSort();

	
	list.print();

	System.out.print("\nPeek : " + list.peek());
	System.out.print("\n past peek: " +list.pastPeek());
	System.out.print("\n pop: " + list.pop() );
	System.out.print("\n pop: " + list.pop() );
	System.out.print("\n pop: " + list.pop());
	System.out.print("\n past peek: " +list.pastPeek());


	}

	
	}

