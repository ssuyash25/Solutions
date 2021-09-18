package helloworld;

class Node{
	int value;
	Node right;
	Node left;
	
	Node(int data){
		this.value = data;
		this.right = null;
		this.left = null;
	}
}

public class Tree {
	
	Node root;
	Tree(){
		this.root = null;
	}
	
	void insert(int data) {
		Node n = new Node(data);
		if(root == null)
			root = n;
		else {
			Node cur = root;
			Node prev = null;
			while(cur != null) {
				prev = cur;
				cur = data > cur.value ? cur.right : cur.left;
			}
			if(data > prev.value)
				prev.right = n;
			else
				prev.left = n;
		}
	}
	
	void printTree(Node n) {
		if(n == null)
			return;
		printTree(n.right);
		System.out.println(n.value);
		printTree(n.left);
	}
	
	void preOrder(Node n) {
		System.out.print(n.value + " ");
		if(n.left != null)
			preOrder(n.left);
		if(n.right != null)
			preOrder(n.right);
	}
	
	void inOrder(Node n) {
		if(n.left != null)
			inOrder(n.left);
		System.out.print(n.value + " ");
		if(n.right != null)
			inOrder(n.right);
	}
	
	void postOrder(Node n) {
		if(n.left != null)
			preOrder(n.left);
		if(n.right != null)
			preOrder(n.right);
		System.out.print(n.value + " ");
	}
	
	public static void main(String args[]) {
		Tree ob = new Tree();
		ob.insert(5);
		ob.insert(4);
		ob.insert(7);
		ob.insert(2);
		ob.insert(8);
		//ob.printTree(ob.root);
		ob.preOrder(ob.root);
		System.out.println(" ");
		ob.inOrder(ob.root);
		System.out.println(" ");
		ob.postOrder(ob.root);
	}
	
}
