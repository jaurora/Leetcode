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
    int[] pre;
    int[] in;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre = preorder;
        in  = inorder;
        if (preorder.length != inorder.length) return null;
        TreeNode head = addnode(0, preorder.length-1, 0, preorder.length-1);
        return head;
    }

    private TreeNode addnode(int pres, int pree, int ins, int ine) {
        if (pree < pres || ine < ins) return null;
                
        int val = pre[pres];
        TreeNode t = new TreeNode(val);

        int i=ins;
        while (in[i] != val && i<=ine) i++;
        int left_size = i-ins; 
        
        if (left_size==0) t.left = null;
        else t.left = addnode(pres+1,pres+left_size,ins,i-1);

        int right_size = ine-i;
        if (right_size==0) t.right = null;
        else t.right = addnode(pres+left_size+1, pree, i+1, ine);
        
        return t;
    }


   public static void main(String[] args) {
       Solution slu = new Solution();
       int[] pre = new int[] {0,1,3,4,2,5,6};
       int[] in = new int[] {3,1,4,0,5,2,6};
       TreeNode h = slu.buildTree(pre, in);
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
