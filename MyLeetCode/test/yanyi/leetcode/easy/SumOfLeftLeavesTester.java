package yanyi.leetcode.easy;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import yanyi.leetcode.medium.ThreeSum;

public class SumOfLeftLeavesTester {

	@Test
	public void test() {
		try{
			SumOfLeftLeaves.TreeNode root = new SumOfLeftLeaves().buildTreeNode(3);
			root.left = new SumOfLeftLeaves().buildTreeNode(9);
			root.right = new SumOfLeftLeaves().buildTreeNode(20);
			root.right.left = new SumOfLeftLeaves().buildTreeNode(15);
			root.right.right = new SumOfLeftLeaves().buildTreeNode(7);
			
			int result = new SumOfLeftLeaves().sumOfLeftLeaves(root);
			System.out.println(result);
			
		}catch(Exception e){
			System.out.println(e.toString());
			fail(e.toString());
		}
	}

}
