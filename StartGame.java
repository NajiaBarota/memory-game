


import jaco.mp3.player.MP3Player;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;


 public class StartGame extends JFrame{
  
    private Container c;
    private JLabel label1;
    private JButton btn1;
     public Font f;
     
      public static final String SONG ="F:\\01 - FAIRY TAIL Main Theme.mp3";
   MP3Player obj1 = new MP3Player (new File(SONG));
     
    StartGame()
    {
    initComponents();
    
    } 
     
    
     public void initComponents()
    {
     c = this.getContentPane();
     c.setBackground(Color.CYAN);
     c.setLayout(null);
     
      btn1 = new JButton("start");
     btn1.setBounds(420, 350, 100, 50);
     c.add(btn1);
     
     label1=new JLabel();
     label1.setText("Lets start the game"); 
     c.add(label1);
     label1.setBounds(320,250,580,50);
     f= new Font("Arial",Font.ITALIC,30);
     label1.setFont(f);
     label1.setForeground(Color.BLUE);
     
     
       btn1.addActionListener(new ActionListener(){

       @Override
       public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()== btn1)
           { 
               obj1.stop();
           dispose();
           ShowQuestion frame = new ShowQuestion();
           frame.setVisible(true);
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false mea
            
           }
       }
    
    
    });
       
       
   /*     btn1.addActionListener(new ActionListener(){

       @Override
       public void actionPerformed(java.awt.event.ActionEvent ae) {
           if(ae.getSource()== btn1)
           {
           mp3player.stop();
           
           }
       }
    
    
    });*/
       
       
       
    }
 
public static void main(String[] args) {
      
       StartGame  frame = new StartGame();
       // JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false means fixed frame size
        
       
        
    }

 }