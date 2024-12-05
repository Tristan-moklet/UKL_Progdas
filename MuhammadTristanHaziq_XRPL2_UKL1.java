import java.util.Scanner;

public class MuhammadTristanHaziq_XRPL2_UKL1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double hargaAkhir;
        String yn;

        // ==============
        // Soal 1 Mudah
        // ==============


        System.out.print("Masukkan total belanja anda : ");
        double totalBelanja = input.nextDouble();

        System.out.println("Apakah anda member di toko ini? (y/n)");
        yn = input.next();

        
        

        if (totalBelanja < 100000) {

            System.out.println("Berikut total belanja anda : Rp." + totalBelanja);

        } else if (totalBelanja < 200000 && yn.equalsIgnoreCase("y")) {

            System.out.println("Anda mendapatkan diskon sebesar 10%!");
            hargaAkhir = totalBelanja - (totalBelanja * 0.1);
            System.out.println("Harga akhir anda adalah : Rp." + hargaAkhir);

        } else if (totalBelanja > 200000 && yn.equalsIgnoreCase("y")) {

            System.out.println("Anda mendapatkan diskon sebesar 20%");
            hargaAkhir = totalBelanja - (totalBelanja * 0.2);
            System.out.println("Harga akhir anda adalah : Rp." + hargaAkhir);

        } else if (yn.equalsIgnoreCase("n")){
            System.out.println("Berikut total belanja anda : Rp." + totalBelanja);
        }


        

        input.close();

    }


}
