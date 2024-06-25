import java.util.Scanner;

public class MainStack_13 {
    public static void main(String[] args) {
        StudentStack_13 studentStack = new StudentStack_13(10); // Misalkan kapasitas stack 10
        Scanner scanner = new Scanner(System.in);

        // Menambahkan data awal
        studentStack.push(new Student_13("234176000", "Ivan", "01-01-2000"));
        studentStack.push(new Student_13("234176010", "Boby", "02-02-2001"));
        studentStack.push(new Student_13("234176011", "Pandia", "03-03-2002"));
        studentStack.push(new Student_13("234176014", "Randa", "04-04-2003"));

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Teratas");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Lahir: ");
                    String birthDate = scanner.nextLine();
                    studentStack.push(new Student_13(nim, name, birthDate));
                    break;
                case 2:
                    Student_13 removedStudent = studentStack.pop();
                    if (removedStudent != null) {
                        System.out.println("Mahasiswa yang dihapus: " + removedStudent);
                    }
                    break;
                case 3:
                    Student_13 topStudent = studentStack.peek();
                    if (topStudent != null) {
                        System.out.println("Mahasiswa teratas: " + topStudent);
                    }
                    break;
                case 4:
                    studentStack.printAll();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 5);
    }
}
