
public class Fibonacci{
    public static void fibo(int n, int a, int b){
        if(n == 1){
            return;
        }else{
            System.out.print(a+ " ");
            fibo(n-1,b,a+b);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        int b = 1;
        fibo(n,a,b);
    }
}