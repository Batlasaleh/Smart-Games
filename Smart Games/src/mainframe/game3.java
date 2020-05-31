
package mainframe;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class game3 extends JFrame implements MouseListener{
    Icon pic1=new ImageIcon(getClass().getResource("a.jpg"));
 Icon ca1=new ImageIcon(getClass().getResource("j.jpg"));
 Icon ca2=new ImageIcon(getClass().getResource("o.jpg"));
 Icon ca3=new ImageIcon(getClass().getResource("q.jpg"));
 Icon ca4=new ImageIcon(getClass().getResource("s.jpg"));
 Icon ca5=new ImageIcon(getClass().getResource("v.jpg"));
 Icon ca6=new ImageIcon(getClass().getResource("z.jpg"));
 
 
 Icon pic55 = new ImageIcon(getClass().getResource("ori.gif"));

 
 static JButton picc1 ;
 static JButton picc2 ;
 static JButton picc3 ;
 static JButton picc4 ;
 static JButton picc5 ;
 static JButton picc6 ;
 static JButton picc7;
 static JButton picc8 ;
 static JButton picc9 ;
 static JButton picc10;
 static JButton picc11 ;
 static JButton picc12;
 
 public game3(){
    
        this.setSize(1100,700);        
        this.setTitle("Matching Game");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(3, 4));
        picc1 =new JButton(this.pic1);
        picc2 =new JButton(this.pic1);
        picc3 =new JButton(this.pic1);
        picc4 =new JButton(this.pic1);
        picc5 =new JButton(this.pic1);
        picc6 =new JButton(this.pic1);
        picc7 =new JButton(this.pic1);
        picc8 =new JButton(this.pic1);
        picc9 =new JButton(this.pic1);
        picc10 =new JButton(this.pic1);
        picc11 =new JButton(this.pic1);
        picc12 =new JButton(this.pic1);
       
            this.add(picc1);
            this.add(picc2);
            this.add(picc3);
            this.add(picc4);
            this.add(picc5);
            this.add(picc6);
            this.add(picc7);
            this.add(picc8);
            this.add(picc9);
            this.add(picc10);
            this.add(picc11);
            this.add(picc12);
          
            
            
            
            
            picc1.addMouseListener(this);
            picc2.addMouseListener(this);
            picc3.addMouseListener(this);
            picc4.addMouseListener(this);
            picc5.addMouseListener(this);
            picc6.addMouseListener(this);
            picc7.addMouseListener(this);
            picc8.addMouseListener(this);
            picc9.addMouseListener(this);
            picc10.addMouseListener(this);
            picc11.addMouseListener(this);
            picc12.addMouseListener(this);
            this.setVisible(true);
}
 private int previousOne = 0, x, count = 0;
   private JButton pre, now;
   private boolean flag = true;
   

    public void mouseClicked(MouseEvent e) {
        if(!flag || e.getSource() == pre) return;
        flag = false;
        
        now = (JButton)e.getSource();
       
       if(e.getSource()==picc1){
         picc1.setIcon(ca1);
         x = 1;
       }
        if(e.getSource()==picc2){
            picc2.setIcon(ca5);
            x = 5;
        }
        
        if(e.getSource()==picc3){
           picc3.setIcon(ca2); 
           x = 2;
        }
        
        if(e.getSource()==picc4){
            picc4.setIcon(ca6);
            x = 6;
        }
        
        if(e.getSource()==picc5){
            picc5.setIcon(ca3);
            x = 3;
        }
        
        if(e.getSource()==picc6){
           picc6.setIcon(ca3);
           x = 3;
       }
        
        if(e.getSource()==picc7){
            picc7.setIcon(ca4);
            x = 4;
        }
        if(e.getSource()==picc8){
            picc8.setIcon(ca1);
            x = 1;
        }
        
        if(e.getSource()==picc9){
            picc9.setIcon(ca4);
            x = 4;
        }
        
        if(e.getSource()==picc10){
            picc10.setIcon(ca5);
            x = 5;
        }
        
        if(e.getSource()==picc11){
            picc11.setIcon(ca6);
            x = 6;
        }
        if(e.getSource()==picc12){
            picc12.setIcon(ca2);
            x = 2;
        }
        
        
        if(previousOne != 0){
            new java.util.Timer().schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        if(previousOne != x){
                            pre.setIcon(pic1);
                            now.setIcon(pic1);
                            pre = null;
                        } else {
                            pre.setEnabled(false);
                            now.setEnabled(false);
                            count++;
                        }
                        flag = true;
                        previousOne = 0;
                        if(count == 6){
                            JOptionPane.showMessageDialog(rootPane, "Finally!!!, You Win!");
                           // if(JOptionPane.showConfirmDialog(null, "You Won!\nDo you want to play again?") == JOptionPane.OK_OPTION){
                                
                                
                                
                            }
                        }
                  //  }
                }, 
                500 
            );
            
        }
        else{
            new java.util.Timer().schedule( 
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        pre = now;
                        previousOne = x;
                        flag = true;
                    }
                }, 
                10 
            );
        }
        

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}





 

