import java.util.Scanner;

public class TrueFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();

        String ans;
        ans = (num % 3 ==0 ) ? "True" : "False";
        System.out.println(ans);

    }
}
