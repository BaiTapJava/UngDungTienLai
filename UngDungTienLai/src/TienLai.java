import java.util.Scanner;

public class TienLai {

    public static void main(String[] args) {
        System.out.println("---- Tinh Lai Suat ----");

        double tien = 1.0;
        int thang = 1;
        double  instert_rate = 1.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("So tien cho vay: ");
        tien = scanner.nextDouble();


        System.out.println("Nhap vao so thang: ");
        thang = scanner.nextInt();

        System.out.println("Nhap lai suat hang thang");
        instert_rate = scanner.nextDouble();


        double tongTien = 0;

        for (int i =0 ; i < thang;  i++) {
            tongTien = tien * (instert_rate/100)/12 * thang;
        }

        System.out.println("Tong Tien phai tra : " + tongTien);

    }
}
