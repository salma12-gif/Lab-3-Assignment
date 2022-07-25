package com.gl.utils;

import java.util.HashSet;
import java.util.Set;

public class FindSumOfPair {
	
	public static class Node {
		int nodeData;
		Node leftNode , rightNode;
		public Node() {
			
		}
		public Node(int key) {
			// TODO Auto-generated constructor stub
		}
	}
	
	static Node newNode(int newNode) {
		Node temp = new Node();
		temp.nodeData = newNode;
		temp.leftNode = null;
		temp.rightNode = null;
		
		return temp;
	}
	
	public static Node insert(Node root, int key) {
		 
		if(root==null) {
			return newNode(key);
		}
		if(key<root.nodeData) {
			root.leftNode=insert(root.leftNode,key);
		}else {
			root.rightNode= insert(root.rightNode,key);
		}
		return root;
		
	}
	// find pair util(root,sum,set)
	// base case 
	// if root ==null ==> return false;
	// find pair util(root,leftNode,sum,set)==>true ==> reurn true 
	// check if sum-nodeData is present in the set 
	//pair is sum-nodeData and nodeData
	//
	//else
	//add the num to set 
	// return 					
	//findpairutil(root.rightNode,sum,set)
	public boolean findPairUtil(Node root, int sum , HashSet set) {
		if(root == null) {
			return false;
		}
		
		if(findPairUtil(root.leftNode,sum,set)) {
			//System.out.println("Pair is found"+sum-root.nodata+root.nodeData));
			return true;
		}
		
		if(set.contains(sum-root.nodeData)){
			System.out.println("Pair is found("+(sum-root.nodeData)+","+root.nodeData+")");
			return true;
		}else {
			set.add(root.nodeData);
		}
		
		return findPairUtil(root.rightNode,sum,set);
	}
	
	public void findPairWithGivensum(Node root, int sum) {
		HashSet<Integer> set= new HashSet<>();
		if(!findPairUtil(root,sum,set)) {
			System.out.println("Pair do not exist!");
		}
			
			
	}
}
