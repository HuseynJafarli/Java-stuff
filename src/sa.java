import java.util.Scanner;

public class sa {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        long b = scn.nextLong();
        float c = scn.nextFloat();
        double sum = a+b+c;
        System.out.printf("%2f" , sum);

    }
}
