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
        Node node = new Node(data);

        //아무것도 없을때
        if (root == null) {
            root = new Node(data);
            return;
        }
        Node currentNode = root;
        //Node parentNode = null;

        //있을때
            while (true){
                if (data < currentNode.data){ //currentNode보다 작으면
                    //currentNode = currentNode.left; //currentNode가 왼쪽 아래로 내려감

                    if (currentNode.left == null) { //내려갔는데 자식노드가 없다!!!
                        currentNode.left = new Node(data); //왼쪽에 데이터 저장
                        return;
                    }
                    currentNode = currentNode.left; //중간에 끼는게 안되므로 밑에 줄줄이 넣을 수 있도록 현재노드를 자식노드로 변경
                }
                else{ //currentNode보다 크면
                    //currentNode = currentNode.right; //currentNode가 오른쪽 아래로 내려감

                    if (currentNode.right == null) { //내려갔는데 자식노드가 없다!!!
                        currentNode.right = new Node(data); //오른쪽에 데이터 저장
                        return;
                    }
                    currentNode = currentNode.right;
            }
        }
    }

    private Node remove(Node root, int data) {
        Node node = new Node(data);
        Node currentNode = root;

        //안해주면 에러!!!!!! 꼭해주기!!!!
        if (root == null) {
            return null;
        }

        if (data == root.data) {
            //삭제할 노드가 단말노드인 경우
            if (root.left == null && root.right == null) {
                return null;
            }

            //삭제할 노드의 자식노드가 하나인 경우
            if (root.right == null) {
                return root.left;
            }

            if (root.left == null) {
                return root.right;
            }
            //삭제할 노드의 자식노드가 둘 다 있을 경우 (오른쪽 서브트리에서 가장 작은 노드 or 왼쪽서브트리에서 가장 큰 노드)
            int smallest = small(root.right);

            root.data = smallest; //오른쪽 서브트리에서 가장 작은 노드 올리기
            root.right = remove(root.right, smallest); //올렸으니까 값 삭제
            return root;
        }

        if (data < root.data) {
            root.left = remove(root.left, data);
            return root;
        }
        else{
        root.right = remove(root.right, data);
        return root;
        }
    }

    //오른쪽 노드에서 가장 작은 값을 올리기 위해 small구하기
    public int small(Node root){
        return root.left == null ? root.data : small(root.right);
    }

    // 삭제 메서드
    public void delete(int data) {
        remove(root, data);
    }

    // 전체 노드 출력 메서드
    public void print() {
        System.out.printf("전위순회 결과 : ");
        preorder(root);
    }

    //전위순회
    public void preorder(Node node){
        if (node!=null){
            System.out.printf("%d ", node.data); //루트노드
            if (node.left != null){
                preorder(node.left);
            }
            if (node.right != null) {
                preorder(node.right);
            }
        }
    }

    public static void main(String[] args) {
        LikeTree tree = new LikeTree();

        tree.insert(10);
        tree.insert(9);
        tree.insert(11);
        tree.insert(8);
        tree.insert(6);
        tree.insert(7);
        tree.insert(12);

        tree.remove(tree.root, 7);
        tree.remove(tree.root, 10);


        tree.print();
    }
}
