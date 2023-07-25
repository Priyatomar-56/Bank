
package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
//import java.util.*;
public class PinChange extends JFrame implements ActionListener{
    
    JButton change, Back;
     JPasswordField pin, repin; 
     String pinnumber; 
    PinChange(String pinnumber){
        this.pinnumber=pinnumber;
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 15));        
        text.setBounds(260, 220, 400, 20);
        image.add(text);
        
        JLabel pintext = new JLabel("NEW PIN:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Raleway", Font.BOLD, 12));        
        pintext.setBounds(170, 290, 100, 25);
        image.add(pintext);
        
         pin=new  JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD,25));
        pin.setBounds(280, 290, 210, 25);
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter NEW PIN:");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("Raleway", Font.BOLD, 12));        
        repintext.setBounds(170, 340, 140, 25);
        image.add(repintext);
        
        repin=new  JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD,25));
        repin.setBounds(290, 340, 200, 25);
        image.add(repin);
        
         change= new JButton("Change");
        change.setBounds(350, 380, 120, 25);
        change.addActionListener(this);
        image.add(change);
        
         Back= new JButton("Back");
        Back.setBounds(350, 410, 120, 25);
        Back.addActionListener(this);
        image.add(Back);
        
        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        setUndecorated(true);
        
        
    }
    
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==change){
        try
        {
            String npin=pin.getText();
            String rpin=repin.getText();
            
            if(!npin.equals(rpin)){
            JOptionPane.showMessageDialog(null, "Entered PIN does not match");
            return ;
            }
            if(npin.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter new PIN");
            return;}
            if(rpin.equals("")){
            JOptionPane.showMessageDialog(null, "Please re-eneter new PIN");
            }
            conn c= new conn(); 
//            WE have to change pin in all the three tables so we need 3 queries; 

            String query1="update Amount set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";
            String query2="update signupthree set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";
            String query3="update login set pinnumber='"+rpin+"' where pinnumber='"+pinnumber+"'";
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN Changed Successfully");
            setVisible(false); 
            new Transactions(rpin).setVisible(true);
            
        }
        catch(Exception e){
        System.out.println(e);
        }
    }
        else {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]){
    new PinChange("").setVisible(true);
    }
}
