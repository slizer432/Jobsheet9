import java.util.Scanner;
public class tugas23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int jumlahElemen = sc.nextInt();

        int[] array = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int max = 0;
        int min = 0;
        int total = 0;

        for (int i = 1; i < jumlahElemen; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            total += array[i];
        }

        double rata2 = (double) total / jumlahElemen;

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + rata2);
    }
}
