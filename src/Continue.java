public class Continue {
    public static void main(String[] args) {

        for(int num = 1; num <= 100; num = num++ ){
            if(num % 2 ==0)
                continue;
            num++;
            System.out.println(num);
            num++;
        }
    }

}
