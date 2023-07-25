
package bank.management.system;
import java.awt.*;
import javax.swing.*; // for JFrame class
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener{
    String pinnumber;
    JButton deposit,withdrawl, fastcash, miniStatement,pinChange , Exit,BalanceEnquiry ;
   FastCash(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);
         
        JLabel text= new JLabel("Select Withdrawal amount");
        text.setBounds(155, 230, 600, 40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,12));
//        image. add we use to add text on image.
        image.add(text);
        
        deposit =new JButton("Rs 100");
        deposit.setBounds(90,320,130,20);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdrawl =new JButton("Rs 500");
        withdrawl.setBounds(260,320,130,20);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash =new JButton("Rs 1000");
        fastcash.setBounds(90,350,130,20);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
         miniStatement =new JButton("Rs 2000");
        miniStatement.setBounds(260,350,130,20);
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
         pinChange =new JButton("Rs 5000");
        pinChange.setBounds(90,380,130,20);
        pinChange.addActionListener(this);
        image.add(pinChange);
        
        BalanceEnquiry =new JButton("Rs 10000");
        BalanceEnquiry.setBounds(260,380,130,20);
        BalanceEnquiry.addActionListener(this);
        image.add(BalanceEnquiry);
        
         Exit =new JButton("Back");
        Exit.setBounds(260,420,130,20);
        Exit.addActionListener(this);
        image.add(Exit);
        
        
        
        setSize(700, 800);
        setLocation(300,0);
//        to remove the header.
        setUndecorated(true);
        
        setVisible(true);
    }
    public  void actionPerformed(ActionEvent ae){
        if(ae.getSource()== Exit){
        setVisible(false); 
        new Transactions(pinnumber).setVisible(true);
        
        }
        else if(ae.getSource()==deposit){
        setVisible(false);
        new Deposit(pinnumber).setVisible(true);
        }else {
             String amount= ((JButton)ae.getSource()).getText().substring(3);
             conn c= new conn();
        try{
            ResultSet rs=c.s.executeQuery("select * from Amount where pinnumber='"+pinnumber+"'");
            int balance =0;
            while(rs.next()){
            if(rs.getString("Acc_Type").equals("Deposit")){
            balance+=Integer.parseInt(rs.getString("amount"));
            }
            else{
            balance-=Integer.parseInt(rs.getString("amount"));
            }
             }
            if(ae.getSource() !=Exit && balance< Integer.parseInt(amount)){
            JOptionPane.showMessageDialog(null,"Insufficient Amount");
            return;
            }
            Date date =new Date();
             String query= "insert  into Amount values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs "+amount +"Debited Successfully");
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
        }
        catch(Exception e){
        System.out.println(e);}
        
        
        }
    }
     public static void main(String args[]){
     
     new FastCash("");
     }
}
