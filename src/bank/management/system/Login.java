
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton signup, login, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
//  constructor  
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null); // to set image at given position
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text=new JLabel("Welcome to ATM"); //Jlabel to write anything on frame
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40, 400,40);
        add(text);
        
        JLabel cardno=new JLabel("Cardno."); //Jlabel to write anything on frame
        cardno.setFont(new Font("Raleway", Font.BOLD, 38));
        cardno.setBounds(120,150, 150,40);
        add(cardno);
        
        cardTextField= new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("arial", Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin=new JLabel("PIN:"); //Jlabel to write anything on frame
        pin.setFont(new Font("Raleway", Font.BOLD, 38));
        pin.setBounds(120,220, 400,40);
        add(pin);
        
        pinTextField= new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("arial", Font.BOLD,14));
        add(pinTextField);
        
        login= new JButton("SIGN UP");
        login.setBounds(300, 300, 100 ,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         clear= new JButton("Clear");
        clear.setBounds(430, 300, 100 ,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
         signup= new JButton("SIGN IN");
        signup.setBounds(300, 350, 230 ,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 100);
    }
    public void actionPerformed(ActionEvent ae){ //abstract method override
    if(ae.getSource() == clear){
    cardTextField.setText("");
    pinTextField.setText("");
    }
    else if(ae.getSource()== login)
    {
        conn c= new conn(); 
        String cardnumber = cardTextField.getText(); 
          String pinnumber = pinTextField.getText();
          String query= "select * from login where cardnumber ='"+cardnumber+"' and pinnumber= '"+pinnumber+"'";
    try{
//        Resultset to store the dtata that qury will return;
        ResultSet rs=c.s.executeQuery(query);
        if(rs.next()){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Incorrect card number or Pin");
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    else if(ae.getSource()==signup){
        setVisible(false);
        new SignupOne().setVisible(true);
    }
    
    
    
    }
  public static void main(String args[])
  {
  
      new Login();
  
  }
}
