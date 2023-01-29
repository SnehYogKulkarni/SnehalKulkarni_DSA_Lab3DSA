package com.Q2.Model;

import java.util.*;

public class BinarySearchTree {
	 Node root;
		public  Node insertNode(Node node, int key) {
			if (node == null) {
				node = new Node(key);
				return node;
			}
			
			if (key < node.data) 

				node.left = insertNode(node.left, key);
			 else 
				node.right = insertNode(node.right, key);
			
			return node;
		}

		public Node createBST() {

			int key, n;
			Scanner in =  new Scanner(System.in);
			
			System.out.print("\n Enter number of nodes to inserted in BST :: ");
			n = in.nextInt();
			
			for (int i = 0; i < n; i++) {
				
				System.out.print("\n Enter value of Node :: ");
				key = in.nextInt();
				root = insertNode(root, key);
			}
			
			//in.close();
			
			return root;
		}

		public void inorderBST(Node node) {
			if(node != null) {
				
				inorderBST(node.left);
				System.out.print(" " +node.data);
				inorderBST(node.right);
			}
				
		}
		
}