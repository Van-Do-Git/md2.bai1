import java.util.Scanner;

public class DateinMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang ban muon tinh so ngay");
        int month = sc.nextInt();
        String result;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 day";
                break;
            case 2:
                result = "28 or 29 day";
                break;
            default:
                result = "30 day";
        }
        System.out.println(result);
    }
}
