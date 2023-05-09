package ex07;

public class LikeTree {

    private Node root;

    private class Node {
        int data;
        Node parent;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            parent = null;
            left = null;
            right = null;
        }
    }

    // 삽입 메서드
    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }

        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        Node newNode = new Node(data);
        newNode.parent = parent;

        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    // 삭제 메서드
    public void delete(int data) {
        Node target = search(data);

        if (target == null) {
            return;
        }

        if (target.left == null && target.right == null) {
            if (target == root) {
                root = null;
            } else if (target == target.parent.left) {
                target.parent.left = null;
            } else {
                target.parent.right = null;
            }
        } else if (target.left != null && target.right != null) {
            Node successor = findMin(target.right);
            target.data = successor.data;
            if (successor == successor.parent.left) {
                successor.parent.left = successor.right;
            } else {
                successor.parent.right = successor.right;
            }
            if (successor.right != null) {
                successor.right.parent = successor.parent;
            }
        } else {
            Node child = target.left != null ? target.left : target.right;
            child.parent = target.parent;
            if (target == root) {
                root = child;
            } else if (target == target.parent.left) {
                target.parent.left = child;
            } else {
                target.parent.right = child;
            }
        }
    }

    // 노드 탐색 메서드
    private Node search(int data) {
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                return current;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    // 최소값 탐색 메서드
    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // 전위 순회 메서드
    private void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // 전체 노드 출력 메서드
    public void print() {
        preorder(root);
        System.out.println();
    }


    public static void main(String[] args) {
        LikeTree tree = new LikeTree();

        // 값 삽입     tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(4);
        tree.insert(8);


        tree.print();


        tree.delete(7);


        tree.print();
    }
}