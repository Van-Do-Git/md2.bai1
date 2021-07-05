import java.util.Scanner;

public class Ptb1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = sc.nextDouble();
        System.out.println("Nhap b");
        double b = sc.nextDouble();
        System.out.println("Nhap c");
        double c =sc.nextDouble();
        if (a!=0){
            double answer = (c-b)/a;
            System.out.printf("Phuong trinh co nghiem %f\n!",answer);
        } else if (b==0){
            System.out.printf("Phuowng trinh vo so nghiem");
        } else {
            System.out.printf("Phuong trinh vo nghiem");
        }
    }
}
