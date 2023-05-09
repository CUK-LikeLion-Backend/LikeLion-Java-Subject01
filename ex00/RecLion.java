package ex00;

public class RecLion {
    public static void HelloBaby(int n){

        if (n == 11){
            return;
        }
        else {
            System.out.printf("Hello Baby Lion %02d", n);
            System.out.printf("\n");
            HelloBaby(n+1);
        }
    }
    public static void main(String[] args) {
        HelloBaby(0);
    }
}


