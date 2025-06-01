import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        SingleLinkedList06 sll = new SingleLinkedList06();

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlah = input6.nextInt();
        input6.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = input6.nextLine();
            System.out.print("Nama  : ");
            String nama = input6.nextLine();
            System.out.print("Kelas : ");
            String kelas = input6.nextLine();
            System.out.print("IPK   : ");
            double ipk = input6.nextDouble();
            input6.nextLine();

            Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        System.out.println();
        sll.print();
    }
}

