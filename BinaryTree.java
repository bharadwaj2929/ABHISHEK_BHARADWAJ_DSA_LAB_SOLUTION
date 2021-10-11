package com.greatlearning.lab.binarytree;

import java.util.ArrayList;

class Node{
	
	Node leftNode,rightNode;
	int nodeData;
	
	Node(int data){
		
		nodeData = data;
		leftNode = rightNode = null;
		
	}
	
}

public class BinaryTree{
	
	public static ArrayList<Integer> longestPath(Node root){
		
		if(root==null){
			
			ArrayList<Integer> path = new ArrayList<>();
			return path;
			
		}
		
		ArrayList<Integer> rightNode = longestPath(root.rightNode);
		ArrayList<Integer> leftNode = longestPath(root.leftNode);
		
		if(rightNode.size()<leftNode.size())
			leftNode.add(root.nodeData);
		
		else
			rightNode.add(root.nodeData);
		
		return (leftNode.size()>rightNode.size() ? leftNode:rightNode);
		
	}
	
	public static void main(String[] args){
		
		Node root = new Node(100);
		Node node1 = new Node(20);
		Node node2 = new Node(130);
		Node node3 = new Node(10);
		Node node4 = new Node(50);
		Node node5 = new Node(110);
		Node node6 = new Node(140);
		Node node7 = new Node(5);
		
		node3.leftNode = node7;
		
		node1.leftNode = node3;
		node1.rightNode = node4;
		
		node2.leftNode = node5;
		node2.rightNode = node6;
		
		root.rightNode = node1;
		root.leftNode = node2;
		
		ArrayList<Integer> path = longestPath(root);
		
		for(int i:path)
			System.out.println(i);
		
	}
	
}