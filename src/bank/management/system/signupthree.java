
package bank.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

import java.awt.*; // for font class
//extends JFrame to use setSize, SetLocation, SetVisible, JLabel;
public class signupthree extends JFrame implements ActionListener
{
    
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit , cancel;
    String formno;
     signupthree( String formno){
         this.formno=formno;
     setLayout(null);
     JLabel l= new JLabel("Page 3: Account Details");
     l.setFont(new Font("Raleway", Font.BOLD, 22));
     l.setBounds(280,10,400, 40);
     add(l);
     
      JLabel type= new JLabel(" Account Type");
     type.setFont(new Font("Raleway", Font.BOLD, 22));
     type.setBounds(100, 60,400, 40);
     add(type);
     
     r1=new JRadioButton("Saving Account");
     r1.setFont(new Font("Raleway", Font.BOLD,18));
     r1.setBackground(Color.WHITE);
     r1.setBounds(100, 110, 250, 20);
     add(r1);
     
      r2=new JRadioButton("Fixed Deposit Account");
     r2.setFont(new Font("Raleway", Font.BOLD,18));
     r2.setBackground(Color.WHITE);
     r2.setBounds(350, 110, 300, 20);
     add(r2);
     
      r3=new JRadioButton("Current Account");
     r3.setFont(new Font("Raleway", Font.BOLD,18));
     r3.setBackground(Color.WHITE);
     r3.setBounds(100, 150, 250, 20);
     add(r3);
     
      r4=new JRadioButton("Recurring Deposit Account");
     r4.setFont(new Font("Raleway", Font.BOLD,18));
     r4.setBackground(Color.WHITE);
     r4.setBounds(350, 150, 300, 20);
     add(r4);
     
     ButtonGroup groupaccount = new ButtonGroup(); 
     groupaccount.add(r1);
     groupaccount.add(r2);
     groupaccount.add(r3);
     groupaccount.add(r4);
     
     JLabel card= new JLabel(" Card number:");
     card.setFont(new Font("Raleway", Font.BOLD, 22));
     card.setBounds(100, 210,200, 30);
     add(card);
     
     
     JLabel number= new JLabel("XXXX-XXXX-XXXX-4545");
     number.setFont(new Font("Raleway", Font.BOLD, 22));
     number.setBounds(330, 210,300, 30);
     add(number);
     
     JLabel cardDetails= new JLabel("Your 16 Digit Card Number");
     cardDetails.setFont(new Font("Raleway", Font.BOLD, 12));
     cardDetails.setBounds(100, 240,300, 20);
     add(cardDetails);
     
     
    JLabel pin= new JLabel("Pin:");
     pin.setFont(new Font("Raleway", Font.BOLD, 22));
     pin.setBounds(100, 290,200, 30);
     add(pin);
     
     
     JLabel pnumber= new JLabel("XXXX");
     pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
     pnumber.setBounds(330, 290,300, 30);
     add(pnumber);
     
     JLabel pinDetails= new JLabel("Your 4 Digit Password");
     pinDetails.setFont(new Font("Raleway", Font.BOLD, 12));
     pinDetails.setBounds(100, 310,300, 20);
     add(pinDetails);
     
     
     JLabel services= new JLabel("Services Required");
     services.setFont(new Font("Raleway", Font.BOLD, 22));
     services.setBounds(100, 360,400, 30);
     add(services);
     
     c1=new JCheckBox("ATM CARD"); 
     c1.setBackground(Color.WHITE);
     c1.setFont(new Font("Raleway", Font.BOLD, 16));
     c1.setBounds(100, 410, 200, 30);
     add(c1);
     
     
     c2=new JCheckBox("Internet Banking"); 
     c2.setBackground(Color.WHITE);
     c2.setFont(new Font("Raleway", Font.BOLD, 16));
     c2.setBounds(350, 410, 200, 30);
     add(c2);
     
     c3=new JCheckBox("Mobile Banking"); 
     c3.setBackground(Color.WHITE);
     c3.setFont(new Font("Raleway", Font.BOLD, 16));
     c3.setBounds(100, 460, 200, 30);
     add(c3);
     
     c4=new JCheckBox("Email and Sms Alerts"); 
     c4.setBackground(Color.WHITE);
     c4.setFont(new Font("Raleway", Font.BOLD, 16));
     c4.setBounds(350, 460, 200, 30);
     add(c4);
     
     c5=new JCheckBox("Cheque Book"); 
     c5.setBackground(Color.WHITE);
     c5.setFont(new Font("Raleway", Font.BOLD, 16));
     c5.setBounds(100, 510, 200, 30);
     add(c5);
     
     c6=new JCheckBox("E-Statement"); 
     c6.setBackground(Color.WHITE);
     c6.setFont(new Font("Raleway", Font.BOLD, 16));
     c6.setBounds(350, 510, 200, 30);
     add(c6);
     
     c7=new JCheckBox("I hererby declares that the above entered details are correct to the best of my knowledge"); 
     c7.setBackground(Color.WHITE);
     c7.setFont(new Font("Raleway", Font.BOLD, 16));
     c7.setBounds(100, 560, 700, 30);
     add(c7);
     
     submit = new JButton("Submit");
     submit.setBackground(Color.BLACK );
     submit.setForeground(Color.WHITE);
     submit.setFont(new Font("Raleway", Font.BOLD, 14));
     submit.setBounds(250, 600, 100, 30);
     submit.addActionListener(this);
     add(submit);
     
    cancel = new JButton("Cancel");
     cancel.setBackground(Color.BLACK );
     cancel.setForeground(Color.WHITE);
     cancel.setFont(new Font("Raleway", Font.BOLD, 14));
     cancel.setBounds(460, 600, 100, 30);
     cancel.addActionListener(this);
     add(cancel); 
     
     
     getContentPane().setBackground(Color.WHITE);
     
     
     setSize(850, 820);
     setLocation(350, 0);
     setVisible(true);
     }
     
     public void actionPerformed(ActionEvent ae)
     {
     if(ae.getSource()==submit){
         
         String Atype =null;
         if(r1.isSelected()){
         Atype="Saving Account";
         }
         else if(r2.isSelected()){
         Atype="Fixed Deposit Account";
         }
         else if(r3.isSelected()){
         Atype="Current Account";
         }
         else if(r4.isSelected()){
         Atype="Reccuring Deposit Account";
         }
        
         Random random=new Random();
        String cardnumber="" + Math.abs((random.nextLong()%90000000L)+504093600000000L);
        String pinnumber="" + Math.abs((random.nextLong()%9000L)+1000L);
     String facility=""; 
     if(c1.isSelected()){
     facility=facility+" ATM Card";
     }
     else if(c2.isSelected()){
          facility=facility+" Internet Banking";
     }
     else if(c3.isSelected()){
          facility=facility+" Mobile Banking";
     }else if(c4.isSelected()){
          facility=facility+" Email and SMS Alerts";
     }else if(c5.isSelected()){
          facility=facility+" Cheque Book";
     }else if(c6.isSelected()){
          facility=facility+" E-statement";
     }
     else if(c7.isSelected()){
          facility=facility+" Mobile Banking";
     }
     try{
         
         if(Atype.equals(""))
         {
         JOptionPane.showMessageDialog(null, "Account Type is required");
         }
         else
         {
         conn conn= new conn();
         String query1= "insert into signupthree values('"+formno+"','"+Atype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
        conn.s.executeUpdate(query1);
        
         String query2= "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
           conn.s.executeUpdate(query2);
           
         JOptionPane.showMessageDialog(null,"Card Number: "+ cardnumber +"\n Pin:"+ pinnumber);
         }
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
     
     
     
     
     }
     else if(ae.getSource()==cancel){
         setVisible(false); 
         new Login().setVisible(true);
     }}
    public static void main(String args[])
    {
    new signupthree(""); 
    
    }
   
}
