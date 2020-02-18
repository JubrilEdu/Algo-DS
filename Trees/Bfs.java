package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    Node rootNode;

    public Bfs(){
        rootNode = null;
    }

    public static void main(String[] args) {
        Bfs bfs = new Bfs();
        bfs.setUpTree(bfs);
        bfs.transversePostOrder(bfs.rootNode);

    }

    public Node setUpTree(Bfs bfs){
        bfs.rootNode = new Node(1);
        bfs.rootNode.left = new Node(2);
        bfs.rootNode.right = new Node(3);
        bfs.rootNode.left.left = new Node(4);
        bfs.rootNode.left.right = new Node(5);
        return bfs.rootNode;
    }

    public void transversInOrder(Node root){
        if (root == null){
            return;
        }

        transversInOrder(root.left);
        System.out.println(root.data);
        transversInOrder(root.right);
    }

    public void transversePreOrder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        transversePreOrder(root.left);
        transversePreOrder(root.right);
    }

    public void transversePostOrder(Node root){
        Queue queue = new LinkedList();
        if (root == null){
            return;
        }
        transversePostOrder(root.left);
        transversePostOrder(root.right);
        System.out.println(root.data);
    }

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }
}
