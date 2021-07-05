import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhap nam kiem tra");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        boolean isYear4 = year%4==0;
        if (isYear4){
            boolean isYear100 = year%100==0;
            if (isYear100){
                boolean isYear400 = year%400==0;
                if(isYear400){
                   isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if (isLeapYear){
            System.out.println("Nam nhuan");
        } else {
            System.out.println("Ko phai nam nhuan");
        }
    }
}
