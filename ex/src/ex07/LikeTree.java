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
            } else if (data > current.data) {
                current = current.right;
            } else {
                // 이미 같은 값을 가진 노드가 존재하는 경우 삽입하지 않고 종료한다.
                return;
            }
        }

        // 새로운 노드를 생성하여 삽입한다.
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
        Node nodeToDelete = findNode(data); // 삭제 대상 노드 탐색
        if (nodeToDelete == null) {
            return; // 삭제 대상 노드가 없으면 종료
        }
        Node parent = nodeToDelete.parent;
        if (nodeToDelete.left == null && nodeToDelete.right == null) { // 자식이 없는 경우
            if (nodeToDelete == root) {
                root = null;
            } else if (nodeToDelete == parent.left) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (nodeToDelete.left == null || nodeToDelete.right == null) { // 자식이 하나인 경우
            Node child = nodeToDelete.left != null ? nodeToDelete.left : nodeToDelete.right;
            if (nodeToDelete == root) {
                root = child;
            } else if (nodeToDelete == parent.left) {
                parent.left = child;
            } else {
                parent.right = child;
            }
            child.parent = parent;
        } else { // 자식이 둘인 경우
            Node successor = findMinNode(nodeToDelete.right); // 후계자 탐색
            nodeToDelete.data = successor.data;
            delete(successor.data); // 후계자 노드 삭제
        }
    }

    // 이진 트리에서 특정 값을 갖는 노드를 찾아서 리턴하는 메소드
    private Node findNode(int data) {
        Node curr = root;
        while (curr != null) {
            if (curr.data == data) {
                return curr;
            } else if (curr.data > data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return null; // 찾지 못한 경우
    }

    // 이진 트리에서 가장 작은 값을 갖는 노드를 찾아서 리턴하는 메소드
    private Node findMinNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    // 전체 노드 출력 메서드(중위순회, 왼나오)
    public void print() {
        printNode(root);
        System.out.println();
    }

    private void printNode(Node node) {
        if (node != null) {
            printNode(node.left);
            System.out.print(node.data + " ");
            printNode(node.right);
        }
    }
    public static void main(String[] args) {

    }
}
