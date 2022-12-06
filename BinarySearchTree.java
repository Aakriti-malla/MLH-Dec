import java.util.*;

class BinarySearchTree{
    static class TreeNode {
        //instance variables
        int val;
        TreeNode left;
        TreeNode right;

        //constructor
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root;

    BinarySearchTree(){
        this.root = null;
    }
    
    //function to check if the tree is a BST or not
    boolean isValidBST(){
        return isValidBST(this.root);
    }

    boolean isValidBST(TreeNode root) {
        Stack<TreeNode> st = new Stack();
        double left = - Double.MAX_VALUE;
        
        while(!st.isEmpty() || root != null){
            while(root != null){
                st.push(root);
                root = root.left;
            }
            
            root = st.pop();
            if(root.val <= left){
                return false;
            }
            
            left = root.val;
            root = root.right;
        } 
        
        return true;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();          //creating object
        bst.root = new TreeNode(2);
        bst.root.left = new TreeNode(1);
        bst.root.right = new TreeNode(3);
        System.out.println(bst.isValidBST());
    }

}





// class BinarySearchtree {
//     public boolean isValidBST(TreeNode root) {
//         Stack<TreeNode> st = new Stack();
//         double left = - Double.MAX_VALUE;
        
//         while(!st.isEmpty() || root != null){
//             while(root != null){
//                 st.push(root);
//                 root = root.left;
//             }
            
//             root = st.pop();
//             if(root.val <= left){
//                 return false;
//             }
            
//             left = root.val;
//             root = root.right;
//         } 
        
//         return true;
//     }

// }