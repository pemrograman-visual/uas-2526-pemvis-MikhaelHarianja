import java.util.*;
import java.lang.Math;

public class soal_3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j, jumlahperangkat, daya, totalsiswa, totalkamar, totaldaya;
        String nama;

        n = Integer.parseInt(input.nextLine());
        totalkamar = 0;
        System.out.println("Total konsumsi: ");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            jumlahperangkat = Integer.parseInt(input.nextLine());
            totalsiswa = 0;
            for (j = 1; j <= jumlahperangkat; j++) {
                daya = Integer.parseInt(input.nextLine());
                if (daya < 0) {
                    System.out.println("INVALID");
                    j = j - 1;
                } else {
                    totalsiswa = totalsiswa + daya;
                }
            }
            System.out.println(nama + "=" + totalsiswa + "wh");
            totalkamar = totalkamar + totalsiswa;
        }
        System.out.println("");
        System.out.println("totalkonsumsikamar =" + totalkamar + "wh");
        if (totalkamar > 1200) {
            System.out.println("Konsumsi berlebihan.Kurangi penggunaan listrik!");
        } else {
            System.out.println("Konsumsi masih dalam batas wajar.");
        }
    }
}
