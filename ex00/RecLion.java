package ex00;

public class RecLion {
    public static void main(String[] args) {
        print(0);
    }

    static void print(int n){
        if (n < 10) {
            System.out.println("Hello Baby Lion 0" + n);
            print(n + 1);
        }
        if(n==10)
            System.out.println("Hello Baby Lion " + n);

    }
}


