package lab04;
import java.util.Scanner;
public class JPA401 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("請輸入十個整數:");
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++){
            System.out.printf("第%d個整數:",i+1);
            n[i] =a.nextInt();
        }
        int x=0;
        int y=0;
        for (int nember : n) {
            if (nember > 60) {
                x+=1;
                y+=nember;
            }
        }
        double z = (double)y / x;
        System.out.println("陣列中大於60的有"+x+"個");
        System.out.println("總和為"+y);
        System.out.printf("平均值為%.4f",z);
    a.close();    
    }
}
