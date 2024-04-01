package lab04;

public class JPA405 {
    public static void main(String[] args) {
        
 
    String[] a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] b = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }

        System.out.print("反轉陣列資料之前: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
            if (i < a.length - 1) {
            
            }
        }
        System.out.print("\n");
        System.out.print("反轉陣列資料之後: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(" "+b[i]);
            if (i < b.length - 1) {
            
            }
        }
        
    }
}
