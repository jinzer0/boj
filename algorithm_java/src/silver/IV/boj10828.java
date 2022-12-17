package silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.StringTokenizer;

//public class silver.IV.boj10828 { // 직접 Singly linked list 및 stack 구현
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		ListStack<Integer> stack = new ListStack<>();
//
//		for (int i = 0; i < n; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			String command = st.nextToken();
//			switch (command) {
//				case "push":
//					stack.push(Integer.parseInt(st.nextToken()));
//					break;
//				case "pop":
//					stack.pop();
//					break;
//				case "size":
//					System.out.println(stack.size());
//					break;
//				case "empty":
//					if (stack.isEmpty()) System.out.println(1);
//					else System.out.println(0);
//					break;
//				case "top":
//					stack.top();
//			}
//		}
//	}
//}
//
//class Node<E> {
//	private E item;
//	private Node<E> next;
//	public Node(E item, Node<E> next) {
//		this.item = item;
//		this.next = next;
//	}
//
//	public E getItem() {return this.item;}
//	public Node<E> getNext() {return this.next;}
//	public void setItem(E newItem) {this.item = newItem;}
//	public void setNext(Node<E> newNext) {this.next = newNext;}
//}
//
//class ListStack<E> {
//	private Node<E> top;
//	private int size;
//	public ListStack() {
//		top = null;
//		size = 0;
//	}
//
//	public int size() {return this.size;}
//	public boolean isEmpty() {return this.size == 0;}
//	public void push(E newItem) {
//		this.top = new Node<>(newItem, top);
//		this.size++;
//	}
//	public void top() {
//		if (this.isEmpty()) System.out.println(-1);
//		else System.out.println(this.top.getItem());
//	}
//	public void pop() {
//		if (this.isEmpty()) System.out.println(-1);
//		else {
//			this.top();
//			top = top.getNext();
//			size--;
//		}
//	}
//}

// Collections 클래스내 stack 사용
public class boj10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			switch (command) {
				case "push":
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					try {
						System.out.println(stack.pop());
					} catch (EmptyStackException e) {
						System.out.println(-1);
					}
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					if (stack.isEmpty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "top":
					try {
						System.out.println(stack.peek());
					} catch (EmptyStackException e) {
						System.out.println(-1);
					}
			}
		}
	}
}