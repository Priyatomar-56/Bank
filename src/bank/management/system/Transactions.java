
package bank.management.system;
import java.awt.*;
import javax.swing.*; // for JFrame class
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener{
    String pinnumber;
    JButton deposit,withdrawl, fastcash, miniStatement,pinChange , Exit,BalanceEnquiry ;
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);
         
        JLabel text= new JLabel("Please Select your Transactions");
        text.setBounds(155, 230, 600, 40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,12));
//        image. add we use to add text on image.
        image.add(text);
        
        deposit =new JButton("Deposit");
        deposit.setBounds(90,320,130,20);
        deposit.addActionListener(this);
        image.add(deposit);
        
         withdrawl =new JButton("Withdrawl");
        withdrawl.setBounds(260,320,130,20);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash =new JButton("Fast cash");
        fastcash.setBounds(90,350,130,20);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
         miniStatement =new JButton("Mini-Statement");
        miniStatement.setBounds(260,350,130,20);
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
         pinChange =new JButton("Pin-Change");
        pinChange.setBounds(90,380,130,20);
        pinChange.addActionListener(this);
        image.add(pinChange);
        
        BalanceEnquiry =new JButton("Balance Enquiry");
        BalanceEnquiry.setBounds(260,380,130,20);
        BalanceEnquiry.addActionListener(this);
        image.add(BalanceEnquiry);
        
        Exit =new JButton("Exit");
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
        if(ae.getSource()== Exit)
        {
        System.exit(0);
        }
        else if(ae.getSource()==deposit)
        {
        setVisible(false);
        new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource()== withdrawl)
        {
            setVisible(false); 
            new Withdraw(pinnumber).setVisible(true);
        } 
        else if(ae.getSource()==fastcash)
        {
         setVisible(false);
         new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()==pinChange)
        {
            setVisible(false); 
            new PinChange(pinnumber).setVisible(true);
            
        }
        else if(ae.getSource()== BalanceEnquiry)
        {
        setVisible(false); 
        new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()== miniStatement)
        {
        new MiniStatement(pinnumber).setVisible(true);
        }
    }
     public static void main(String args[]){
     
     new Transactions("");
     }
}
