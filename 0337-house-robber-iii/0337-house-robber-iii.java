class Solution {
    public int rob(TreeNode root) {
        int[] arr=traverse(root);
        return Math.max(arr[0],arr[1]);
    }
    static int[] traverse(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int[] left=traverse(root.left);
        int[] right=traverse(root.right);

        int notrob=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        int rob=root.val+left[0]+right[0];

        return new int[]{notrob,rob};
    }
}