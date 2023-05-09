package ex00;

public class RecLion {
    public static void printLion (int num) {
        if (num < 10) {
            System.out.printf("Hello Baby Lion 0%d\n", num);
            printLion(num+1);
        }
        else if (num == 10) {
            System.out.printf("Hello Baby Lion %d\n", num);
        }
    }
    public static void main(String[] args) {
        printLion(0);
    }
}
