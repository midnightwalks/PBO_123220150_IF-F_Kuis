package pkg123220150_if.f_kuis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class halamanutama extends JFrame implements ActionListener{

    JLabel judul = new JLabel();
    JLabel subjudul = new JLabel("Silahkan pilih menu di bawah untuk melanjutkan.");
    JButton tombolmanak = new JButton ("Majalah Anak");
    JButton tombolmremaja = new JButton ("Majalah Remaja");
    JButton tombolmdewasa = new JButton ("Majalah Dewasa");
    
    
    halamanutama(String username){
        setVisible(true);
        setSize(520, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(judul);
        judul.setBounds(10, 10, 500, 24);
        judul.setFont(new Font("Arial", Font.BOLD, 20));
        
        add(subjudul);
        subjudul.setBounds(10, 35, 150, 24);
        subjudul.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(tombolmanak);
        tombolmanak.setBounds(10, 70, 485, 24);
        tombolmanak.setFont(new Font("Arial", Font.BOLD, 14));
        tombolmanak.addActionListener(this);
        
        add(tombolmremaja);
        tombolmremaja.setBounds(10, 110, 485, 24);
        tombolmremaja.setFont(new Font("Arial", Font.BOLD, 14));
        tombolmremaja.addActionListener(this);
        
        add(tombolmdewasa);
        tombolmdewasa.setBounds(10, 150, 485, 24);
        tombolmdewasa.setFont(new Font("Arial", Font.BOLD, 14));
        tombolmdewasa.addActionListener(this);
    }

    halamanutama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == tombolmanak){
                majalahanak majalahanakFrame = new majalahanak();
                this.dispose();
            } else if (e.getSource() == tombolmremaja){
                majalahremaja majalahremajaFrame = new majalahremaja();
                this.dispose();
            } else if (e.getSource() == tombolmdewasa){
                majalahdewasa majalahdewasaFrame = new majalahdewasa();
                this.dispose();
            }
            
        } catch (Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
}
