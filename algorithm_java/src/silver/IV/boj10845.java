package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ListQueue<Integer> queue = new ListQueue<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			switch (command) {
				case "push":
					queue.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if (queue.isEmpty()) System.out.println(-1);
					else System.out.println(queue.remove());
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					if (queue.isEmpty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "front":
					if (queue.isEmpty()) System.out.println(-1);
					else System.out.println(queue.getFront());
					break;
				case "back":
					if (queue.isEmpty()) System.out.println(-1);
					else System.out.println(queue.getRear());
					break;
			}
		}
	}
}

class ListQueue<E> {
	private Node<E> front, rear;
	private int size;
	public ListQueue() {
		this.front = this.rear = null;
		this.size = 0;
	}
	public int size() {return this.size;}
	public boolean isEmpty() {return this.size==0;}
	public void push(E newItem) {
		Node<E> newNode = new Node<>(newItem, null);
		if (this.isEmpty()) front = newNode;
		else rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	public E remove() {
		E frontItem = front.getItem();
		front = front.getNext();
		size--;
		if (isEmpty()) this.rear = null;
		return frontItem;
	}
	public E getFront() {
		return this.front.getItem();
	}
	public E getRear() {
		return this.rear.getItem();
	}
}

class Node<E> {
	private E item;
	private Node<E> next;
	public Node(E item, Node<E> next) {
		this.item = item;
		this.next = next;
	}

	public E getItem() {return this.item;}
	public Node<E> getNext() {return this.next;}
	public void setItem(E newItem) {this.item = newItem;}
	public void setNext(Node<E> newNext) {this.next = newNext;}
}