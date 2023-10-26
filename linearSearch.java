import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hasil = 0;
        System.out.print("Masukkan jumlah elemen array: ");
        int[] arrayInt = new int[sc.nextInt()];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil != 0) {
            System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
        }else
        System.out.println("key tidak ditemukan");
    }
}
