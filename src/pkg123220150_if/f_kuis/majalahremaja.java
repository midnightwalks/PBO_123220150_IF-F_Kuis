package pkg123220150_if.f_kuis;

import Perhitungan.hitungmajalahremaja;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class majalahremaja extends JFrame implements ActionListener{
    JLabel judul = new JLabel("Halaman Pembelian");
    JLabel tagkategori = new JLabel("Kategori      Majalah Remaja");
    JLabel tagharga = new JLabel   ("Harga         Rp 15.200 /pcs");
    JLabel tagjumlah = new JLabel("Jumlah");
    JTextField inputjumlah = new JTextField();
    JButton tombolkembali = new JButton ("Kembali");
    JButton tombolbeli = new JButton ("Beli");
    
    JLabel judultransaksi = new JLabel();
    JLabel hargasatuan = new JLabel();
    JLabel tagoutputjumlah = new JLabel();
    JLabel totaltransaksi = new JLabel();
    
    
    majalahremaja(){
        setVisible(true);
        setSize(520, 480);
        setTitle("Majalah Remaja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setBounds(10, 10, 500, 24);
        judul.setFont(new Font("Arial", Font.BOLD, 20));
        
        add(tagkategori);
        tagkategori.setBounds(10, 35, 500, 24);
        tagkategori.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(tagharga);
        tagharga.setBounds(10, 70, 500, 24);
        tagharga.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(tagjumlah);
        tagjumlah.setBounds(10, 100, 500, 24);
        tagjumlah.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(inputjumlah);
        inputjumlah.setBounds(10, 130, 485, 24);
        inputjumlah.setFont(new Font("Arial", Font.BOLD, 14));
        inputjumlah.addActionListener(this);
        
        add(tombolkembali);
        tombolkembali.setBounds(10, 200, 150, 24);
        tombolkembali.setFont(new Font("Arial", Font.BOLD, 14));
        tombolkembali.addActionListener(this);
        
        add(tombolbeli);
        tombolbeli.setBounds(200, 200, 150, 24);
        tombolbeli.setFont(new Font("Arial", Font.BOLD, 14));
        tombolbeli.addActionListener(this);
        
        add(judultransaksi);
        judultransaksi.setBounds(10, 230, 500, 24);
        judultransaksi.setFont(new Font("Arial", Font.BOLD, 20));
        
        add(hargasatuan);
        hargasatuan.setBounds(10, 260, 500, 24);
        hargasatuan.setFont(new Font("Arial", Font.BOLD, 20));
        
        add(tagoutputjumlah);
        tagoutputjumlah.setBounds(10, 290, 500, 24);
        tagoutputjumlah.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(totaltransaksi);
        totaltransaksi.setBounds(10, 320, 500, 24);
        totaltransaksi.setFont(new Font("Arial", Font.BOLD, 14));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tombolbeli){
           try {
               if (inputjumlah.getText().isEmpty()){
                   throw new Exception("Input jumlah terlebih dahulu.");
               }
               
               // parsing
               double jumlah = Double.parseDouble(inputjumlah.getText());
               
               // membuat objek
               hitungmajalahremaja majalah2 = new hitungmajalahremaja(jumlah);
               
               //menghitung hasil & konversi ke string
               String hasilmajalahremaja = String.valueOf(majalah2.JumlahAnak());
               
               //menampilkan hasil di label
               judultransaksi.setText("Total Pembelian");
               hargasatuan.setText("Harga Satuan    Rp 15.200");
               tagoutputjumlah.setText("Jumlah" + inputjumlah.getText() + "pcs");
               totaltransaksi.setText("Total    " + hasilmajalahremaja);
               
               
               
           } catch (NumberFormatException ex){
               JOptionPane.showMessageDialog(this, "Jumlah yang diinput bukan merupakan angka.");
           } catch (Exception ex){
               JOptionPane.showMessageDialog(this, "Input jumlah terlebih dahulu.");
           }
        } else if (e.getSource() == tombolkembali){
            halamanutama halamanutamaFrame = new halamanutama();
            this.dispose();
        }
    }
    
}
