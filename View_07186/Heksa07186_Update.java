package View_07186;
import Entity_07186.Heksa07186_Roda2;
import Entity_07186.Heksa07186_Roda4;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Heksa07186_Update {
    JFrame update = new JFrame();
    JButton back,updatedata2,updatedata4;
    JLabel data2,data4,up2,up4,labelnama2,labelalamat2,labelnama4,labelalamat4,labelnamabaru2,labelalamatbaru2,labelnamabaru4,labelalamatbaru4;
    JTextField textnama2,textalamat2,textnama4,textalamat4,textnamabaru2,textalamatbaru2,textnamabaru4,textalamatbaru4;

    public Heksa07186_Update(){
    update.setSize(600,700);
    update.setLayout(null);
    update.getContentPane().setBackground(Color.PINK);
     
    up2 = new JLabel("Update Data Roda 2");
    up2.setBounds(180,10,700,40);
    up2.setFont(new Font("Times New Roman",Font.BOLD,25));
    update.add(up2);
    labelnama2 = new JLabel("Masukkan Nama Lama :");
    labelnama2.setBounds(180,40,180,40);
    update.add(labelnama2);
    textnama2 = new JTextField();
    textnama2.setBounds(180,70,200,20);
    update.add(textnama2);  
    labelalamat2 = new JLabel("Masukkan Alamat Lama :");
    labelalamat2.setBounds(180,80,180,40);
    update.add(labelalamat2);
    textalamat2 = new JTextField();
    textalamat2.setBounds(180,110,200,20);
    update.add(textalamat2);
    labelnamabaru2 = new JLabel("Masukkan Nama Baru :");
    labelnamabaru2.setBounds(180,130,180,40);
    update.add(labelnamabaru2);
    textnamabaru2 = new JTextField();
    textnamabaru2.setBounds(180,160,200,20);
    update.add(textnamabaru2);
    labelalamatbaru2 = new JLabel("Masukkan Alamat Baru :");
    labelalamatbaru2.setBounds(180,180,180,40);
    update.add(labelalamatbaru2);
    textalamatbaru2 = new JTextField();
    textalamatbaru2.setBounds(180,210,200,20);
    update.add(textalamatbaru2);
    
    updatedata2 = new JButton("update");
    updatedata2.setBounds(230, 240, 100, 40);
    updatedata2.setBackground(Color.GREEN);
    update.add(updatedata2); 
    
    up4 = new JLabel("Update Data Roda 4");
    up4.setBounds(180,300,700,40);
    up4.setFont(new Font("Times New Roman",Font.BOLD,25));
    update.add(up4);
    labelnama4 = new JLabel("Masukkan Nama Lama :");
    labelnama4.setBounds(180,330,180,40);
    update.add(labelnama4);
    textnama4 = new JTextField();
    textnama4.setBounds(180,360,200,20);
    update.add(textnama4);  
    labelalamat4 = new JLabel("Masukkan Alamat Lama :");
    labelalamat4.setBounds(180,370,180,40);
    update.add(labelalamat4);
    textalamat4 = new JTextField();
    textalamat4.setBounds(180,400,200,20);
    update.add(textalamat4);
    labelnamabaru4 = new JLabel("Masukkan Nama Baru :");
    labelnamabaru4.setBounds(180,410,180,40);
    update.add(labelnamabaru4);
    textnamabaru4 = new JTextField();
    textnamabaru4.setBounds(180,440,200,20);
    update.add(textnamabaru4);
    labelalamatbaru4 = new JLabel("Masukkan Alamat Baru :");
    labelalamatbaru4.setBounds(180,450,180,40);
    update.add(labelalamatbaru4);
    textalamatbaru4 = new JTextField();
    textalamatbaru4.setBounds(180,480,200,20);
    update.add(textalamatbaru4);
    
    updatedata4 = new JButton("update");
    updatedata4.setBounds(230, 510, 100, 40);
    updatedata4.setBackground(Color.GREEN);
    update.add(updatedata4);
    
    
    back = new JButton("Kembali");
    back.setBounds(30, 590, 100, 40);
    back.setBackground(Color.RED);
    update.add(back);
    
    update.setLocationRelativeTo(null);
    update.setVisible(true);
    update.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    back.addActionListener(new ActionListener()
        {
            @Override
    public void actionPerformed (ActionEvent ae){
       Heksa07186_GUI kembalimenu = new Heksa07186_GUI();
       update.dispose();
    }
    });
    updatedata2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed (ActionEvent ae){
            try{
                String nama = textnama2.getText();
                String newnama = textnamabaru2.getText();
                String alamat = textalamat2.getText();
                String newalamat = textalamatbaru2.getText();
                Heksa07186_allobjctrl.Kendaraan.update(nama,newnama,alamat,newalamat);
                JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null, "Data Salah", "Pengambilan Gagal",JOptionPane. INFORMATION_MESSAGE);
                
            }
             }
             });
    
    updatedata4.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed (ActionEvent ae){
            try{
                String nama = textnama4.getText();
                String newnama = textnamabaru4.getText();
                String alamat = textalamat4.getText();
                String newalamat = textalamatbaru4.getText();
                Heksa07186_allobjctrl.Kendaraan.update(nama,newnama,alamat,newalamat);
                JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null, "Data Salah", "Pengambilan Gagal",JOptionPane. INFORMATION_MESSAGE);
                
            }
             }
             });
   }
 }
    

