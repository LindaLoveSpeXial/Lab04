package lab04;
public class JPA404 {
    public static void main(String[] args) {
        int[] fib = new int[10]; 

        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int num : fib) {
            System.out.println(num);
        }
    }
}
