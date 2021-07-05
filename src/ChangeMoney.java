import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        final float rate  =23000;
        float USD;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap USD");
        USD = sc.nextFloat();
        float VND = USD*rate;
        System.out.printf("So tien chuyen doi la %.2f VND", VND);
    }
}
