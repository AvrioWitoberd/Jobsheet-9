import java.util.Scanner;

public class NilaiMahasiswa04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlah = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            total += nilaiMahasiswa[i];
        }
        System.out.println();

        double rataRata = (double) total / jumlah;

        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        
        for (int i = 1; i < jumlah; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        System.out.println("Semua nilai mahasiswa: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }

        System.out.println("--- Hasil Pengolahan Nilai ---");
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("------------------------------");
        

        

        sc.close();
    }
}
