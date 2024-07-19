package com.practice.leetcode.array;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 */
public class SortedArrayToBST {

	public static void main(String[] args) {
		int[] nums1 = {-10,-3,0,5,9};
		int[] nums2 = {1,3};
		TreeNode node1 = buildBST(nums1, 0, nums1.length-1);
		TreeNode node2 = buildBST(nums2, 0, nums2.length-1);

		// print first node
		System.out.println("Printing first BST");
		inorderTraversal(node1);
		System.out.println("Printing second BST");
		inorderTraversal(node2);
	}

	private static TreeNode buildBST(int [] nums, int left, int right) {

		if( left > right) {
			return null;
		}

		int mid = left + (right - left) /2;
		TreeNode node = new TreeNode(nums[mid]);

		node.left = buildBST(nums, left, mid-1);
		node.right = buildBST(nums, mid+1, right);

		return node;
	}

	// Helper function to print the tree (inorder traversal)
	private static void inorderTraversal(TreeNode node) {
		if (node == null) return;
		inorderTraversal(node.left);
		System.out.print(node.val + " ");
		inorderTraversal(node.right);
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
