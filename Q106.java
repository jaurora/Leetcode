import java.util.*;
import java.lang.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int[] post;
    int[] in;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post = postorder;
        in  = inorder;
        if (post.length != in.length) return null;
        TreeNode head = addnode(0, in.length-1, 0, in.length-1);
        return head;
    }

    private TreeNode addnode(int ins, int ine, int posts, int poste) {
        if (ine < ins || poste < posts) return null;
                
        int val = post[poste];
        TreeNode t = new TreeNode(val);

        int i=ins;
        while (in[i] != val && i<=ine) i++;
        int left_size = i-ins; 
        
        if (left_size==0) t.left = null;
        else t.left = addnode(ins,i-1,posts,posts+left_size-1);

        int right_size = ine-i;
        if (right_size==0) t.right = null;
        else t.right = addnode(i+1, ine, posts+left_size, poste-1);
        
        return t;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] post = new int[] {3,4,1,5,6,2,0};
       int[] in = new int[] {3,1,4,0,5,2,6};
       TreeNode h = slu.buildTree(in, post);
       StdOut.println(h.val);
       StdOut.println(h.left.val);
       StdOut.println(h.right.val);
       
       StdOut.println(h.left.left.val);
       StdOut.println(h.left.right.val);

       StdOut.println(h.right.left.val);
       StdOut.println(h.right.right.val);

       //slu.exist(a);
   }
}
