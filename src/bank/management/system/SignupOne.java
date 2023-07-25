
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*; // for random function
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener
{
    //Bydefault setlayout hota h, that's y to get elemets aligned by our widsh we do setlayout(null
    
    long random; 
    JTextField nameTextField,FnameTextField, emailTextField, addressTextField, CityTextField, StateTextField, PincodeTextField;
    JButton next; 
    JRadioButton male, Female, other, married , unmarried;
    JDateChooser datechooser;
    SignupOne() {
        
        
        
        
        setLayout(null);
        Random ran =new Random(); 
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
       
       JLabel formno =new JLabel("APPILCATION FORM NO." + random) ;
       formno.setFont(new Font("Raleway", Font.BOLD, 30));
       formno.setBounds(140, 20, 600, 30);//setBounds work setLayout is null
       add(formno);
        
        JLabel PersonalDetails =new JLabel("Page 1: Personal Details") ;
       PersonalDetails.setFont(new Font("Raleway", Font.BOLD, 18));
       PersonalDetails.setBounds(290, 80, 400, 20);//setBounds work setLayout is null
       add(PersonalDetails);
        
        JLabel Name =new JLabel("Name:") ;
        Name.setFont(new Font("Raleway", Font.BOLD, 22));
       Name.setBounds(100, 140, 100, 20);//setBounds work setLayout is null
       add(Name); 
       
        nameTextField= new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 20);
        add(nameTextField);
        
        
       JLabel Fname =new JLabel("Father's name:") ;
        Fname.setFont(new Font("Raleway", Font.BOLD, 22));
       Fname.setBounds(100, 190, 200, 20);//setBounds work setLayout is null
       add(Fname); 
       
       FnameTextField= new JTextField();
        FnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        FnameTextField.setBounds(300, 190, 400, 20);
        add(FnameTextField);
       
       JLabel DoB =new JLabel("Date of Birth:") ;
        DoB.setFont(new Font("Raleway", Font.BOLD, 22));
       DoB.setBounds(100, 240, 200, 20);//setBounds work setLayout is null
       add(DoB); 
       
         datechooser = new JDateChooser();
       datechooser.setBounds(300, 240, 400, 20);
       datechooser.setForeground(new Color(105, 105, 105));
       add(datechooser);
       
       
       
       JLabel Gender =new JLabel("Gender:") ;
        Gender.setFont(new Font("Raleway", Font.BOLD, 22));
        Gender.setBounds(100, 290, 200, 20);//setBounds work setLayout is null
       add(Gender); 
       
        male = new JRadioButton("Male");
       male.setBounds(300, 290, 60, 20);
       male.setBackground(Color.WHITE);
       add(male); 
       
      Female = new JRadioButton("Female");
        Female.setBounds(450, 290, 90, 20);
        Female.setBackground(Color.WHITE);
        add(Female);
        
       // To select one option from female and male we have to use ButtonGroup
       
       ButtonGroup gendergroup = new ButtonGroup();
       gendergroup.add(male);
       gendergroup.add(Female);
       
       
       
       JLabel email =new JLabel("Email Address:") ;
        email.setFont(new Font("Raleway", Font.BOLD, 22));
       email.setBounds(100, 340, 200, 20);//setBounds work setLayout is null
       add(email); 
       
        emailTextField= new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 20);
        add(emailTextField);
        
       JLabel marital =new JLabel("Marital status:") ;
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
       marital.setBounds(100, 390, 200, 20);//setBounds work setLayout is null
       add(marital); 
       
        married = new JRadioButton("Married");
       married.setBounds(300, 390, 100, 20);
      married.setBackground(Color.WHITE);
       add(married); 
       
       unmarried = new JRadioButton("Unmarried");
       unmarried.setBounds(450, 390, 100, 20);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
       
          other = new JRadioButton("Other");
          other.setBounds(630, 390, 100, 20);
        other.setBackground(Color.WHITE);
        add(other);
        
       // To select one option from female and male we have to use ButtonGroup
       
       ButtonGroup Maritalgroup = new ButtonGroup();
       Maritalgroup.add(married);
       Maritalgroup.add(unmarried);
       Maritalgroup.add(other);
       
       
        JLabel address =new JLabel("Address:") ;
        address.setFont(new Font("Raleway", Font.BOLD, 22));
       address.setBounds(100, 440, 200, 20);//setBounds work setLayout is null
       add(address);
       
       
        addressTextField= new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 20);
        add(addressTextField);
        
        
       JLabel City =new JLabel("City :") ;
        City.setFont(new Font("Raleway", Font.BOLD, 22));
       City.setBounds(100, 490, 200, 20);//setBounds work setLayout is null
       add(City );
       
        CityTextField= new JTextField();
        CityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        CityTextField.setBounds(300, 490, 400, 20);
        add(CityTextField);
        
        
        JLabel State =new JLabel("State :") ;
        State.setFont(new Font("Raleway", Font.BOLD, 22));
       State.setBounds(100, 540, 200, 20);//setBounds work setLayout is null
       add(State );
       
        StateTextField= new JTextField();
        StateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        StateTextField.setBounds(300, 540, 400, 20);
        add(StateTextField);
        
        
        JLabel Pincode =new JLabel("Pincode:") ;
        Pincode.setFont(new Font("Raleway", Font.BOLD, 22));
       Pincode.setBounds(100, 590, 200, 20);//setBounds work setLayout is null
       add(Pincode );
       
       PincodeTextField= new JTextField();
        PincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        PincodeTextField.setBounds(300, 590, 400, 20);
        add(PincodeTextField);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(420,620, 80 ,20);
        next.addActionListener(this);
        add(next);
        
       getContentPane().setBackground(Color.WHITE);
       setSize(800, 800);
       setLocation(350, 0);
       setVisible(true);       
}
    
    public void actionPerformed(ActionEvent ae){
    String formno ="" + random; 
    String name = nameTextField.getText();
    String Fname = FnameTextField.getText();
    String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(male.isSelected()){
    gender="Male";}
    else if(Female.isSelected()){
    gender="Female";}
    String email=emailTextField.getText();
     
   String marital=null;
   if(married.isSelected())
   {
    marital="Married"; 
   }
   else if(unmarried.isSelected())
   {
    marital="UnMarried";
   }
   else{
    marital="Other";
   }
   
   String address=addressTextField.getText();
   String city=CityTextField.getText();
   String state= StateTextField.getText();
   String Pin= PincodeTextField.getText();
   
   
   try
   {
     if(name.equals(""))
     {// To Pop UP message
        JOptionPane.showMessageDialog(null, "Name is Required");
     }
     else
     {
     conn c = new conn();
     String query ="insert into signup values('"+formno+"', '"+name+"', '"+Fname+"', '"+dob+"', '"+gender+"','"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"','"+Pin+"')";
     c.s.executeUpdate(query);
     setVisible(false);
      new SignupTwo(formno).setVisible(true);
     }
     }
    catch(Exception e)
   {
   System.out.println(e);
   }
}
    
    
    
  public static void main(String args[]){
  new SignupOne();
  }  
}


