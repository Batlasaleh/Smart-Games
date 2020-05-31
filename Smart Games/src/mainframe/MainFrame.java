/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements MouseListener,MouseMotionListener{

    static MainFrame mf=new MainFrame();
    JLabel background =new JLabel(new ImageIcon(getClass().getResource("back1.png")));
    JLabel background2 =new JLabel(new ImageIcon(getClass().getResource("back1.png")));
    static JLabel wlc=new JLabel("   welcome !!");
    static JLabel log=new JLabel("    -LOGIN");
    static JLabel sign=new JLabel("    -SIGN IN");
    static JPasswordField pass=new JPasswordField(15);
    static JTextField name=new JTextField(15);
    static JButton login=new JButton("LOGIN");
    
    public static void main(String[] args) {
       
       mf.setSize(500, 200);
       mf.setSize(501, 200);
       mf.setLocation(400, 100);
       mf.setVisible(true);
       mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       mf.setTitle("Gaming");
       mf.setLayout( new BoxLayout( mf.getContentPane(), BoxLayout.Y_AXIS ));
       wlc.setFont(new Font("serif",Font.PLAIN ,30));
       log.setFont(new Font("Monospaced",Font.PLAIN ,18));
       sign.setFont(new Font("Monospaced",Font.PLAIN ,18));
       mf.setContentPane(mf.background);
       mf.background.setLayout(new BoxLayout( mf.getContentPane(), BoxLayout.Y_AXIS ));
       mf.add(wlc);
       mf.add(log);
       mf.add(sign);
       log.addMouseMotionListener(mf);
       sign.addMouseMotionListener(mf);
       mf.addMouseMotionListener(mf);
       log.addMouseListener(mf);
       sign.addMouseListener(mf);
       
       
       
    }

    @Override
    public void mouseClicked(MouseEvent me) {
     
       if(me.getSource().equals(log)){
           login log = new login();
           
       }
       
       if(me.getSource().equals(sign)){
          register re = new register();
       }
    }

    @Override
    public void mousePressed(MouseEvent me) {
   
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   
    }

    @Override
    public void mouseExited(MouseEvent me) {
   
    }

    @Override
    public void mouseDragged(MouseEvent me) {
    
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        if(me.getSource().equals(mf)){
        log.setForeground(Color.black);
        sign.setForeground(Color.black);}
        
       if(me.getSource().equals(log)){
           log.setForeground(Color.blue);
       }else log.setForeground(Color.black);
       if(me.getSource().equals(sign)){
           sign.setForeground(Color.blue);
       }else sign.setForeground(Color.black);
    }
    
}
