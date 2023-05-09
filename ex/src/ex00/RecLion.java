package ex00;

public class RecLion {
    public static void main(String[] args) {
        int n = 0;
        Lion(n);
    }

    public static void Lion(int n)
    {
        String hello = "Hello Baby Lion ";

        if (n == 11)
            return;
        System.out.printf("%s %02d\n", hello, n);
        Lion(n+1);
    }
}
