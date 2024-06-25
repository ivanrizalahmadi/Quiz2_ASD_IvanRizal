import java.util.ArrayList;
import java.util.Scanner;

public class PegawaiManager_13 {
    private ArrayList<Pegawai_13> pegawaiList;

    public PegawaiManager_13() {
        pegawaiList = new ArrayList<>();
        // Menambahkan data awal
        pegawaiList.add(new Pegawai_13("1121", "Rohman", "01-01-2004"));
        pegawaiList.add(new Pegawai_13("1234", "Malik", "02-02-2005"));
        pegawaiList.add(new Pegawai_13("5436", "Icam", "03-03-2004"));
        pegawaiList.add(new Pegawai_13("7684", "Dzulfikar", "04-04-2004"));
    }

    public void tambahPegawai(Pegawai_13 pegawai) {
        pegawaiList.add(pegawai);
        System.out.println("Pegawai berhasil ditambahkan!");
    }

    public void hapusPegawai(String idPegawai) {
        boolean found = false;
        for (Pegawai_13 pegawai : pegawaiList) {
            if (pegawai.getIdPegawai().equals(idPegawai)) {
                pegawaiList.remove(pegawai);
                System.out.println("Pegawai berhasil dihapus!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Pegawai dengan ID " + idPegawai + " tidak ditemukan.");
        }
    }

    public void aksesPegawai(String idPegawai) {
        for (Pegawai_13 pegawai : pegawaiList) {
            if (pegawai.getIdPegawai().equals(idPegawai)) {
                System.out.println(pegawai);
                return;
            }
        }
        System.out.println("Pegawai dengan ID " + idPegawai + " tidak ditemukan.");
    }

    public void cetakSemuaPegawai() {
        for (Pegawai_13 pegawai : pegawaiList) {
            System.out.println(pegawai);
        }
    }

    public static void main(String[] args) {
        PegawaiManager_13 manager = new PegawaiManager_13();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Pegawai");
            System.out.println("2. Hapus Pegawai");
            System.out.println("3. Akses Pegawai");
            System.out.println("4. Cetak Semua Pegawai");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Pegawai: ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama Pegawai: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Lahir Pegawai: ");
                    String tglLahir = scanner.nextLine();
                    Pegawai_13 pegawai = new Pegawai_13(id, nama, tglLahir);
                    manager.tambahPegawai(pegawai);
                    break;
                case 2:
                    System.out.print("Masukkan ID Pegawai yang akan dihapus: ");
                    String idHapus = scanner.nextLine();
                    manager.hapusPegawai(idHapus);
                    break;
                case 3:
                    System.out.print("Masukkan ID Pegawai yang akan diakses: ");
                    String idAkses = scanner.nextLine();
                    manager.aksesPegawai(idAkses);
                    break;
                case 4:
                    manager.cetakSemuaPegawai();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
