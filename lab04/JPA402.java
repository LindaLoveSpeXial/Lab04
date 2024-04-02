package lab04;
import java.util.Scanner;

public class JPA402 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("請輸入學生人數:");
        int b = a.nextInt();
        double[] n = new double[b];
        for (int i = 0; i < b; i++) {
            System.out.printf("第%d個學生成績:", i + 1);
            n[i] = a.nextDouble();
        }
        double x = 0;
        for (int i = 0; i < n.length; i++) {
            x += n[i];
        }
        double h=(float)x/b;
        System.out.printf("人數:%d\n", b);
        System.out.printf("總分:%.2f\n", x);
        System.out.printf("平均:%f",h);
    a.close();
    }
}
