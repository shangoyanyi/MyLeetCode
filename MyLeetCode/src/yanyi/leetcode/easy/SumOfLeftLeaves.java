package yanyi.leetcode.easy;

import java.util.List;
import java.util.ArrayList;

/**
 * Find the sum of all left leaves in a given binary tree.
 * Example:
 * 
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 *
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 * @author shangoyanyi
 * @since 2017/2/23
 */
public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		if(root == null){
			return 0;
		}
		
		List<TreeNode> queue1 = new ArrayList<TreeNode>();
		List<TreeNode> queue2 = new ArrayList<TreeNode>();
		
		int sum = 0;
		queue1.add(root);		
		
		while(true){
			for(TreeNode node:queue1){
				// System.out.println("node name:" + node.val);
				
				if((node.left!=null)){
					if((node.left.left == null) && (node.left.right == null)){
						sum += node.left.val;
					}else{
						queue2.add(node.left);
					}
				}
				
				if((node.right!=null)){
					if((node.right.left == null) && (node.right.right == null)){
						// sum += node.right.val;
					}else{
						queue2.add(node.right);
					}
				}
			}
			
			
			queue1.clear();
			for(TreeNode item:queue2){
				queue1.add(item);
			}
			
			queue2.clear();
			
			if(queue1.isEmpty()){
				break;
			}
		}
		
		return sum;		
    }
	
	
	
	
	/**
	 * Definition for a binary tree node.
	 */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	
	public TreeNode buildTreeNode(int x){
		return new TreeNode(x);
	}
}



