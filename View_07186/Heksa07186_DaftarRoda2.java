package View_07186;
import Entity_07186.Heksa07186_Roda2;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Heksa07186_DaftarRoda2 {
   JFrame TabelDaftar2 = new JFrame();
   JLabel daftar2;
   JTextField textnoantrian2,textnama2,textalamat2,textnomorplat2,textmerkkendaraan2,textwarna2;
   JLabel labelnoantrian2,labelnama2,labelalamat2,labelnomorplat2,labelmerkkendaraan2,labelwarna2;
   JButton Daftar,kembali;   

public Heksa07186_DaftarRoda2(){
    TabelDaftar2.setSize(650,600);
    TabelDaftar2.setLayout(null);
    TabelDaftar2.getContentPane().setBackground(Color.PINK);
    daftar2 = new JLabel("Atreon Data Roda 2");
    daftar2.setBounds(150, 10, 700, 40);
    daftar2.setFont(new Font("Times New Roman",Font.BOLD,40));
    TabelDaftar2.add(daftar2);
    labelnoantrian2 = new JLabel("No Antrian");
    labelnoantrian2.setBounds(100, 90, 180, 40);
    TabelDaftar2.add(labelnoantrian2);
    textnoantrian2 = new JTextField();
    textnoantrian2.setBounds (220, 100, 200, 30);
    TabelDaftar2.add(textnoantrian2);
    labelnama2 = new JLabel("Nama");
    labelnama2.setBounds(100, 140, 180, 40);
    TabelDaftar2.add(labelnama2);
    textnama2 = new JTextField();
    textnama2.setBounds (220, 150, 200, 30);
    TabelDaftar2.add(textnama2);
    labelalamat2 = new JLabel("Alamat");
    labelalamat2.setBounds(100, 190, 180, 40);
    TabelDaftar2.add(labelalamat2);
    textalamat2 = new JTextField();
    textalamat2.setBounds (220, 200, 200, 30);
    TabelDaftar2.add(textalamat2);
    labelnomorplat2 = new JLabel("Nomor Plat");
    labelnomorplat2.setBounds(100, 240, 180, 40);
    TabelDaftar2.add(labelnomorplat2);
    textnomorplat2 = new JTextField();
    textnomorplat2.setBounds (220, 250, 200, 30);
    TabelDaftar2.add(textnomorplat2);
    labelmerkkendaraan2 = new JLabel("Merk Kendaraan");
    labelmerkkendaraan2.setBounds(100, 290, 180, 40);
    TabelDaftar2.add(labelmerkkendaraan2);
    textmerkkendaraan2 = new JTextField();
    textmerkkendaraan2.setBounds (220, 300, 200, 30);
    TabelDaftar2.add(textmerkkendaraan2);
    labelwarna2 = new JLabel("Warna");
    labelwarna2.setBounds(100, 340, 180, 40);
    TabelDaftar2.add(labelwarna2);
    textwarna2 = new JTextField();
    textwarna2.setBounds (220, 350, 200, 30);
    TabelDaftar2.add(textwarna2);
    Daftar = new JButton("Daftar");
    Daftar.setBounds(250,400,150,40);
    Daftar.setBackground(Color.GREEN);
    TabelDaftar2.add(Daftar);
    kembali = new JButton("Kembali");
    kembali.setBounds(250,460,150,40);
    kembali.setBackground(Color.RED);
    TabelDaftar2.add(kembali);
    TabelDaftar2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    TabelDaftar2. setVisible(true);
    TabelDaftar2.setLocationRelativeTo(null);
    kembali.addActionListener(new ActionListener()
    {
     @Override
     public void actionPerformed (ActionEvent ae){
     Heksa07186_GUI kembalimenu = new Heksa07186_GUI();
     TabelDaftar2.dispose();
    }
    });
        Daftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
            try{
            int no_antrian  = Integer.parseInt(textnoantrian2.getText());
            String nama = textnama2.getText();
            String alamat = textalamat2.getText();
            int plat_nomor2 = Integer.parseInt(textnomorplat2.getText());
            String merk2 = textmerkkendaraan2.getText();
            String warna2 = textwarna2.getText();
            Heksa07186_allobjctrl.Kendaraan.insertRoda2(new Heksa07186_Roda2(no_antrian,nama,alamat,plat_nomor2,merk2,warna2));        
            JOptionPane.showMessageDialog(null,"Daftar Berhasil","information",JOptionPane.INFORMATION_MESSAGE);
            kosongRoda2();         
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null,"Format Salah","Regristasi Gagal",JOptionPane.INFORMATION_MESSAGE);             
            }
          }
        });        
   }
    void kosongRoda2(){ 
        textnoantrian2.setText(null);
        textnama2.setText(null);
        textalamat2.setText(null);
        textnomorplat2.setText(null);
        textmerkkendaraan2.setText(null);
        textwarna2.setText(null);
        }
}
