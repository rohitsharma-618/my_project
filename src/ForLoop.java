import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int num = 1; num < n; num = num*2){
            System.out.println(num);
        }
    }
}
