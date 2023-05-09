package ex00;
class Lion{
    int value;
    public void babyLion(int value){
        if(value>=0)
        {
            System.out.printf("Hello Baby Lion %02d",(10-value));
            System.out.println();
            babyLion(value-1);
        }
    }
}
public class RecLion {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.babyLion(10);
    }
}
