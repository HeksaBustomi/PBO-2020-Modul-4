package View_07186;
import Entity_07186.Heksa07186_Roda2;
import Entity_07186.Heksa07186_Roda4;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Heksa07186_View {
    String col2[] = {"no antrian","nama","alamat","nomor plat","merk kendaraan","warna"};
    String col4[] = {"no antrian","nama","alamat","nomor plat","merk kendaraan","warna"};
    JFrame view = new JFrame();
    JButton back;
    DefaultTableModel mod2= new DefaultTableModel(col2, 0);
    DefaultTableModel mod4 = new DefaultTableModel(col4, 0);
    JTable tabel2 = new JTable(mod2);
    JTable tabel4 = new JTable(mod4);
    JScrollPane scroll2 =new JScrollPane();
    JScrollPane scroll4 =new JScrollPane();
    JLabel data2,data4;
public Heksa07186_View(){
    lihat();
    scroll2.setViewportView(tabel2);
    scroll4.setViewportView(tabel4);
    scroll2.setBounds(30,45,650,200);
    tabel2.setModel(mod2);
    view.add(scroll2);
    scroll4.setBounds(30,280,650,200);
    tabel4.setModel(mod4);
    view.add(scroll4);
    view.setSize(720,600);
    view.setLayout(null);
    view.getContentPane().setBackground(Color.PINK);
    
    data2 = new JLabel("Data Roda 2");
    data2.setBounds(180,10,700,30);
    data2.setFont(new Font("Times New Roman",Font.BOLD,25));
    view.add(data2);  
    scroll2.setBounds(30,45,650,200);
    tabel2.setModel(mod2);
    view.add(scroll2);
    
    data4 = new JLabel("Data Roda 4");
    data4.setBounds(180,250,700,30);
    data4.setFont(new Font("Times New Roman",Font.BOLD,25));
    view.add(data4);  
    scroll4.setBounds(30,280,650,200);
    tabel4.setModel(mod4);
    view.add(scroll4);
    
    back = new JButton("Kembali");
    back.setBounds(30, 500, 150, 40);
    back.setBackground(Color.RED);
    view.add(back);
    
    view.setLocationRelativeTo(null);
    view.setVisible(true);
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    back.addActionListener(new ActionListener()
        {
            @Override
    public void actionPerformed (ActionEvent ae){
       Heksa07186_GUI kembalimenu = new Heksa07186_GUI();
       view.dispose();
    }
    });
   }

 public void lihat(){
         for(int i=0;i<Heksa07186_allobjctrl.Kendaraan.viewRoda2().size();i++){
            int no_antrian = Heksa07186_allobjctrl.Kendaraan.getRoda2().get(i).getNo_Antrian();
            String nama = Heksa07186_allobjctrl.Kendaraan.getRoda2().get(i).getNama();
            String alamat = Heksa07186_allobjctrl.Kendaraan.getRoda2().get(i).getAlamat();
            String merk2 = Heksa07186_allobjctrl.Kendaraan.getRoda2().get(i).setMerk2();
            int plat_nomor2 = Heksa07186_allobjctrl.Kendaraan.getRoda2().get(i).setPlat_Nomor2();
            String warna2 = Heksa07186_allobjctrl.Kendaraan.getRoda2().get(i).setWarna2();
            Object[] object2 = {no_antrian,nama,alamat,plat_nomor2,merk2,warna2};
            mod2.addRow(object2);
        }
        for(int b=0;b<Heksa07186_allobjctrl.Kendaraan.viewRoda4().size();b++){
            int no_antrian = Heksa07186_allobjctrl.Kendaraan.viewRoda4().get(b).getNo_Antrian();
            String nama = Heksa07186_allobjctrl.Kendaraan.viewRoda4().get(b).getNama();
            String alamat = Heksa07186_allobjctrl.Kendaraan.viewRoda4().get(b).getAlamat();
            String merk4 = Heksa07186_allobjctrl.Kendaraan.viewRoda4().get(b).setMerk4();
            int plat_nomor4 = Heksa07186_allobjctrl.Kendaraan.viewRoda4().get(b).setPlat_Nomor4();
            String warna4 = Heksa07186_allobjctrl.Kendaraan.viewRoda4().get(b).setWarna4();
            Object[] object4 = {no_antrian,nama,alamat,plat_nomor4,merk4,warna4};
            mod4.addRow(object4);
        }
    }
}
    
    
   
        
   

     
