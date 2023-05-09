package ex00;


public class RecLion {
    public static void main(String[] args) {
        printHelloBabyLion(1);
    }

    public static void printHelloBabyLion(int n) {
        if (n == 11)
            return;
        System.out.println("Hello Baby Lion " + String.format("%02d", n));
        printHelloBabyLion(n+1);

    }
}
