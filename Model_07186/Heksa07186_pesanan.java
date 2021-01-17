package Model_07186;

import Entity_07186.Heksa07186_Roda2;
import Entity_07186.Heksa07186_Roda4;
import java.util.ArrayList;
import java.util.Scanner;

public class Heksa07186_pesanan implements Heksa07186_layanan{
    Scanner input = new Scanner(System.in);
    public ArrayList<Heksa07186_Roda2> Dataroda2;
    public ArrayList<Heksa07186_Roda4> Dataroda4;
     
    public Heksa07186_pesanan(){
          this.Dataroda2 = new ArrayList<>();
          this.Dataroda4 = new ArrayList<>();
     }
    public void insertRoda2(Heksa07186_Roda2 pesan){
        Dataroda2.add(pesan);
    }
     public void insertRoda4(Heksa07186_Roda4 pesan){
        Dataroda4.add(pesan);
     }
     public ArrayList<Heksa07186_Roda2>viewRoda2(){
        return Dataroda2;
    }
    public ArrayList<Heksa07186_Roda4>viewRoda4(){
        return Dataroda4;
    }
    public ArrayList<Heksa07186_Roda2> getarrRoda2(){
        return Dataroda2;
    }
    public ArrayList<Heksa07186_Roda4> getarrRoda4(){
        return Dataroda4;
    }
    
    @Override
    public void ambil(int no_antrian, String nama){
        for(int i=0;i<Dataroda2.size();i++){
            if(nama.equals(Dataroda2.get(i).getNama())&& no_antrian==(Dataroda2.get(i).getNo_Antrian())){
                Dataroda2.remove(i);
            }
           }
        for(int i=0;i<Dataroda4.size();i++){
            if(nama.equals(Dataroda4.get(i).getNama())&& no_antrian==(Dataroda4.get(i).getNo_Antrian())){
                Dataroda4.remove(i);
            }
         }
        }

    @Override
    public void update(String nama, String newnama, String alamat, String newalamat){
        for(int i=0;i<Dataroda2.size();i++){
            if(nama.equals(Dataroda2.get(i).getNama())&& alamat.equals(Dataroda2.get(i).getAlamat())){
                Dataroda2.get(i).setNama(newnama);
                Dataroda2.get(i).setAlamat(newalamat);
            }
            }
            for(int k=0;k<Dataroda4.size();k++){
                if(nama.equals(Dataroda4.get(k).getNama())&& alamat.equals(Dataroda4.get(k).getAlamat())){
                    Dataroda4.get(k).setNama(newnama);
                    Dataroda4.get(k).setAlamat(newalamat);
                }  
            }
    
        
    }
    @Override
    public void view(){      
    }

   
   }
 

    
    
            
