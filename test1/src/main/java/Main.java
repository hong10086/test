import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        findRepeatedDnaSequences("AAAAAAAAAAA");





    }

    public void solve(char[][] board) {
        Set<Main > zeroList=new HashSet<>();
        for (int i = 0;i  <board[0].length ; i++) {
            if (board[0][i]=='O'){
                zeroList.add()
            }
        }
        
        
        
        

    }















    public List<String> binaryTreePaths(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        } else if (root.left==null&&root.right==null){
            List<String> allList=new ArrayList<>();
            allList.add(root.val+"");
            return allList;
        }else{
            List<String> leftList=    binaryTreePaths(root.left);
            List<String> rightList=   binaryTreePaths(root.right);
            List<String> allList=new ArrayList<>(leftList.size()+rightList.size());
            for (String s:leftList) {
                allList.add(root.val+"->"+s);
            }
            for (String s:rightList) {
                allList.add(root.val+"->"+s);
            }
            return allList;

        }

    }

//    public List<> binaryTreePaths(TreeNode root) {
//
//        List<String> leftList=    binaryTreePaths(root.left);
//        List<String> rightList=   binaryTreePaths(root.right);
//        leftList.addAll(rightList);
//
//        for (String ) {
//
//        }
//
//
//
//
//
//    }




}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}