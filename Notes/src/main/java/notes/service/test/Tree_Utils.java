package notes.service.test;

import java.util.List;

import notes.rest.viewObject.TreeNode;

public class Tree_Utils {

	
	public static TreeNode getTree(TreeNode rootTarget,List<TreeNode> targets){
		//1.check param
		if(null == targets || targets.isEmpty()) {
			return null;
		}
		//2.
		for(TreeNode target:targets) {
			target.getParentId();
		}
		
		return null;
	}
	
}
