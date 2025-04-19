package Tree;

import com.sun.source.tree.Tree;

import java.util.*;

public class RightViewOfTreeBFS {
    public static List<Integer> rightSideView(TreeNode root)
    {
        List<Integer> ans=new ArrayList<>();
        if(root == null)
            return ans;

        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);

        while(!que.isEmpty())
        {
            int n=que.size();
            for(int i=0;i<n;i++)
            {
                TreeNode curr=que.poll();
                if(i==n-1)
                {
                    ans.add(curr.val);
                }
                if(curr.left!=null)que.add(curr.left);
                if(curr.right!=null)que.add(curr.right);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        System.out.println(rightSideView(root));

    }
}

