package ex00;

public class RecLion {
    public static void helloRecursion(int count){
        if (count == 11) return ;
        if( count < 10 ) System.out.println("Hello Baby Lion "+"0"+count);
        else System.out.println("Hello Baby Lion "+ count);
        helloRecursion(count+1);
    }
    public static void main(String[] args) {
        helloRecursion(0);
    }
}
