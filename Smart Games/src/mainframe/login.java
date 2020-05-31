
package mainframe;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class login extends JFrame implements ActionListener{
    JLabel background =new JLabel(new ImageIcon(getClass().getResource("back1.png")));
    JLabel background2 =new JLabel(new ImageIcon(getClass().getResource("back1.png")));
    static JLabel lbl = new JLabel("Login Form");
    static JTextField username = new JTextField(10);
    static JPasswordField password = new JPasswordField (10);
    static JLabel name = new JLabel("Enter Your Username");
    static JLabel pass = new JLabel("Enter Your Password");
    static JButton loginBtn = new JButton ("Login");
    
    Connection connection= null;
    
    public login(){
       this.setSize(200,200);
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.background2.setLayout(new FlowLayout());
       this.setLayout(new FlowLayout());
       this.setContentPane(this.background2);
       this.setLocation(550, 200);
       
       this.add(lbl);
       this.add(name);
       this.add(username);
       this.add(pass);
       this.add(password);
       this.add(loginBtn);
       loginBtn.addActionListener(this);
       
      try{
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=true","root","n6LWs2?4");
      
       }
       catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       } 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginBtn){
            
            String uName= username.getText();
            String pass= password.getText();
            
            try{
           Statement statement = connection.createStatement();
           ResultSet resultSet =statement.executeQuery("SELECT UserName,UserPassword FROM project.pruser;"); 
           boolean flag= false;
           while (resultSet.next()){
               
               if(  uName.equals(resultSet.getObject(1)) 
                       && pass.equals(resultSet.getObject(2))  ){
                   flag= true;
                   JOptionPane.showMessageDialog(this, "Welcome   "+uName, "Welcome", JOptionPane.INFORMATION_MESSAGE);
                   this.setVisible(false);
                   games g = new games();
   
               }

           }
           if(flag == false){
                 JOptionPane.showMessageDialog(this, "You are not registered, Please register first", "Error", JOptionPane.ERROR_MESSAGE);

           }
            }
            catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       } 
        }
        
    
    }
}
