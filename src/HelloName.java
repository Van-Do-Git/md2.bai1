import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        name = sc.nextLine();
        System.out.println("Xin chao: "+name);
    }
}
