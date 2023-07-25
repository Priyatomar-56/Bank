
package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class  Withdraw extends JFrame implements ActionListener{
    JButton Back, withdraw;
    JTextField amount;
    String pinnumber;
    Withdraw(String pinnumber){
       this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);
        
        
        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 15));        
        text.setBounds(110, 220, 400, 20);
        image.add(text);
        
        amount= new JTextField(); 
       amount.setFont(new Font("Raleway", Font.BOLD,22 ));
       amount.setBounds(100, 260, 290, 25);
       image.add(amount);
       
        withdraw= new JButton("withdraw");
       withdraw.setBounds(280, 360, 120, 25); 
       withdraw.addActionListener(this);
       image.add(withdraw);
       
         Back= new JButton("Back");
       Back.setBounds(280, 400, 120, 25); 
       Back.addActionListener(this);
       image.add(Back);
       
       
       
       
       
       
       
       
       setSize(700, 800);
        setLocation(300,0);
//        to remove the header.
        setUndecorated(true);
        
        setVisible(true);
       
   } 
    
    
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdraw){
            String number= amount.getText();
            Date date= new Date();
            if(number.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw "); 
            }
            else
            {
                try{
                conn c= new conn(); 
                String query= "insert  into Amount values('"+pinnumber+"','"+date+"','Withdraw','"+number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+number+" Amount Withdraw succesfully");
                setVisible(true);
                new Transactions(pinnumber).setVisible(true);
                }
                catch(Exception e){
                System.out.println(e);}
            }
            
        }
        
        
          else if(ae.getSource()==Back){
              setVisible(false);
              new Transactions(pinnumber).setVisible(true);
              
        }
        }
    
    
    public static void main(String args[]){
    new  Withdraw("");
    }
}

