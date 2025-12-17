import java.util.*;
import java.lang.Math;

public class soal_2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, stokawal, terjual, sisa;
        String status, nama;

        System.out.println("Nama ," + (char) 9 + "Stok Awal ," + (char) 9 + "Terjual ," + (char) 9 + "Sisa, " + (char) 9 + "Status, ");
        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            stokawal = Integer.parseInt(input.nextLine());
            terjual = Integer.parseInt(input.nextLine());
            while (stokawal < terjual) {
                System.out.println("INVALID");
                i = i - 1;
                if (stokawal < terjual) {
                    terjual = Integer.parseInt(input.nextLine());
                }
            }
            while (stokawal < 0) {
                System.out.println("INVALID");
                i = i - 1;
                if (stokawal < 0) {
                    stokawal = Integer.parseInt(input.nextLine());
                }
            }
            sisa = stokawal - terjual;
            if (sisa == 0) {
                status = "Habis, segera restock!";
            } else {
                if (sisa < 5) {
                    status = "Stok menipis ";
                } else {
                    status = "Stok aman ";
                }
            }
            System.out.println(nama + " " + (char) 9 + stokawal + " " + (char) 9 + (char) 9 + terjual + " " + (char) 9 + (char) 9 + sisa + " " + (char) 9 + status);
        }
    }
}
