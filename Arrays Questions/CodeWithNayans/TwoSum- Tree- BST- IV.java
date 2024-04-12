class Solution {
    
    ArrayList<Integer> al = new ArrayList<>();
    
    public void inorder(TreeNode root)
    {
        if(root == null) return ;
        
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        
        inorder(root);
        for(int i=0; i<al.size(); i++)
        {
            for(int j=i+1 ; j<al.size();j++)
            {
                int sum = al.get(i)+al.get(j);
                if(sum == k)
                {
                    return true;
                }
            }
        }
        return false;
    }
}