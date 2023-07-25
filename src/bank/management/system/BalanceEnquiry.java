
package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton Back;
    String pinnumber;
    BalanceEnquiry(String pinnumber){
        this.pinnumber=pinnumber;
         setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);
        
          Back= new JButton("Back");
       Back.setBounds(280, 400, 120, 25); 
       Back.addActionListener(this);
       image.add(Back);
        
         conn c= new conn();
          int balance =0;
        try
        {
         ResultSet rs=c.s.executeQuery("select * from Amount where pinnumber='"+pinnumber+"'");
           
            while(rs.next()){
            if(rs.getString("Acc_Type").equals("Deposit")){
            balance+=Integer.parseInt(rs.getString("amount"));
            }
            else{
            balance-=Integer.parseInt(rs.getString("amount"));
            }
          }}
            catch(Exception e){
                     System.out.println(e);
            }
        
        
        JLabel text= new JLabel("Your current account balance is Rs:" +balance);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 15));        
        text.setBounds(110, 220, 400, 20);
        image.add(text);
        
        
        setSize(900, 900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       setVisible(false);
       new Transactions(pinnumber).setVisible(true);
       
    
    
    }
    public static void main(String args[]){
    new BalanceEnquiry("");
    
    }
    
}
