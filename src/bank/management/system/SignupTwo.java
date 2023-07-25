
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*; // for random function
import java.awt.event.*;
//import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener{
    //Bydefault setlayout hota h, that's y to get elemets aligned by our widsh we do setlayout(null
    
    long random; 
    JTextField pan,aadhar;
    JButton next; 
    JRadioButton sno, syes,eno, eyes;
//    JDateChooser datechooser;
    String formno;
    JComboBox religion, category,income,Qualification,Occupation;
    SignupTwo(String formno) {
        
        
        
        this.formno=formno;
        setLayout(null);
        setTitle("New Application Form Page-2");
        Random ran =new Random(); 
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
       
//       JLabel formno =new JLabel("APPILCATION FORM NO." + random) ;
//       formno.setFont(new Font("Raleway", Font.BOLD, 30));
//       formno.setBounds(140, 20, 600, 30);//setBounds work setLayout is null
//       add(formno);
        
        JLabel AdditionalDetails =new JLabel("Page 2: Additional Details") ;
       AdditionalDetails.setFont(new Font("Raleway", Font.BOLD, 18));
       AdditionalDetails.setBounds(290, 40, 400, 22);//setBounds work setLayout is null
       add(AdditionalDetails);
        
        JLabel Name =new JLabel("Religion:") ;
        Name.setFont(new Font("Raleway", Font.BOLD, 22));
       Name.setBounds(100, 120, 100, 28);//setBounds work setLayout is null
       add(Name); 
       
//        nameTextField= new JTextField();
//        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
//        nameTextField.setBounds(300, 120, 400, 20);
//        add(nameTextField);
        
        String valreligion[]={"Hindu", "Muslim", "Sikh", "Christian", "Other"};
         religion = new JComboBox(valreligion);
        religion.setBounds(300, 120, 400, 20);
        religion.setBackground(Color.WHITE);
        add(religion);
        
       JLabel Fname =new JLabel("Category:") ;
        Fname.setFont(new Font("Raleway", Font.BOLD, 22));
       Fname.setBounds(100, 170, 200, 28);//setBounds work setLayout is null
       add(Fname); 
       
//       FnameTextField= new JTextField();
//        FnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
//        FnameTextField.setBounds(300, 170, 400, 20);
//        add(FnameTextField);
       
          String valcategory[]={"General", "OBC", "SC", "ST", "Other"};
         category = new JComboBox(valcategory);
        category.setBounds(300, 170, 400, 20);
       category.setBackground(Color.WHITE);
        add(category);
        
       JLabel DoB =new JLabel("Income:") ;
        DoB.setFont(new Font("Raleway", Font.BOLD, 22));
       DoB.setBounds(100, 220, 200, 20);//setBounds work setLayout is null
       add(DoB); 
       
       String valincome[]={"NULL", "<1,50,000", "<2,50,000", "<5,00,0000"};
         income = new JComboBox(valincome);
        income.setBounds(300, 220, 400, 20);
       income.setBackground(Color.WHITE);
        add(income);
        
//         datechooser = new JDateChooser();
//       datechooser.setBounds(300, 220, 400, 20);
//       datechooser.setForeground(new Color(105, 105, 105));
//       add(datechooser);
       
       
       
       JLabel Gender =new JLabel("Educational:") ;
        Gender.setFont(new Font("Raleway", Font.BOLD, 22));
        Gender.setBounds(100, 270, 200, 20);//setBounds work setLayout is null
       add(Gender); 
       
//        male = new JRadioButton("Male");
//       male.setBounds(300, 270, 60, 20);
//       male.setBackground(Color.WHITE);
//       add(male); 
//       
//      Female = new JRadioButton("Female");
//        Female.setBounds(450, 270, 90, 20);
//        Female.setBackground(Color.WHITE);
//        add(Female);
        
       // To select one option from female and male we have to use ButtonGroup
       
//       ButtonGroup gendergroup = new ButtonGroup();
//       gendergroup.add(male);
//       gendergroup.add(Female);
       
       
       
       JLabel email =new JLabel("Qualification:") ;
        email.setFont(new Font("Raleway", Font.BOLD, 22));
       email.setBounds(100, 290, 200, 20);//setBounds work setLayout is null
       add(email); 
       
       
       String valQualification[]={"Non-Graduatoion", "Graduate", "Post-Graduate", "Doctrate", "others"};
         Qualification = new JComboBox(valQualification);
        Qualification.setBounds(300, 290, 400, 20);
       Qualification.setBackground(Color.WHITE);
        add(Qualification);
        
        
//        emailTextField= new JTextField();
//        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
//        emailTextField.setBounds(300, 320, 400, 20);
//        add(emailTextField);
        
       JLabel marital =new JLabel("Occupation:") ;
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
       marital.setBounds(100, 370, 200, 20);//setBounds work setLayout is null
       add(marital); 
       
        String valOccupation[]={"Salaried", "Self-Employed", "Bussiness", "Student", "others"};
         Occupation = new JComboBox(valOccupation);
        Occupation.setBounds(300, 370, 400, 20);
       Occupation.setBackground(Color.WHITE);
        add(Occupation);
       
  
        JLabel pin =new JLabel("PAN Number:") ;
        pin .setFont(new Font("Raleway", Font.BOLD, 22));
       pin .setBounds(100, 420, 200, 20);//setBounds work setLayout is null
       add(pin );
       
       
        pan= new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 420, 400, 20);
        add(pan);
        
        
       JLabel Aadhar =new JLabel("Aadhar Number:") ;
        Aadhar.setFont(new Font("Raleway", Font.BOLD, 22));
       Aadhar.setBounds(100, 470, 200, 20);//setBounds work setLayout is null
       add(Aadhar);
       
        aadhar= new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 470, 400, 20);
        add(aadhar);
        
        
        JLabel State =new JLabel("Senior Citizen:") ;
        State.setFont(new Font("Raleway", Font.BOLD, 22));
       State.setBounds(100, 520, 200, 20);//setBounds work setLayout is null
       add(State );
       
       
       syes = new JRadioButton("Yes");
       syes.setBounds(300, 520, 60, 20);
       syes.setBackground(Color.WHITE);
       add(syes); 
       
      sno = new JRadioButton("No");
         sno.setBounds(450, 520, 90, 20);
         sno.setBackground(Color.WHITE);
        add( sno);

        ButtonGroup gendergroup = new ButtonGroup();
       gendergroup.add(syes);
       gendergroup.add(sno);

//        StateTextField= new JTextField();
//        StateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
//        StateTextField.setBounds(300, 520, 400, 20);
//        add(StateTextField);
        
        
        JLabel Pincode =new JLabel("Existing Account:") ;
        Pincode.setFont(new Font("Raleway", Font.BOLD, 22));
       Pincode.setBounds(100, 570, 200, 20);//setBounds work setLayout is null
       add(Pincode );
       
       eyes = new JRadioButton("Yes");
       eyes.setBounds(300, 570, 60, 20);
       eyes.setBackground(Color.WHITE);
       add(eyes); 
       
         eno = new JRadioButton("No");
         eno.setBounds(450, 570, 90, 20);
         eno.setBackground(Color.WHITE);
        add( eno);

        ButtonGroup Accountgroup = new ButtonGroup();
       Accountgroup.add(eyes);
       Accountgroup.add(eno);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(420,600, 80 ,30);
        next.addActionListener(this);
        add(next);
        
       getContentPane().setBackground(Color.WHITE);
       setSize(800, 800);
       setLocation(350, 0);
       setVisible(true);       
}
    
    public void actionPerformed(ActionEvent ae)
    {
    String formno ="" + random;
    
    String sreligion = (String) religion.getSelectedItem();
    String scategory = (String) category.getSelectedItem();
    String sincome = (String) income.getSelectedItem();
    String seducation = (String) Qualification.getSelectedItem();
     String sOccupation = (String) Occupation.getSelectedItem();   
    String seniorcitizen=null;
    if(syes.isSelected()){
   seniorcitizen="Yes";}
    else if(sno.isSelected()){
    seniorcitizen="No";}
//    String email=emailTextField.getText();
     
   String existingAccount=null;
   if(eyes.isSelected()){
    existingAccount="Yes"; }
   else if(eno.isSelected()){
    existingAccount="No";
   }
  
   
   String span=pan.getText();
   String saadhar=aadhar.getText();

   
   
   try
   { 
     conn c = new conn();
     String query ="insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"','"+sOccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingAccount+"')";
     c.s.executeUpdate(query);
     setVisible(false);
     new signupthree(formno).setVisible(true);
     }
    catch(Exception e)
   {
   System.out.println(e);
   }
}
    
    
    
  public static void main(String args[]){
  new SignupTwo("");
  }  
}


