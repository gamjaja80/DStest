package ds_test;

class TreeNode{
	Object data;
	TreeNode left;
	TreeNode right;
}

class LinkedTree{
	private TreeNode root;
	
	public TreeNode makeBT(TreeNode bt1, Object data, TreeNode bt2) {
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		return root;
	}
	
	public void preorder(TreeNode root) {
		if(root != null) {
			System.out.printf("%c", root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.printf("%c", root.data);
			inorder(root.right);
		}
	}
	
	public void postorder(TreeNode root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.printf("%c", root.data);
		}
	}
	
}



public class Ex9_1 {

	public static void main(String[] args) {
		LinkedTree T = new LinkedTree();
		
		TreeNode n7 = T.makeBT(null,'7', null);
		TreeNode n6 = T.makeBT(null, '6', null);
		TreeNode n5 = T.makeBT(null, '5', null);
		TreeNode n4 = T.makeBT(null, '4', null);
		TreeNode n3 = T.makeBT(n6, '3', n7);
		TreeNode n2 = T.makeBT(n4, '2', n5);
		TreeNode n1 = T.makeBT(n2, '1', n3);
		
		
		System.out.print("\n preorder : ");
		T.preorder(n1);
		
		System.out.print("\n inorder : ");
		T.inorder(n1);
		
		System.out.print("\n postorder : ");
		T.postorder(n1);
		
	}

}
