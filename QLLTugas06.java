public class QLLTugas06 {
    NodeTugas06 front, rear;
    int size = 0;
    final int MAX = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MAX;
    }

    public void enqueue(MhsTugas06 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambah.");
            return;
        }

        NodeTugas06 newNode = new NodeTugas06(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dipanggil.");
            return;
        }

        System.out.print("Mahasiswa yang dipanggil: ");
        front.data.tampilInformasi();
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            front.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terakhir: ");
            rear.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Mahasiswa dalam Antrian:");
        NodeTugas06 current = front;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
        System.out.println("Total antrian: " + size);
    }

    public int count() {
        return size;
    }
}

