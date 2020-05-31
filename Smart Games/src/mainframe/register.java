
package mainframe;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class register extends JFrame implements ActionListener{
    JLabel background =new JLabel(new ImageIcon(getClass().getResource("back1.png")));
    JLabel background2 =new JLabel(new ImageIcon(getClass().getResource("back1.png")));
    static JLabel lbl = new JLabel("Sign Form");
    static JTextField fstname = new JTextField(10);
    static JTextField lstname = new JTextField(10);
    static JTextField username = new JTextField(10);
    static JPasswordField password = new JPasswordField (10);
    static JLabel fname = new JLabel("Enter Your First Name");
    static JLabel lname = new JLabel("Enter Your Last Name");
    static JLabel uname = new JLabel("Enter Your Username");
    static JLabel pass = new JLabel("Enter Your Password");
    static JButton regBtn = new JButton ("Register");
    
    
    Connection connection= null;
    public register(){
       this.setSize(200, 300);
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.background2.setLayout(new FlowLayout());
       this.setLayout(new FlowLayout());
       this.setContentPane(this.background2);
       this.setLocation(550, 200);
       
       this.add(lbl);
       this.add(fname);
       this.add(fstname);
       this.add(lname);
       this.add(lstname);
       this.add(uname);
       this.add(username);
       this.add(pass);
       this.add(password);
       this.add(regBtn);
       
       
       regBtn.addActionListener(this);
       
      try{
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=true","root","n6LWs2?4");
      
       }
       catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       } 
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==regBtn){
            
            String fName= fstname.getText();
            String lName= lstname.getText();
            String uName= username.getText();
            String pass= password.getText();
            
            try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format("INSERT INTO pruser (FirstName, LastName, UserName,UserPassword )"
                    + "VALUES ('%s', '%s', '%s', '%s');",fName,lName,uName,pass));
            }
              
             catch(SQLException sqlExeption){
           System.out.println( sqlExeption.getMessage( ) );
       }
      JOptionPane.showMessageDialog(rootPane, "you are successfully registered");
      this.setVisible(false);
       
            
        }
        
    }
}
