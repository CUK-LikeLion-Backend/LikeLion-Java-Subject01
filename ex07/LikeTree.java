package ex07;

public class LikeTree {
    private Node root;
    private class Node{
        int data;
        Node parent;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            parent = null;
            left = null;
            right = null;
        }


    }

    //삽입 메서드
    public void insert(int data){
        //새로운 노드 생성
        Node newNode = new Node(data);
        //만약 리프 노드가 null이면 -> 아직 트리 생성 x
        if(root == null){
            //루트 노드에 새로운 노드를 할당하고 리턴.
            root = newNode;
            return;
        }
        //현재 위치에 있는 노드
        Node now = root;

        //탐색 시작.
        while (true){
            //만약 현재 노드가 루트가 아니고, 현재 노드의 데이터가 데이터와 같다면 -> 동일한 데이터입니다 출력 후 종료
            if(now.data == data && now != root) {
                System.out.println("동일한 데이터입니다");
                break;
            }
            //만약 들어온 데이터가 현재 데이터보다 클 경우
            else if(data > now.data) {
                if(now.right == null){
                    //비어 있으면 새로운 노드를 삽입하고 종료
                    now.right = newNode;
                    return;
                }
                else {
                    //비어 있지 않으면 오른쪽 자식 노드로 계속 이동
                    now = now.right;

                }
            }
            //만약 들어온 데이터가 현재 데이터보다 작은 경우
            else if(data < now.data){
                if(now.left == null) {
                    now.left = newNode;
                    return;
                }
                else
                    now = now.left;

            }

        }
    }
    public void delete(int data){
        Node now = root;
        Node pre = now;
        boolean found = false;
        //탐색 시작
        while (now != null) {
            //만약 현재 데이터가 입력된 데이터보다 클 경우
            if (now.data > data) {
                //pre 노드에 now 노드를  저장
                pre = now;
                //now 노드를 왼쪽을 옮김
                now = now.left;

            }
            //만약 현재 데이터가 입력된 데이터보다 작을 경우
            else if (now.data < data) {
                //pre 노드에 now 노드를  저장
                pre = now;
                //now노드를 오른쪽으로 옮김.
                now = now.right;
            }
            //now.data == data 삭제할 데이터를 찾음
            else{
                found = true;
                //리프노드를 삭제할 경우
                if(now.right == null && now.left == null){
                    if(pre.left == now)
                        pre.left = null;
                    else if (pre.right == now)
                        pre.right = null;
                    //오른쪽 자식만 있는 경우
                }
                else if (now.right != null && now.left == null) {
                    if (pre.left == now) {
                        pre.left = now.right;
                    } else if (pre.right.data == data) {
                        pre.right = now.right;
                    }
                }
                    //왼쪽 자식만 있는 경우
                else if (now.right == null && now.left != null) {
                    if(pre.left == null) {
                        pre.left = now.left;
                    }
                    else if (pre.right == null) {
                        pre.right = now.left;
                    }
                }//자식이 모두 있는 경우 오른쪽 서브트리에서 가장 작은 노드 or 왼쪽 서브트리에서 가장 큰 노드
                else {
                   Node minNode = now.right;
                   Node minNodeParent = now;
                   while (minNode.left != null){
                       minNodeParent = minNode;
                       minNode = minNode.left;
                   }
                   //오른쪽 서브트리에서 가장 작은 노드를 now.data에 복사
                   now.data = minNode.data;
                   //만약 minNode가 삭제할 노드의 오른쪽과 같다면
                   if(minNode == now.right)
                       now.right = minNode.right;
                   else
                       minNodeParent.left = minNode.right;

                     }
                break;

                }
            }
        if(!found)
            System.out.println("찾는 노드가 없음");
        }

    public void print(){
        print(root);
    }
    public void print(Node n){
        if(n == null)
            return;

        print(n.left);
        System.out.print(n.data + " ");
        print(n.right);

    }

}
class Test{
    public static void main(String[] args) {
        LikeTree likeTree = new LikeTree();
        likeTree.insert(10);
        likeTree.insert(2);
        likeTree.insert(4);
        likeTree.insert(8);
        likeTree.insert(11);
        likeTree.insert(15);
//        likeTree.delete(10);
        likeTree.delete(10);
        likeTree.print();

    }

}
