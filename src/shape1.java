import java.util.Scanner;
public class shape1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter  the no. to which length");
        int n = obj.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}