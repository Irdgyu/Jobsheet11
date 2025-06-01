import java.util.Scanner;

public class MainTugas06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        QLLTugas06 antrian = new QLLTugas06();
        int pilih;

        do {
            System.out.println("\n=== Menu Antrian Mahasiswa ===");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input6.nextInt();
            input6.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input6.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input6.nextLine();
                    MhsTugas06 mhs = new MhsTugas06(nim, nama);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.printQueue();
                    break;
                case 6:
                    System.out.println("Jumlah Mahasiswa dalam antrian: " + antrian.count());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}
