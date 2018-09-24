import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class ArbitraryQueue {
	private Queue<Object>queue;
	ArbitraryQueue(){
        queue=new LinkedList<Object>();
	}
	void Push(Object object){
        List list=new ArrayList(queue);
        try {
            extracted(object, list);
            LinkedList linkedList = new LinkedList<>(list);
			Queue<Object> newQueue=linkedList;
            queue=newQueue;
        } catch (Exception e){
            System.err.println(e);
        }
    }
	private void extracted(Object object, List list) {
		extracted1(object, list);
	}
	private void extracted1(Object object, List list) {
		extracted2(object, list);
	}
	private void extracted2(Object object, List list) {
		list.add(0, object);
	}
	void viewQueue(){
        System.out.println(queue);
    }
	void Traverse(int index){
        ArrayList arrayList = new ArrayList(queue);
		List list=arrayList;
        try {
            System.out.println(list.get(index));
        } catch(Exception e){
            System.err.println(e);
        }
    }
	void Dequeue(){
        List list = new ArrayList(queue);

        try {
            Object x = list.remove((list.size() - 1));

            Queue<Object> newQueue = new LinkedList<>(list);
            queue = newQueue;

            System.out.println("Removed tail : " + x);
        } catch(Exception e){
            System.err.println(e);
        }
    }
	void Pop(){
        ArrayList arrayList = new ArrayList(queue);
		List list=arrayList;
        try {
            Object x = list.remove(0);
            LinkedList linkedList = new LinkedList<>(list);
			Queue<Object> newQueue = linkedList;
            queue = newQueue;
            System.out.println("Removed head: " + x);
        } catch (Exception error){
            System.err.println(error);
        }
    }
	void Enqueue(Object object){
        try {
            new ArrayList(queue).add(object);
            Queue<Object> newQueue = new LinkedList<>(new ArrayList(queue));
            queue = newQueue;
        } catch (Exception error){
            System.err.println(error);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
