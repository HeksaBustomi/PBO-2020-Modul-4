package Entity_07186;

public class Heksa07186_Roda2 extends Heksa07186_DataCustomer {
    private String nama,alamat,no_antrian;
    private String Merk2;
    private int Plat_Nomor2;
    private String Warna2;
    
     public Heksa07186_Roda2(int no_antrian, String nama, String alamat, int plat_nomor2, String merk2, String warna2) {
        super(nama, alamat, no_antrian);
        this.Merk2 = merk2;
        this.Plat_Nomor2 = plat_nomor2;
        this.Warna2 = warna2;
    }

    public String setMerk2() {
        return this.Merk2;
    }

    public int setPlat_Nomor2() {
        return this.Plat_Nomor2;
    }

    public String setWarna2() {
        return this.Warna2;
    }
  }
   

  
