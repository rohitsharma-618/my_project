import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int Temprature = sc.nextInt();

        if(Temprature <= 0){
            System.out.println("Cold");
        } else if (Temprature >0 && Temprature < 15)
        {
            System.out.println("Normal");
        }
        else if ( Temprature > 15){
            System.out.println("Hot");
        }
    }

}

