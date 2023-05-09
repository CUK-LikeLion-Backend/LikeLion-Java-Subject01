package 멋사재귀.ex00;

public class RecLion {

    public static void helloLion(int n){
        if(n==11){
            return;
        }
        System.out.println(String.format("Hello Baby Lion %02d", n));
        helloLion(n+1);
    }

    public static void main(String[] args) {
        helloLion(0);
    }
}