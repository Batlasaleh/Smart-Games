
package mainframe;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Font;

public class game2 extends JFrame implements ActionListener{
int rand = (int) (Math.random()*100);
    Icon icn = new ImageIcon(getClass().getResource("think.jpg"));
    Icon icn2 = new ImageIcon(getClass().getResource("tenor.gif"));
    Icon icn3 = new ImageIcon(getClass().getResource("th.jpg"));
    Icon icn4 = new ImageIcon(getClass().getResource("no.gif"));
    Icon icn5 = new ImageIcon(getClass().getResource("cry.gif"));
    Icon icn6 = new ImageIcon(getClass().getResource("angry.gif"));
    JLabel lblcn = new JLabel(icn);
    JLabel lblcn3 = new JLabel(icn3);
    static JLabel lbl1 = new JLabel("Guess my number!");
    static JLabel lbl2 = new JLabel("Enter a number between 1-100 ");
    static JTextField txt = new JTextField();
    static JButton guessbtn = new JButton("Guess");
    static JButton giveupsbtn = new JButton("Guive up!");
    static JButton aginbtn = new JButton("Play Again");
    static JLabel lbl3 = new JLabel("Try and guess my number");
    static JPanel p1 = new JPanel();
    static JPanel p2 = new JPanel();
    static JLabel lbl4 = new JLabel("you have 8 attempts only, be careful!");
    int count = 0;
    
    public game2() {
       
        this.setSize(300,630);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Guessing number");
        this.setLayout(new FlowLayout());
        
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        p2.setLayout(new BoxLayout(p2,BoxLayout.X_AXIS));
        
        lbl1.setFont(new Font("Guess my number!",Font.BOLD,22));
        lbl1.setForeground(Color.pink);
        
        lbl2.setFont(new Font("Enter a number between 1-100 ",Font.BOLD,15));
        lbl2.setForeground(Color.lightGray);
        
        lbl3.setFont(new Font("Try and guess my number",Font.BOLD,15));
        lbl3.setForeground(Color.GRAY);
        
        lbl4.setFont(new Font("you have 8 attempts",Font.BOLD,15));
        lbl4.setForeground(Color.RED);
        this.getContentPane().setBackground(Color.white);
        
        p1.setBackground(Color.white);
        p2.setBackground(Color.white);
        p1.add(this.lblcn);
        p1.add(lbl1);
        p1.add(lbl2);
        p1.add(txt);
        p1.add(lbl3);
        
        p2.add(guessbtn);
        p2.add(giveupsbtn);
        p2.add(aginbtn);
        this.add(lbl4);
        this.add(p1);
        this.add(p2);
        this.add(this.lblcn3);
        
        guessbtn.addActionListener(this);
        giveupsbtn.addActionListener(this);
        aginbtn.addActionListener(this); 
    }
    
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==guessbtn){
            if (txt.getText().equals("")){
                lbl3.setText(" you need to enter something!!!!");
                lblcn3.setIcon(icn5);
                return;
            }     
        int num = Integer.parseInt(txt.getText());
         
        if (num > rand){
            lbl3.setText(num+" too high!! try again!");
            lblcn3.setIcon(icn4);
            count++;
        }
        else if (num < rand){
            lbl3.setText(num+" too low!! try again!");
            lblcn3.setIcon(icn4);
            count++;
        }
        else {
            lbl3.setText("CORRECT, YOU WIN!!!!");
            lblcn3.setIcon(icn2);
            txt.setEditable(false);
        }
         if (count >  7) {
                lbl3.setText("You lost the game");
                lblcn3.setIcon(icn6);
                txt.setEditable(false);   
            }
        }    
      
        else if (e.getSource()==giveupsbtn){
            lbl3.setText(rand+" is the answer!     ");
            lblcn3.setIcon(icn5);
            txt.setEditable(false);
        }
        else if (e.getSource()==aginbtn){
            count = 0;
         rand = (int) (Math.random()*100);
         lbl3.setText("       Try and guess my number");
         txt.setText("");
         lblcn3.setIcon(icn3);
         txt.setEditable(true);
         
        }
    
}  
}
