package ex01;

public class Factorial {
    public int fact(int n){
        if(n == 1 || n == 0) return 1;
        else
            return fact(n-1) * n;
    }

    public static void main(String[] args) {
        int result = 0;
        Factorial factorial = new Factorial();
        result = factorial.fact(5);
        System.out.println(result);
    }
}
