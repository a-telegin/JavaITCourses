package proc.dyn;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 26.01.13
 * Time: 2:53
 * To change this template use File | Settings | File Templates.
 */
public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
