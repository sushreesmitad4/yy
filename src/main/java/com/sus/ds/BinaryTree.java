package com.sus.ds;
	// BinaryTree.java 
	public class BinaryTree { 
	  // Root node pointer. Will be null for an empty tree. 
	  private Node root; 
	 

	  /* 
	   --Node-- 
	   The binary tree is built using this nested node class. 
	   Each node stores one data element, and has left and right 
	   sub-tree pointer which may be null. 
	   The node is a "dumb" nested class -- we just use it for 
	   storage; it does not have any methods. 
	  */ 
	  private static class Node { 
	    Node left; 
	    Node right; 
	    int data;

	    Node(int newData) { 
	      left = null; 
	      right = null; 
	      data = newData; 
	    } 
	  }

	  /** 
	   Creates an empty binary tree -- a null root pointer. 
	  */ 
	  public void BinaryTree() { 
	    root = null; 
	  } 
	 

	  /** 
	   Returns true if the given target is in the binary tree. 
	   Uses a recursive helper. 
	  */ 
	  public boolean lookup(int data) { 
	    return(lookup(root, data)); 
	  } 
	 

	  /** 
	   Recursive lookup  -- given a node, recur 
	   down searching for the given data. 
	  */ 
	  private boolean lookup(Node node, int data) { 
	    if (node==null) { 
	      return(false); 
	    }

	    if (data==node.data) { 
	      return(true); 
	    } 
	    else if (data<node.data) { 
	      return(lookup(node.left, data)); 
	    } 
	    else { 
	      return(lookup(node.right, data)); 
	    } 
	  } 
	 

	  /** 
	   Inserts the given data into the binary tree. 
	   Uses a recursive helper. 
	  */ 
	  public void insert(int data) { 
	    root = insert(root, data); 
	  } 
	 

	  /** 
	   Recursive insert -- given a node pointer, recur down and 
	   insert the given data into the tree. Returns the new 
	   node pointer (the standard way to communicate 
	   a changed pointer back to the caller). 
	  */ 
	  private Node insert(Node node, int data) { 
		  if(!lookup(data)){
	    if (node==null) { 
	      node = new Node(data); 
	    } 
	    else { 
	    	//if(!lookup(data)){
	    		if (data < node.data) { 
	    	        node.left = insert(node.left, data); 
	    	      } 
	    	      else { 
	    	        node.right = insert(node.right, data); 
	    	      }
	    		
	    	//}
	       
	    }
		  }
	    return(node); // in any case, return the new pointer to the caller 
	  } 
	
	  
	  /** 
	  Returns the number of nodes in the tree. 
	  Uses a recursive helper that recurs 
	  down the tree and counts the nodes. 
	 */ 
	 public int size() { 
	   return(size(root)); 
	 }
	 private int size(Node node) { 
	   if (node == null) return(0); 
	   else { 
	     return(size(node.left) + 1 + size(node.right)); 
	   } 
	 } 
	 
	 
	 /** 
	 Returns the max root-to-leaf depth of the tree. 
	 Uses a recursive helper that recurs down to find 
	 the max depth. 
	*/ 
	public int maxDepth() { 
	  return(maxDepth(root)); 
	}
	private int maxDepth(Node node) { 
	  if (node==null) { 
	    return(0); 
	  } 
	  else { 
	    int lDepth = maxDepth(node.left); 
	    int rDepth = maxDepth(node.right);

	    // use the larger + 1 
	    return(Math.max(lDepth, rDepth) + 1); 
	  } 
	} 
	
	
	
	/** 
	 Returns the min value in a non-empty binary search tree. 
	 Uses a helper method that iterates to the left to find 
	 the min value. 
	*/ 
	public int minValue() { 
	 return( minValue(root) ); 
	} 
	 
	/** 
	 Finds the min value in a non-empty binary search tree. 
	*/ 
	private int minValue(Node node) { 
	  Node current = node; 
	  while (current.left != null) { 
	    current = current.left; 
	  }

	  return(current.data); 
	}
	
	
	
	
	/** 
	 Prints the node values in the "inorder" order. 
	 Uses a recursive helper to do the traversal. 
	*/ 
	public void printTree() { 
	 printTree(root); 
	 System.out.println(); 
	}
	private void printTree(Node node) { 
	 if (node == null) return;

	 // left, node itself, right 
	 printTree(node.left); 
	 System.out.print(node.data + "  "); 
	 printTree(node.right); 
	} 
	
	
	
	/** 
	 Prints the node values in the "postorder" order. 
	 Uses a recursive helper to do the traversal. 
	*/ 
	public void printPostorder() { 
	 printPostorder(root); 
	 System.out.println(); 
	}
	public void printPostorder(Node node) { 
	  if (node == null) return;

	  // first recur on both subtrees 
	  printPostorder(node.left); 
	  printPostorder(node.right);

	  // then deal with the node 
	 System.out.print(node.data + "  "); 
	} 
	
	
	/** 
	 Prints the node values in the "preorder" order. 
	 Uses a recursive helper to do the traversal. 
	*/ 
	public void printPreorder() { 
	 printPreorder(root); 
	 System.out.println(); 
	}
	public void printPreorder(Node node) { 
	  if (node == null) return;
	  System.out.print(node.data + "  "); 
	  printPreorder(node.left); 
	  printPreorder(node.right);

	 
	} 
	
	  
	  
	  
	  
	
	public static void main(String[] args) {
		
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(1);
		binaryTree.insert(9);
		binaryTree.insert(2);
		binaryTree.insert(8);
		binaryTree.insert(3);
		binaryTree.insert(7);
		binaryTree.insert(4);
		binaryTree.insert(6);
		binaryTree.insert(5);
		binaryTree.insert(5);
		binaryTree.insert(3);
		binaryTree.insert(4);
		
		
		binaryTree.printPostorder();
		binaryTree.printTree();
		binaryTree.printPreorder();
		
		
		
		
	}

}
