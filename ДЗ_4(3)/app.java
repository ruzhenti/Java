
import java.util.Random;

public class app {

  public static void main(String[] args) {
    printTree(treeBalanceTree(9), "");
  }

  static void printTree(Node root, String sp) {
    if (root != null) {
      System.out.println(sp + root.value);
      printTree(root.left, sp + " ");
      printTree(root.right, sp + " ");
    }
  }

  static Node treeBalanceTree(int n) {
    Node node = null;
    if (n == 0) {
      return node;
    } else {
      int nl = n / 2;
      int nr = n - nl - 1;
      //System.out.print(n+" nl:"+nl+" nr:"+nr+"..");System.out.println("");
      node = new Node(new Random().nextInt(100));
      node.left = treeBalanceTree(nl);
      node.right = treeBalanceTree(nr);
    }
    return node;
  }
}

class Node {

  Node left;
  Node right;
  int value;

  public Node(int value) {
    this.value = value;
  }
}