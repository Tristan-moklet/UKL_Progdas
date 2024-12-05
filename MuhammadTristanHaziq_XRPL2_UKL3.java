import java.util.Scanner;
import java.util.ArrayList;

public class MuhammadTristanHaziq_XRPL2_UKL3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> jmlHadir = new ArrayList<Integer>();

        // =============
        // Soal 1 Sulit
        // =============

        System.out.print("Berapa jumlah siswa yang akan anda data? ");
        Double jmlSiswa = input.nextDouble();

        System.out.println("");
        int jmlHari = 0;
        for (int i = 1; i <= jmlSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + i + " hadir: ");
            jmlHari = input.nextInt();
            jmlHadir.add(jmlHari);

        }

        int total = 0;
        for (int totalHadir : jmlHadir) {

            total += totalHadir;

        }

        System.out.println("");

        System.out.println("Rata - rata dari data jumlah hadir diatas adalah " + rataRata(total, jmlSiswa));

        System.out.println("Kesimpulan : ");

        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jmlHadir.size(); i++) {
            if (jmlHadir.get(i) > rataRata(total, jmlSiswa)) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + jmlHadir.get(i) + " hari)");
            }
        }

        System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jmlHadir.size(); i++) {
            if (jmlHadir.get(i) < rataRata(total, jmlSiswa)) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + jmlHadir.get(i) + " hari)");
            }
        }

        input.close();
    }

    public static Double rataRata(int total, Double jmlSiswa) {

        double rataRata = total / jmlSiswa;

        return rataRata;

    }
}
