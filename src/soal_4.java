import java.util.*;
import java.lang.Math;

public class soal_4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String minnama, nama, maxnama;
        int maxshift, totalshift, minshift, shift;
        double rata;

        totalshift = 0;
        int n, i;

        maxshift = -1;
        minshift = 999999999;
        n = Integer.parseInt(input.nextLine());
        System.out.println("daftar shift");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            shift = Integer.parseInt(input.nextLine());
            if (shift < 1) {
                System.out.println("INVALID");
                i = i - 1;
            } else {
                System.out.println(nama + "= " + shift);
                totalshift = totalshift + shift;
                if (shift > maxshift) {
                    maxshift = shift;
                    maxnama = nama;
                }
                if (shift < minshift) {
                    minshift = shift;
                    minnama = nama;
                }
            }
        }
        System.out.println("");
        rata = (double) totalshift / n;
        System.out.println("Total shift = " + totalshift);
        System.out.println("Rata-rata = " + rata);
        System.out.println("Shift terbanyak: " + maxnama + "(" + maxshift + ")");
        System.out.println("Shift tersedikit: " + minnama + "(" + minshift + ")");
        System.out.println("");
        if (maxshift - minshift > 3) {
            System.out.println("Distribusi shift tidak merata, beberapa asisten terbebani.");
        } else {
            System.out.println("Distribusi shift cukup merata.");
        }
    }
}
