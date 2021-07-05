import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        float width;
        float heigth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        width = sc.nextFloat();
        System.out.println("Enter heigth");
        heigth = sc.nextFloat();
        float are = width*heigth;
        System.out.println("Area =: "+are);
    }
}
