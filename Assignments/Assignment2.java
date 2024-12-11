package Assignments;

class Assignment2{
    class Node{
        int key;
        Node left,right;

        public Node(int item){
            key=item;
            left=null;
            right=null;
        }
    }
    private Node root;
    Assignment2(){
        root=null;
    }
    void deleteKey(int key){
        root=deleteRec(root, key);
    }
    Node deleteRec(Node root, int key) {
        if (root == null) return root;
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }
    int minValue(Node root) {
        int minv=root.key;
        while (root.left!=null) {
            minv=root.left.key;
            root=root.left;
        }
        return minv;
    }
}