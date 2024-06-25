public class Pegawai_13 {
    private String idPegawai;
    private String nama;
    private String tglLahir;

    // Konstruktor default
    public Pegawai_13() {
    }

    // Konstruktor berparameter
    public Pegawai_13(String idPegawai, String nama, String tglLahir) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.tglLahir = tglLahir;
    }

    // Getter dan Setter
    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String toString() {
        return "Pegawai{" +
                "idPegawai='" + idPegawai + '\'' +
                ", nama='" + nama + '\'' +
                ", tglLahir='" + tglLahir + '\'' +
                '}';
    }
}
