package ex00;

public class RecLion {

    public static void main(String[] args) {
        printLion(10);
    }
    static void printLion(int i) {
        if(i==0) {
            System.out.println("Hello Baby Lion 0");
            return;}
        printLion(i-1);
        System.out.println("Hello Baby Lion "+i);

    }
}

