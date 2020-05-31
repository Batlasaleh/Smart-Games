
package mainframe;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class games extends JFrame implements ActionListener{
    JLabel background =new JLabel(new ImageIcon(getClass().getResource("back1.png")));
    JLabel background2 =new JLabel(new ImageIcon(getClass().getResource("back1.png")));
    static JLabel game=new JLabel("Select a game to play:\n");
    static JButton g1=new JButton("Tic Tac Toe");
    static JButton g2=new JButton("Guess the number");
    static JButton g3=new JButton("Matching game");
    
    public games(){
       this.setSize(600, 150);
       this.setVisible(true);
       this.setTitle("Games");
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.background2.setLayout(new FlowLayout());
       this.setLayout(new FlowLayout());
       this.setContentPane(this.background2);
       this.setLocation(450, 200);
       this.setFont(new Font("Monospaced",Font.PLAIN ,30));
       
        this.add(game);
        this.add(g1);
        this.add(g2);
        this.add(g3);
        
       g1.addActionListener(this);
       g2.addActionListener(this);
       g3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(g1)){
      game1 obj=new game1();
      
    }
    
    if(e.getSource().equals(g2)){
      game2 obj=new game2();
      
    }
    if(e.getSource().equals(g3)){
      game3 obj=new game3();
      
    }
    }
}
