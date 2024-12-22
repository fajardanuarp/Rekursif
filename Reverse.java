public class Reverse {
    public static void printReverse(int n){
        if(n<1) {
            return;

        }else{
            System.out.print(n+" ");
            printReverse(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printReverse(n);
    }
}

