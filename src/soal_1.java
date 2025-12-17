// 12S25053 - Mikhael Harianja
// 12S25031 - Miransya Siagian
import java.util.*;
import java.lang.Math;

public class soal_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double total, ratarata;
        int n, i, tertinggi, terendah, four;

        n = Integer.parseInt(input.nextLine());
        while (n > 20) {
            n = Integer.parseInt(input.nextLine());
        }
        int[] rating = new int[n];

        total = 0;
        for (i = 0; i <= n - 1; i++) {
            rating[i] = Integer.parseInt(input.nextLine());
            if (rating[i] > 5 || rating[i] < 1) {
                i = i - 1;
                System.out.println("INVALID");
            } else {
                total = rating[i] + total;
            }
        }
        ratarata = total / n;
        tertinggi = -9999999999;
        terendah = 9999999;
        four = 0;
        for (i = 0; i <= n - 1; i++) {
            if (rating[i] > tertinggi) {
                tertinggi = rating[i];
            }
            if (rating[i] < terendah) {
                terendah = rating[i];
            }
            if (rating[i] >= 4) {
                four = four + 1;
            }
        }
        String kategori;

        if (ratarata < 3) {
            kategori = "Kantin perlu evaluasi manajemen!";
        } else {
            if (ratarata >= 3 && ratarata < 4) {
                kategori = "Kondisi cukup, masih perlu peningkatan.";
            } else {
                kategori = "Kantin dalam kondisi baik.";
            }
        }
        System.out.println("Daftar rating");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(rating[i]);
        }
        System.out.println("Rata-rata : " + ratarata);
        System.out.println("Tertinggi: " + tertinggi);
        System.out.println("Terendah: " + terendah);
        System.out.println("Reviewer rating >=4: " + four + " orang");
        System.out.println(kategori);
    }
}
