package 멋사재귀.ex07;

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

        if(root == null){
            root = newNode;
            System.out.println("루트에 " + data);
            return;
        }

        Node p = root;
        Node q=p;

        while(p!=null) {
            q = p;
            if (data > p.data) {
                p = p.right;
            } else if (data < p.data) {
                p = p.left;
            } else {
                System.out.println("이미 존재합니다");
                return;
            }
        }

        if(data > q.data){
            q.right = newNode;
            System.out.println("오른쪽삽입");
        }
        else{
            q.left = newNode;
            System.out.println("왼쪽삽입");
        }
    }

    // 삭제 메서드
    //루트 삭제 경우 구현 해야함
    //분지수 2인 경우 구현 해야함 : 왼쪽에서 제일 큰 노드 또는 오른쪽에서 제일 작은 노드로 대체 (어차피 리프노드일 것임)
    public void delete(int data) {
        Node p = root;
        Node q=p;

        while(p!= null) {
            if (data > p.data) {
                q = p;
                p = p.right;
            } else if (data < p.data) {
                q = p;
                p = p.left;
            } //삭제 데이터 찾은 경우
            else {
                System.out.println("찾았다" + p.data);
                //리프인 경우
                if(p.right==null && p.left==null){
                    if(q.data>p.data) {
                        System.out.println("이거지");
                        q.left = null;
                    }
                    else
                        q.right = null;
                }
                //자식이 하나 인 경우 자식을 올린다.
                else if (p.right == null||p.left == null){
                    if(q.data>p.data) {
                        if (p.right == null)
                            q.left = p.left;
                        else
                            q.left = p.right;
                    }
                    else{
                        if(p.right == null)
                            q.right = p.left;
                        else
                            q.right = p.right;
                    }
                }//자식이 두개 인 경우
                else{
                    System.out.println("자식이 두개");
                }
                break;
            }
        }
    }

    // 전체 노드 출력 메서드
    public void print() {
        Node p = root;

    }

    //debug로 눈으로 확인
    public static void main(String[] args) {
        LikeTree tree = new LikeTree();


        tree.insert(5);
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
//        tree.insert(9);
//        tree.insert(1);
//        tree.insert(2);
//        tree.insert(22);
//        tree.insert(3);

//        tree.delete(3);
        tree.delete(4);


        tree.print();

        System.out.println("완료");
    }
}
