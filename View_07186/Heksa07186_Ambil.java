package View_07186;
import Entity_07186.Heksa07186_Roda2;
import Entity_07186.Heksa07186_Roda4;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Heksa07186_Ambil {
   JFrame ambildata = new JFrame();
   JLabel judulambil,ambil2,ambil4;
   JTextField textambilantrian2,textambilnama2,textambilantrian4,textambilnama4;
   JLabel labelambilantrian2,labelambilnama2,labelambilantrian4,labelambilnama4;
   JButton remove2,remove4,kembali;    
    
public Heksa07186_Ambil(){
   ambildata.setSize(800,500);
   ambildata.setLayout(null);
   ambildata.getContentPane().setBackground(Color.PINK);
   judulambil = new JLabel("Atreon Ambil Data");
   judulambil.setBounds(200, 10, 700, 40);
   judulambil.setFont(new Font("Times New Roman",Font.BOLD,40));
   ambildata.add(judulambil);
   ambil2 = new JLabel("Ambil Data Roda 2");
   ambil2.setBounds(100, 100, 700, 40);
   ambil2.setFont(new Font("Times New Roman",Font.BOLD,22));
   ambildata.add(ambil2);
   labelambilantrian2 = new JLabel("No Antrian :");
   labelambilantrian2.setBounds(100, 150, 180, 40);
   ambildata.add(labelambilantrian2);
   labelambilantrian2.setFont(new Font("Times New Roman",Font.BOLD,18));
   textambilantrian2 = new JTextField();
   textambilantrian2.setBounds (100, 190, 180, 30);
   ambildata.add(textambilantrian2);
   labelambilnama2 = new JLabel("Nama :");
   labelambilnama2.setBounds(100, 220, 180, 40);
   ambildata.add(labelambilnama2);
   labelambilnama2.setFont(new Font("Times New Roman",Font.BOLD,18));
   textambilnama2 = new JTextField();
   textambilnama2.setBounds (100, 250, 180, 30);
   ambildata.add(textambilnama2);
   remove2 = new JButton("Ambil");
   remove2.setBounds(140,300,100,40);
   remove2.setBackground(Color.GREEN);
   ambildata.add(remove2);
   ambil4 = new JLabel("Ambil Data Roda 4");
   ambil4.setBounds(500, 100, 700, 40);
   ambil4.setFont(new Font("Times New Roman",Font.BOLD,22));
   ambildata.add(ambil4);
   labelambilantrian4 = new JLabel("No Antrian :");
   labelambilantrian4.setBounds(500, 150, 180, 40);
   ambildata.add(labelambilantrian4);
   labelambilantrian4.setFont(new Font("Times New Roman",Font.BOLD,18));
   textambilantrian4 = new JTextField();
   textambilantrian4.setBounds (500, 190, 180, 30);
   ambildata.add(textambilantrian4);
   labelambilnama4 = new JLabel("Nama :");
   labelambilnama4.setBounds(500, 220, 180, 40);
   ambildata.add(labelambilnama4);
   labelambilnama4.setFont(new Font("Times New Roman",Font.BOLD,18));
   textambilnama4 = new JTextField();
   textambilnama4.setBounds (500, 250, 180, 30);
   ambildata.add(textambilnama4);
   remove4 = new JButton("Ambil");
   remove4.setBounds(540,300,100,40);
   remove4.setBackground(Color.GREEN);
   ambildata.add(remove4);
   kembali = new JButton("Kembali");
   kembali.setBounds(50,380,130,40);
   kembali.setBackground(Color.RED);
   ambildata.add(kembali);
   ambildata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   ambildata. setVisible(true);
   ambildata.setLocationRelativeTo(null);
   kembali.addActionListener(new ActionListener()
   {
    @Override
    public void actionPerformed (ActionEvent ae){
       Heksa07186_GUI kembalimenu = new Heksa07186_GUI();
       ambildata.dispose();
    }
    });
    remove2.addActionListener(new ActionListener(){      
    @Override
    public void actionPerformed (ActionEvent ae){
    try{
    int no_antrian  = Integer.parseInt(textambilantrian2.getText());
    String nama = textambilnama2.getText();
    Heksa07186_allobjctrl.Kendaraan.ambil(no_antrian,nama);
    JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
    Kosong();
    }catch(Exception exception) {
    JOptionPane.showMessageDialog(null, "Data Salah", "Pengambilan Gagal",JOptionPane. INFORMATION_MESSAGE);
    }
   }
  });
    remove4.addActionListener(new ActionListener(){      
    @Override
    public void actionPerformed (ActionEvent ae){
    try{
    int no_antrian  = Integer.parseInt(textambilantrian4.getText());
    String nama = textambilnama4.getText();
    Heksa07186_allobjctrl.Kendaraan.ambil(no_antrian,nama);
    JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
    Kosong();
    }catch(Exception exception) {
    JOptionPane.showMessageDialog(null, "Data Salah", "Pengambilan Gagal",JOptionPane. INFORMATION_MESSAGE);
    }
   }
  });
 }void Kosong(){
     textambilantrian2.setText(null);
     textambilnama2.setText(null);
     textambilantrian4.setText(null);
     textambilnama4.setText(null);
 }
}
