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
        } else {
            Node node = root;
            while (true) {
                if (data < node.data) {
                    if (node.left == null) {
                        node.left = new Node(data);
                        node.left.parent = node;
                        break;
                    } else {
                        node = node.left;
                    }
                } else {
                    if (node.right == null) {
                        node.right = new Node(data);
                        node.right.parent = node;
                        break;
                    } else {
                        node = node.right;
                    }
                }
            }
        }
    }

    // 삭제 메서드
    public void delete(int data) {
        Node node = search(data);

        if (node == null) {
            throw new IllegalArgumentException();
        }

        if (node.left == null && node.right == null) {
            if (node == root) {
                root = null;
            } else if (node.parent.left == node) {
                node.parent.left = null;
            } else {
                node.parent.right = null;
            }
        } else if (node.left != null && node.right != null) {
            Node minNode = node.right;
            while (minNode.left != null) {
                minNode = minNode.left;
            }
            node.data = minNode.data;
            if (minNode.parent.left == minNode) {
                minNode.parent.left = minNode.right;
                if (minNode.right != null) {
                    minNode.right.parent = minNode.parent;
                }
            } else {
                minNode.parent.right = minNode.right;
                if (minNode.right != null) {
                    minNode.right.parent = minNode.parent;
                }
            }
        } else {
            Node child = node.left != null ? node.left : node.right;
            child.parent = node.parent;
            if (node == root) {
                root = child;
            } else if (node.parent.left == node) {
                node.parent.left = child;
            } else {
                node.parent.right = child;
            }
        }
    }

    // 전체 노드 출력 메서드
    public void print() {
        print(root);
        System.out.println();
    }

    private void print(Node node) {
        if (node != null) {
            print(node.left);
            System.out.print(node.data + " ");
            print(node.right);
        }
    }

    private Node search(int data) {
        Node node = root;
        while (node != null) {
            if (data == node.data) {
                return node;
            } else if (data < node.data) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return null;
    }
        public static void main(String[] args) {
            LikeTree tree = new LikeTree();

            // Insert test
            tree.insert(5);
            tree.insert(3);
            tree.insert(7);
            tree.insert(1);
            tree.insert(4);
            tree.insert(6);
            tree.insert(8);
            tree.print();

            // Delete test
            tree.delete(5);
            tree.print();

            // Search test
            System.out.println(tree.search(3));
            System.out.println(tree.search(5));
        }



}
