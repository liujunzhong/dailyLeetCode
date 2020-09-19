package com.ncu.leetcode;

public class L129SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    public int sum(TreeNode root,int n){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.val + n*10;
        return sum(root.left,root.val + n*10) + sum(root.right,root.val+n*10);
    }

}

