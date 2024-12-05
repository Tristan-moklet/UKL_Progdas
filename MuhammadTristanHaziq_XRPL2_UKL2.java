import java.util.Scanner;
import java.util.Random;

public class MuhammadTristanHaziq_XRPL2_UKL2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String oprtr = null;
        double question = 0;

        // ==============
        // Soal 3 Sedang
        // ==============

        System.out.println("Buat Soal? (y/n)");
        String yn = input.next();

        do {

            int num1 = random.nextInt(100) + 1;
            int operator = random.nextInt(5);
            int num2 = random.nextInt(100) + 1;

            switch (operator) {
                case 1:

                    oprtr = "+";
                    question = num1 + num2;

                    break;

                case 2:

                    oprtr = "-";
                    question = num1 - num2;

                    break;

                case 3:

                    oprtr = "*";
                    question = num1 * num2;

                    break;

                case 4:

                    oprtr = "/";
                    question = num1 / num2;

                    break;

                case 5:

                    oprtr = "%";
                    question = num1 % num2;

                    break;

            }

            System.out.println("Kerjakan soal berikut : " + num1 + " " + oprtr + " " + num2);
            System.out.print("Jawaban anda : ");
            double answer = input.nextDouble();

            if (answer == question) {
                System.out.println("Jawaban anda benar!");
            } else {
                System.out.println("Jawaban anda salah, jawban yang benar adalah " + question);
            }

            System.out.println("Buat soal lagi? (y/n)");
            yn = input.next();

        } while (yn.equalsIgnoreCase("y"));

        input.close();
    }
}
