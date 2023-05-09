package main.java.ex00;
public class RecLion {

    public static void printLion(int n){
        if(n == 10){
            System.out.println("Hello Baby Lion " + n);
            return;
        }
        System.out.println("Hello Baby Lion " + n);
        printLion(n + 1);
    }
    public static void main(String[] args) {
        printLion(0);
    }
}