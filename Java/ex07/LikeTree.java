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
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;

                if (data < current.data) {
                    current = current.left;

                    if (current == null) {
                        parent.left = newNode;
                        newNode.parent = parent;
                        return;
                    }
                } else {
                    current = current.right;

                    if (current == null) {
                        parent.right = newNode;
                        newNode.parent = parent;
                        return;
                    }
                }
            }
        }
    }

    // 삭제 메서드
    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
            return current;
        }

        current.right = deleteRecursive(current.right, data);
        return current;
    }

    private int findSmallestValue(Node current) {
        return current.left == null ? current.data : findSmallestValue(current.left);
    }

    // 전체 노드 출력 메서드
    public void print() {
        printRecursive(root);
    }

    private void printRecursive(Node current) {
        if (current == null) {
            return;
        }

        printRecursive(current.left);
        System.out.print(current.data + " ");
        printRecursive(current.right);
    }

    public static void main(String[] args) {
        LikeTree tree = new LikeTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.print();
        System.out.println();

        tree.delete(20);
        tree.delete(30);
        tree.delete(50);

        tree.print();
        System.out.println();
    }
}
/*
 이진 트리 : 모든 노드들의 자식 노드가 두 개 이하인 트리
 */