package View_07186;
import Entity_07186.Heksa07186_Roda2;
import Entity_07186.Heksa07186_Roda4;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Heksa07186_DaftarRoda4 {
   JFrame TabelDaftar4 = new JFrame();
   JLabel daftar4;
   JTextField textnoantrian4,textnama4,textalamat4,textnomorplat4,textmerkkendaraan4,textwarna4;
   JLabel labelnoantrian4,labelnama4,labelalamat4,labelnomorplat4,labelmerkkendaraan4,labelwarna4;
   JButton Daftar,kembali;
   
   public Heksa07186_DaftarRoda4(){
    TabelDaftar4.setSize(650,600);
        TabelDaftar4.setLayout(null);
        TabelDaftar4.getContentPane().setBackground(Color.PINK);
        daftar4 = new JLabel("Atreon Data Roda 4");
        daftar4.setBounds(150, 10, 700, 40);
        daftar4.setFont(new Font("Times New Roman",Font.BOLD,40));
        TabelDaftar4.add(daftar4);
        labelnoantrian4 = new JLabel("No Antrian");
        labelnoantrian4.setBounds(100, 90, 180, 40);
        TabelDaftar4.add(labelnoantrian4);
        textnoantrian4 = new JTextField();
        textnoantrian4.setBounds (220, 100, 200, 30);
        TabelDaftar4.add(textnoantrian4);
        labelnama4 = new JLabel("Nama");
        labelnama4.setBounds(100, 140, 180, 40);
        TabelDaftar4.add(labelnama4);
        textnama4 = new JTextField();
        textnama4.setBounds (220, 150, 200, 30);
        TabelDaftar4.add(textnama4);
        labelalamat4= new JLabel("Alamat");
        labelalamat4.setBounds(100, 190, 180, 40);
        TabelDaftar4.add(labelalamat4);
        textalamat4 = new JTextField();
        textalamat4.setBounds (220, 200, 200, 30);
        TabelDaftar4.add(textalamat4);
        labelnomorplat4 = new JLabel("Nomor Plat");
        labelnomorplat4.setBounds(100, 240, 180, 40);
        TabelDaftar4.add(labelnomorplat4);
        textnomorplat4 = new JTextField();
        textnomorplat4.setBounds (220, 250, 200, 30);
        TabelDaftar4.add(textnomorplat4);
        labelmerkkendaraan4 = new JLabel("Merk Kendaraan");
        labelmerkkendaraan4.setBounds(100, 290, 180, 40);
        TabelDaftar4.add(labelmerkkendaraan4);
        textmerkkendaraan4 = new JTextField();
        textmerkkendaraan4.setBounds (220, 300, 200, 30);
        TabelDaftar4.add(textmerkkendaraan4);
        labelwarna4 = new JLabel("Warna");
        labelwarna4.setBounds(100, 340, 180, 40);
        TabelDaftar4.add(labelwarna4);
        textwarna4 = new JTextField();
        textwarna4.setBounds (220, 350, 200, 30);
        TabelDaftar4.add(textwarna4);
        Daftar = new JButton("Daftar");
    Daftar.setBounds(250,400,150,40);
    Daftar.setBackground(Color.GREEN);
    TabelDaftar4.add(Daftar);
    kembali = new JButton("Kembali");
    kembali.setBounds(250,460,150,40);
    kembali.setBackground(Color.red);
    TabelDaftar4.add(kembali);  
    TabelDaftar4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    TabelDaftar4. setVisible(true);
    TabelDaftar4.setLocationRelativeTo(null);
    kembali.addActionListener(new ActionListener()
    {
    @Override
    public void actionPerformed (ActionEvent ae){
       Heksa07186_GUI kembalimenu = new Heksa07186_GUI();
       TabelDaftar4.dispose();
    }
    });
        Daftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
            try{
            int no_antrian  = Integer.parseInt(textnoantrian4.getText());
            String nama = textnama4.getText();
            String alamat = textalamat4.getText();
            int plat_nomor4 = Integer.parseInt(textnomorplat4.getText());
            String merk4 = textmerkkendaraan4.getText();
            String warna4 = textwarna4.getText();
            Heksa07186_allobjctrl.Kendaraan.insertRoda4(new Heksa07186_Roda4(no_antrian,nama,alamat,plat_nomor4,merk4,warna4));        
            JOptionPane.showMessageDialog(null,"Daftar Berhasil","information",JOptionPane.INFORMATION_MESSAGE);
            kosongRoda4();         
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null,"Format Salah","Regristasi Gagal",JOptionPane.INFORMATION_MESSAGE);             
            }
          }
        });        
   }
    void kosongRoda4(){ 
        textnoantrian4.setText(null);
        textnama4.setText(null);
        textalamat4.setText(null);
        textnomorplat4.setText(null);
        textmerkkendaraan4.setText(null);
        textwarna4.setText(null);
        }
}
    
   

