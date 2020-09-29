package enk;

public class c_1{
    private String nama, nim, noT;

    public c_1(String Nama, String Nim, String Not) {
        this.nama = Nama;
        this.nim = Nim;
        this.noT = Not;
    }

    public String getNama() {
        return this.nama;
    }

    public String setNama(String NAMA) {
        return this.nama = NAMA;
    }

    public String getNim() {
        return this.nim;
    }

    public String setNim(String NIM) {
        return this.nim = NIM;
    }

    public String getNoT() {
        return this.noT;
    }

    public String setNoT(String NoT) {
        return this.noT = NoT;
    }
}
