package Controller_07186;
import java.util.ArrayList;
import Entity_07186.Heksa07186_Roda2;
import Entity_07186.Heksa07186_Roda4;
import Model_07186.Heksa07186_pesanan;

public class Heksa07186_AdminController {
    static Heksa07186_pesanan DataCuci = new Heksa07186_pesanan(); 
 
    public void insertRoda2(Heksa07186_Roda2 pesan){
       DataCuci.insertRoda2(pesan);  
    }
    public void insertRoda4(Heksa07186_Roda4 pesan){
       DataCuci.insertRoda4(pesan);
    }
    public void ambil (int no_antrian,String nama){
       DataCuci.ambil(no_antrian,nama); 
    }
    public void update (String nama,String newnama,String alamat,String newalamat){
        DataCuci.update(nama,newnama,alamat,newalamat);
    }
    public void view(){
        DataCuci.view();
    }
    public ArrayList<Heksa07186_Roda2>viewRoda2(){
        return DataCuci.Dataroda2;
    }
    public ArrayList<Heksa07186_Roda4>viewRoda4(){
        return DataCuci.Dataroda4;
    }
    public ArrayList<Heksa07186_Roda2> getRoda2(){
       return DataCuci.getarrRoda2();
    }
    public ArrayList<Heksa07186_Roda4> getRoda4(){
       return DataCuci.getarrRoda4();
    }    

}


