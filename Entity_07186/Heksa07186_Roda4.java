package Entity_07186;

public class Heksa07186_Roda4  extends Heksa07186_DataCustomer {
    private String nama,alamat,no_antrian;
    private String Merk4;
    private int Plat_Nomor4;
    private String Warna4;
    
    public Heksa07186_Roda4(int no_antrian, String nama, String alamat, int plat_nomor4, String merk4, String warna4) {
        super(nama, alamat, no_antrian);
        this.Merk4 = merk4;
        this.Plat_Nomor4 = plat_nomor4;
        this.Warna4 = warna4;
    }
    
    public String setMerk4() {
        return this.Merk4;
    }

    public int setPlat_Nomor4() {
        return this.Plat_Nomor4;
    }

    public String setWarna4() {
        return this.Warna4;
    }    
}
