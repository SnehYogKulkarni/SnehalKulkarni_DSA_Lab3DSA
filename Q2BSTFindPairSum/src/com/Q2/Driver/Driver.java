package com.Q2.Driver;

import com.Q2.Model.*;
import com.Q2.Service.*;
import java.util.*;

public class Driver {

	static Node root;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BinarySearchTree bstTree = new BinarySearchTree();
		
		BstSumPair bst = new BstSumPair();
		
		//Binary Search Tree Creation
		root = bstTree.createBST();
		
		System.out.println("\n Inorder Traversal of given BST :: ");
		bstTree.inorderBST(root);
		
		System.out.print("\n Enter Sum :: ");
		int sum = sc.nextInt();
		
		//find whether node pair present in BST
		bst.isPairPresent(root, sum);
		
		sc.close();
	}
}
