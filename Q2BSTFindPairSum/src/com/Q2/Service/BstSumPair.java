package com.Q2.Service;

import java.util.*;
import com.Q2.Model.*;


public class BstSumPair {
	public void isPairPresent(Node root, int sum)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		
		if (!findSumpPair(root, sum, set))
			System.out.print("Nodes are not Found!"+ "\n");
	}

	public boolean findSumpPair(Node root, int sum, HashSet<Integer> set) {
		
		if (root == null)
			return false;


		if (findSumpPair(root.left, sum, set))
			return true;


		if (set.contains(sum - root.data)) {
			System.out.println("Pair is found (" 
				  + (sum - root.data) + ", " + root.data + ")");
			return true;
		}
		else
			set.add(root.data);


		return findSumpPair(root.right, sum, set);

	}





}
