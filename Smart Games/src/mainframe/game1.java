/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class game1 extends JFrame implements ItemListener,ActionListener,MouseListener,MouseMotionListener{



static JButton b1=new JButton("1");
static JButton b2=new JButton("2");
static JButton b3=new JButton("3");
static JButton b4=new JButton("4");
static JButton b5=new JButton("5");
static JButton b6=new JButton("6");
static JButton b7=new JButton("7");
static JButton b8=new JButton("8");
static JButton b9=new JButton("9");
static JButton done=new JButton("Done");

Icon rabbit=new ImageIcon(getClass().getResource("lol.gif"));

static JRadioButton r1=new JRadioButton("X");
static JRadioButton r2=new JRadioButton("O");
static JRadioButton s1=new JRadioButton("");
static JRadioButton s2=new JRadioButton();
static ButtonGroup g=new ButtonGroup();
static ButtonGroup g2=new ButtonGroup();

static JLabel label1=new JLabel();
static JLabel label2=new JLabel("                   ");
static JLabel space=new JLabel("                   ");
static JLabel t1=new JLabel();//to state the turn of the symbol 
static JLabel result=new JLabel();

static JTextField player1=new JTextField(13);
static JTextField player2=new JTextField(13);


static Panel p2=new Panel();
static Panel p3=new Panel();
static Panel p4=new Panel();
static Panel p5=new Panel();
static Panel p6=new Panel();

 static String[] gender={"  Girl  ","  Boy  "};
 static String[] gender2={"  Boy  ","  Girl  "};
 static JComboBox gen=new JComboBox(gender);
 static JComboBox gen2=new JComboBox(gender2);
 
 Icon girl=new ImageIcon(getClass().getResource("girl.png"));
 Icon boy=new ImageIcon(getClass().getResource("boy.png"));
 Icon girl2=new ImageIcon(getClass().getResource("girl2.png"));
 Icon boy2=new ImageIcon(getClass().getResource("boy2.png"));
 
 static JLabel lab=new JLabel();
 static JLabel lab2=new JLabel();
 static JLabel txt1=new JLabel();
 static JLabel txt2=new JLabel();
 static JLabel pic1=new JLabel();
 static JLabel pic2=new JLabel();
 
 static Color first,sec,colo;
 
String apply; 
int counter=0,choice=0,a=0;

static GridLayout experimentLayout = new GridLayout(3,3,6,6);
static GridLayout experimentLayout2 = new GridLayout(0,2,6,6);
static GridLayout experimentLayout3 = new GridLayout(0,5,6,6);

 JLabel background =new JLabel(new ImageIcon(getClass().getResource("back.jpg")));
 JLabel background2 =new JLabel(new ImageIcon(getClass().getResource("back.jpg")));
 


    public game1() {
       
       gen.setForeground(Color.pink);
       gen2.setForeground(Color.blue);
       g.add(r1);
       g.add(r2);
       g2.add(s1);
       g2.add(s2);
       r1.setSelected(true);
       gen.addItemListener(this);
       gen2.addItemListener(this);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       done.addActionListener(this);
       r1.addItemListener(this);
       r2.addItemListener(this);
       p2.setLayout(experimentLayout);
       p3.setLayout(experimentLayout2);
       p4.setLayout(experimentLayout2);
       
       done.setHorizontalTextPosition(SwingConstants.CENTER);
       done.setVerticalTextPosition(SwingConstants.BOTTOM);
       player1.setEditable(false);
       player2.setEditable(false);
       player1.addMouseListener(this);
       player2.addMouseListener(this);
       
       this.addMouseListener(this);
       p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
       p6.setLayout(experimentLayout3);
       
       //JOptionPane.showMessageDialog(null,"Welcome to Tic Tac Toe Game!","welcome",0,this.rabbit);
         ///////////////////////////////////////////////////////////////////////////////////////
       this.setSize(400, 350);
       this.setLocation(400, 100);
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.setTitle("Register");
       this.setContentPane(this.background2);
       this.setLayout(new FlowLayout());
       
        player1.setText("Player1");
        player2.setText("Player2");
        
        
        p3.add(gen);
        p3.add(gen2);
        p3.add(player1);
        p3.add(player2);
        this.add(lab);
        this.add(lab2);
        lab.setIcon(this.girl);
        lab2.setIcon(this.boy2);
        p3.add(label1);
        p3.add(result);
        p3.add(r1);
        p3.add(r2);
        p3.add(label2);
        p3.add(label2);
        p3.add(done);
        this.add(p3);
        this.add(label2);
       
            first=Color.pink;
            sec=Color.BLUE;
      
      
      
      t1.setText("it is X turn");
      this.apply="X";
      label1.setText("choose a symbol for "+player1.getText()+" :");
      result.setText("the symbol for "+player2.getText()+" is:  O");
       
    }
    
    @Override
    public void itemStateChanged(ItemEvent ee) {
      player1.setEditable(false);
      player2.setEditable(false);
      pic1.setIcon(lab.getIcon());
       pic2.setIcon(lab2.getIcon());
       
       
      if(ee.getSource()==r1){
          choice=0;
          apply="X";
          t1.setText("it is X turn");
          result.setText("the symbol for "+player2.getText()+" is:  O");
          
          
      }
      
      if(ee.getSource()==r2){
          choice=1;
          apply="O";
          t1.setText("it is O turn");
          result.setText("the symbol for "+player2.getText()+" is:  X");
      }
      
       if(gen.getSelectedIndex()==0){
           gen.setForeground(Color.PINK);
           first=Color.PINK;
           lab.setIcon(girl);
           
       }       
        if(gen.getSelectedIndex()==1) {
            gen.setForeground(Color.BLUE);
            first=Color.BLUE;
             lab.setIcon(boy);
       }
        
        
        if(gen2.getSelectedIndex()==0){
            gen2.setForeground(Color.BLUE);
            sec=Color.CYAN;
           lab2.setIcon(boy2);
           
       }       
        if(gen2.getSelectedIndex()==1) {
            gen2.setForeground(Color.PINK);
            sec=Color.RED;
             lab2.setIcon(girl2);
       }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource().equals(done)){
            lab.setVisible(false);
            lab2.setVisible(false);
            p3.setVisible(false);
       this.setSize(400, 350);
       this.setLocation(400, 100);
       this.background2.setLayout(new FlowLayout());
       
            this.add(pic1);
            this.add(t1);
            this.add(pic2);
            p6.add(txt1);
            p6.add(s1);
            p6.add(space);
            p6.add(txt2);
            p6.add(s2);
            p2.add(b1);
            p2.add(b2);
            p2.add(b3);
            p2.add(b4);
            p2.add(b5);
            p2.add(b6);
            p2.add(b7);
            p2.add(b8);
            p2.add(b9);
            
      p5.add(p6);
      p5.add(p2);
      
      this.add(p5);
      player1.setEditable(false);
            player2.setEditable(false);
            player1.setText(player1.getText());
            player2.setText(player2.getText());
       
        }
        player1.setEditable(false);
        player2.setEditable(false);
        
        
   if(choice%2==0){
    t1.setText("it is X turn");
    apply="O";
    counter++;
    choice=1;
   
    }else if(choice%2!=0){
    t1.setText("it is O turn");
    apply="X";
    counter++;
    choice=0;
    
        
    }
   if(a%2==0){
       s1.setSelected(true);
       a=1;
   }else {
       s2.setSelected(true);
       a=0;
   }
     
   if(s2.isSelected()){
              colo=first;
           }
           if(s1.isSelected()){
              colo=sec;
           }
    
    if(e.getSource().equals(b1)){
        b1.setText(apply);
        b1.setBackground(colo);
        b1.setEnabled(false);
    } else if(e.getSource().equals(b2)){
        b2.setText(apply);
        b2.setEnabled(false);
        b2.setBackground(colo);
    } else if(e.getSource().equals(b3)){
        b3.setText(apply);
        b3.setEnabled(false);
        b3.setBackground(colo);
    } else if(e.getSource().equals(b4)){
        b4.setText(apply);
        b4.setEnabled(false);
        b4.setBackground(colo);
    } else if(e.getSource().equals(b5)){
        b5.setText(apply);
        b5.setEnabled(false);
        b5.setBackground(colo);
    } else if(e.getSource().equals(b6)){
        b6.setText(apply);
        b6.setEnabled(false);
        b6.setBackground(colo);
    } else if(e.getSource().equals(b7)){
        b7.setText(apply);
        b7.setEnabled(false);
        b7.setBackground(colo);
    } else if(e.getSource().equals(b8)){
        b8.setText(apply);
        b8.setEnabled(false);
        b8.setBackground(colo);
    } else if(e.getSource().equals(b9)){
        b9.setText(apply);
        b9.setEnabled(false);
        b9.setBackground(colo);
    } 
    
    
              if(b1.getText().equals(b2.getText())&&b1.getText().equals(b3.getText())){
            JOptionPane.showMessageDialog(null,"the winner is "+b1.getText(),"Winner",JOptionPane.INFORMATION_MESSAGE);
                 this.setVisible(false);
              }else 
            if(b4.getText().equals(b5.getText())&&b4.getText().equals(b6.getText())){
            JOptionPane.showMessageDialog(null,"the winner is "+b4.getText(),"Winner",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
            }else 
            if(b7.getText().equals(b8.getText())&&b7.getText().equals(b9.getText())){
            JOptionPane.showMessageDialog(null,"the winner is "+b7.getText(),"Winner",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);}else 
            if(b1.getText().equals(b4.getText())&&b1.getText().equals(b7.getText())){
            JOptionPane.showMessageDialog(null,"the winner is "+b1.getText(),"Winner",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);}else 
            if(b2.getText().equals(b5.getText())&&b2.getText().equals(b8.getText())){
            JOptionPane.showMessageDialog(null,"the winner is "+b2.getText(),"Winner",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);}else 
            if(b3.getText().equals(b6.getText())&&b3.getText().equals(b9.getText())){
                JOptionPane.showMessageDialog(null,"the winner is "+b3.getText(),"Winner",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);}else 
            if(b1.getText().equals(b5.getText())&&b1.getText().equals(b9.getText())){
            JOptionPane.showMessageDialog(null,"the winner is "+b1.getText(),"Winner",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);}else 
            if(b7.getText().equals(b5.getText())&&b7.getText().equals(b3.getText())){
            JOptionPane.showMessageDialog(null,"the winner is "+b7.getText(),"Winner",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);}else
                
                
                
                if(counter==10){
                JOptionPane.showMessageDialog(null,"It is a tie !","Tie",JOptionPane.INFORMATION_MESSAGE);  
                
            }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if(e.getSource()==player1){
           player1.setEditable(true);
           txt1.setText(player1.getText().trim());
       
           label1.setText("choose symbol for "+player1.getText()+" :");
           
       } else {
       player1.setEditable(false);
       }
           
       
       if(e.getSource()==player2){
       player2.setEditable(true);
       txt2.setText(player2.getText().trim());
      result.setText("the symbol for "+player2.getText()+" is:  O");
       }else {
           player2.setEditable(false);
       }
       
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
     
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   label1.setText("choose symbol for "+player1.getText()+" :");
   result.setText("the symbol for "+player2.getText()+" is:  O");
   
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   txt1.setText(player1.getText().trim());
   txt2.setText(player2.getText().trim());
   pic1.setIcon(lab.getIcon());
       pic2.setIcon(lab2.getIcon());
   
    }

    @Override
    public void mouseExited(MouseEvent me) {
   player1.setEditable(false);
   player2.setEditable(false);
   
    }

    @Override
    public void mouseDragged(MouseEvent me) {
    
    }

    @Override
    public void mouseMoved(MouseEvent me) {
      
    }

    

}