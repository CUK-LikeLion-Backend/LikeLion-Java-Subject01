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
        public String toString() {
            return Integer.toString(data);
        }
        // 삽입 메서드
        public void insert(int data) {
            Node newNode = new Node(data);
            if (root == null)
                root = newNode;
            else {
                Node x = root;
                while (x != null) {
                    if (newNode.data > x.data) {
                        if (x.right == null) {
                            x.right = newNode;
                            newNode.parent = x;
                            return;
                        }
                        x = x.right;
                    } else {
                        if (x.left == null) {
                            x.left = newNode;
                            newNode.parent = x;
                            return;
                        }
                        x = x.left;
                    }
                }
            }
        }
    }
    private Node search(Node node, int data) {
        if (node == null || node.data == data) {
            return node;
        } else if (data > node.data) {
            return search(node.right, data);
        } else {
            return search(node.left, data);
        }
    }

    // 삭제 메서드
    // 삭제 메서드
    public void delete(int data) {
        root = deleteNode(root, data);
    }

    // 노드 삭제 메서드
    private Node deleteNode(Node node, int data) {
        if (node == null) {
            return node;
        }
        if (data < node.data) {
            node.left = deleteNode(node.left, data);
        } else if (data > node.data) {
            node.right = deleteNode(node.right, data);
        } else {
            // 삭제할 노드가 단말 노드인 경우
            if (node.left == null && node.right == null) {
                return null;
            }
            // 자식이 하나인 경우
            else if (node.left == null || node.right == null) {
                Node child = node.left != null ? node.left : node.right;
                child.parent = node.parent;
                return child;
            }
            // 자식이 둘인 경우
            else {
                Node minNode = getMinNode(node.right);
                node.data = minNode.data;
                node.right = deleteNode(node.right, minNode.data);
            }
        }
        return node;
    }
    // 최소값을 가진 노드 찾기
    private Node getMinNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // 전체 노드 출력 메서드
    public void print() {
        printPreorder(root);
    }
    private void printPreorder(Node node) {
        if (node != null) {
            System.out.println(node.data + " ");
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }

    public static void main(String[] args) {
        LikeTree t = new LikeTree();
        t.root = t.new Node(5);
        t.root.insert(3);
        t.root.insert(7);
        t.root.insert(1);
        t.root.insert(4);
        t.delete(4);
        t.delete(5);
        t.print();

    }
}
