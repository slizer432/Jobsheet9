import java.util.Scanner;
public class arrayRataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int lulus = 0;
        int jumlahlulus = 0;
        double rataLulus = 0;
        int tidakLulus = 0;
        int jumlahTidakLulus = 0;
        double rataTidakLulus = 0;
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jumlahlulus += nilaiMhs[i];
                lulus++;
            }
            else
            jumlahTidakLulus += nilaiMhs[i];
            tidakLulus++;
        }
        rata2 = total/nilaiMhs.length;
        rataLulus = jumlahlulus / lulus;
        rataTidakLulus = jumlahTidakLulus / tidakLulus;
        System.out.println("Jumlah mahasiswa lulus = "+lulus);
        System.out.println("Jumlah mahasiswa tidak lulus = "+tidakLulus);
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rataTidakLulus);
    }
}
