package View_07186;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Heksa07186_GUI {
    JFrame tampilan = new JFrame();
    JLabel judul;
    JButton Daftar2,Daftar4,LihatAntrian,Ambil,Update;    
    
public Heksa07186_GUI(){
    tampilan.setSize(700,510);
    tampilan.setLayout(null);
    tampilan.getContentPane().setBackground(Color.PINK);
    judul = new JLabel("Atreon Car Wash");
    judul.setBounds(180, 10, 600, 50);
    judul.setFont(new Font("Times New Roman",Font.BOLD,40));
    tampilan.add(judul);
    tampilan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tampilan. setVisible(true);
    tampilan.setLocationRelativeTo(null);
    Daftar2 = new JButton("Daftar Roda 2");
    Daftar2.setBounds (250, 100, 180, 40);
    Daftar2.setBackground(Color.ORANGE);
    tampilan.add(Daftar2);
    Daftar4 = new JButton("Daftar Roda 4");
    Daftar4.setBounds (250, 170, 180, 40);
    Daftar4.setBackground(Color.ORANGE);
    tampilan.add(Daftar4);
    LihatAntrian= new JButton("Lihat Antrian");
    LihatAntrian.setBounds (250, 240, 180, 40);
    LihatAntrian.setBackground(Color.ORANGE);
    tampilan.add(LihatAntrian);
    Ambil= new JButton("Ambil");
    Ambil.setBounds (250, 310, 180, 40);
    Ambil.setBackground(Color.ORANGE);
    tampilan.add(Ambil);
    Update= new JButton("Update");
    Update.setBounds (250, 380, 180, 40);
    Update.setBackground(Color.ORANGE);
    tampilan.add(Update);
    tampilan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tampilan. setVisible(true);
    tampilan.setLocationRelativeTo(null);
    Daftar2.addActionListener(new ActionListener()
    {
    @Override
    public void actionPerformed (ActionEvent ae){
       Heksa07186_DaftarRoda2 daftar2 = new Heksa07186_DaftarRoda2();
       tampilan.dispose();
    }
    }); 
    Daftar4.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        Heksa07186_DaftarRoda4 daftar4 = new Heksa07186_DaftarRoda4();
        tampilan.dispose();
        }
      });
    LihatAntrian.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        Heksa07186_View lihatdata = new Heksa07186_View();
        tampilan.dispose();
        }
      });
    Ambil.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        Heksa07186_Ambil ambildata = new Heksa07186_Ambil();
        tampilan.dispose();
        }
      });
    Update.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        Heksa07186_Update update = new Heksa07186_Update();
        tampilan.dispose();
        }
      });
}
}
  
