package ex00;

public class RecLion {
    public void Hello(int n){
        if(n <= 10){
            System.out.printf("Hello Baby Lion %02d\n", n);
            this.Hello(n+1);
        }
    }
    public static void main(String[] args) {
        RecLion recLion = new RecLion();
        recLion.Hello(0);
    }
}
