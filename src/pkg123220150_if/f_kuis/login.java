package pkg123220150_if.f_kuis;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener{
    JLabel judul = new JLabel("Program Penjualan Majalah");
    JLabel subjudul = new JLabel("Silahkan masuk untuk melanjutkan");
    JLabel taguser = new JLabel("Username");
    JTextField inputuser = new JTextField();
    JLabel tagpass = new JLabel("Password");
    JTextField inputpass = new JTextField();
    JButton tombollogin = new JButton ("Login");
    

    login() {
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
        subjudul.setBounds(10, 35, 500, 24);
        subjudul.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(taguser);
        taguser.setBounds(10, 70, 150, 24);
        taguser.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(inputuser);
        inputuser.setBounds(10, 95, 485, 24);
        inputuser.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(tagpass);
        tagpass.setBounds(10, 125, 500, 24);
        tagpass.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(inputpass);
        inputpass.setBounds(10, 150, 485, 24);
        inputpass.setFont(new Font("Arial", Font.BOLD, 14));
        
        add(tombollogin);
        tombollogin.setBounds(10, 200, 485, 24);
        tombollogin.setFont(new Font("Arial", Font.BOLD, 14));
        tombollogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        String username = inputuser.getText();
        String password = inputpass.getText();

        if (username.isEmpty() && password.isEmpty()){
            throw new Exception("Username dan password belum diisi!");
        } else if (username.isEmpty()){
            throw new Exception("Username belum diisi!");
        } else if (password.isEmpty()){
            throw new Exception("Password belum diisi!");
        }
         
        new halamanutama(username);
            this.dispose();
        }
        catch (Exception error){
        JOptionPane.showMessageDialog(this, error.getMessage());
    } 
  }   
}
