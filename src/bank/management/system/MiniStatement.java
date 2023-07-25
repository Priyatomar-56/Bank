package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame{
    
    String pinnumber;
    
    MiniStatement(String pinnumber){
        
      this.pinnumber=pinnumber;  
        setLayout(null);
        
        JLabel mini= new JLabel(); 
        add(mini);
        
        JLabel bank= new JLabel("Bank of Barodra"); 
        bank.setBounds(150, 20, 100, 20);
        add(bank);
        
        JLabel card= new JLabel(); 
        card.setBounds(20, 80, 300, 20);
        add(card);
        
         JLabel Balance = new JLabel(); 
         Balance.setBounds(90, 420, 300, 20);
         add(Balance );
        
        
       try{
           
           
           conn c= new conn();
           int Bal=0;
           ResultSet rs=c.s.executeQuery("select * from login where pinnumber='"+pinnumber+"'");
           while(rs.next()){
           card.setText("Card Number: "+ rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));
           
           if(rs.getString("Acc_Type").equals("Deposit")){
            Bal+=Integer.parseInt(rs.getString("amount"));
            }
            else{
            Bal-=Integer.parseInt(rs.getString("amount"));
            }
           }
           Balance.setText("Your Current Account Balance is Rs"+ Bal);
       }
       catch(Exception e)
       {
       System.out.println(e);
       }
        
       
       try{
           
           conn c= new conn();
           ResultSet rs=c.s.executeQuery("select * from Amount where pinnumber = '"+pinnumber+"'");
           while(rs.next()){
//               using html tag to give some space;
           mini.setText(mini.getText() +"<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("Acc_Type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount")+"<br><br><html>");
           }
       
       }
       
       catch(Exception e)
       {
       System.out.println(e);
       }
      mini.setBounds(70, 140, 400, 200);
        setTitle("Mini Statement");
        setSize(400, 600); 
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    
    
    
    public static void main(String args[])
    {
        new MiniStatement("");
    }
}
