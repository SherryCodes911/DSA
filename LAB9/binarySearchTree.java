package LAB9;
//Binary Search Tree
public class BST {
    class Node{
        int value;
        Node left, right;

        Node(int value){
            this.value=value;
            this.left=this.right=null;
        }
    }
    Node root;
    BST() {
        this.root = null;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null)return;

        inOrder(root.left);
        System.out.println(root.value+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value+ " ");

    }
    public Node insert(Node root, int value) {
        if (root==null) {
            return new Node(value);
        }
        if (value<root.value) {
            root.left=insert(root.left, value);
        }
        else if (value>root.value) {
            root.right=insert(root.right, value);
        }
        return root;
    }
    public int countNodes(Node current) {
        if (current ==null){
            return 0;
        }
        return 1+countNodes(current.left)+countNodes(current.right);
    }
    /*public Node search(Node root, int value){
        if (root==null || root.value==value){
            return root;
        }
        if(value<root.value){
            return search(root.left,value);
        }
        else if(value>root.value){
            return search(root.right,value);
        }
        return null;
    }*/
    public Node search(Node root, int value){
        if(root==null || root.value==value){
            return root;
        }
        if(value<root.value){
            return search(root.left, value);
        }
        else if(value>root.value){
            return search(root.right, value);
        }
        return null;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(bst.root, 50);
        bst.insert(bst.root,30);
        bst.insert(bst.root,70);
        bst.insert(bst.root,20);
        bst.insert(bst.root,40);
        bst.insert(bst.root,60);
        bst.insert(bst.root,80);

        inOrder(bst.root);

        System.out.println("Total nodes: " + bst.countNodes(bst.root));
/*
        int key=40;
        Node found=bst.search(bst.root,40);
        if(found!=null){
            System.out.println("found");
        }
        else System.out.println("not found");*/
        Node found= bst.search(bst.root, 8);
        if(found!=null){
            System.out.println("found");
        }
        else System.out.println("not found");

        /*preOrder(bst.root);

        System.out.println(" ");

        inOrder(bst.root);

        System.out.println(" ");

        postOrder(bst.root);*/
    }
}
