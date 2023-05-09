package ex00;

public class RecLion {
    public static void main(String[] args) {
        int num=0;
        printLion(num);
    }

    public static void printLion(int num){
        if(num==11){return;}
        System.out.println("Hello Baby Lion "+String.format("%02d",num));
        printLion(num+1);
    }
}


