package com.sus.datastructure;

public class Node {
	
	protected int data;
	protected  Node Link;
	
	/*  Constructor  */
	public Node()
	{
		data=0;
		Link=null;
	}
	
	/* parameterized Constructor  */
	public Node(int d,Node l)
	{
		this.data=d;
		this.Link=l;
	}

	/*  Function to get data from current Node  */
	public int getData() {
		return data;
	}

	 /*  Function to set data to current Node  */
	public void setData(int data) {
		this.data = data;
	}

	/*  Function to get Link to next Node  */
	public Node getLink() {
		return Link;
	}

	/*  Function to set link to next Node  */
	public void setLink(Node link) {
		Link = link;
	}

	
	
	
}
