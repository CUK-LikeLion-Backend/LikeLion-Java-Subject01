package main.java.ex00;

public class RecLion {
    public static void Call(int num){
        if(num<=10){
            System.out.println("Hello Baby Lion "+ String.format("%02d",num));
            Call(num+1);
        }
    }

    public static void main(String[] args) {
        Call(0);
    }
}
