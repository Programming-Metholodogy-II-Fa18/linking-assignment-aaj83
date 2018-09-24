import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.*;


public class ArbitraryQueueArray {
	private int Array[];
	private int s1;
	private int i=0;
	private int q[];
	private int f,r,s2,length;

public ArbitraryQueueArray(int n) {
	this.s1=n;
	Array=new int[s1];
	this.s2=n;
	length=0;
	q=new int[s2];
	f=-1;
	r=-1;
	
}
	public void push(int el) {
		if(isFull()) {
			throw new StackOverflowError("full stack");
		}
		Array[i]=el;
		i++;
	}
	
	public int pop() {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			return Array[--i];
	}
	public boolean isEmpty() {
		if (i==0) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
		if(i==Array.length) {
			int temp[]=new int[2*Array.length];
			System.arraycopy(Array,0,temp,0,Array.length);
			System.arraycopy(temp,0,Array,0,temp.length);
			return true;
		}
	return false;
	}
	public void enqueue(int j) {
		if (r==-1) {
			f=0;
			r=0;
			q[r]=j;
		}
		else if(r+1<Array.length) {
			q[++r]=j;
			length++;
		}
		else if(r+1>=Array.length) {
			throw new IndexOutOfBoundsException("overflow");
		}
	}
		public int dequeue()
		{
			if(isEmpty()) 
				throw new NoSuchElementException("underflow");
			
			else {
				length--;
				int tem=q[f];
				if(f==r) {
					f=-1;
						r=-1;
				}
				else {
					f++;
					return tem;
				}
			}
			return f;
		}
		public int traverse(int i) {
			return Array[i];
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
