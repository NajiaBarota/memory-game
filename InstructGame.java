



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


 public class InstructGame extends JFrame{
  
    private Container c;
    private JLabel label1;
     private JLabel label2;
    private JButton btn1;
     
 public Font f;
   InstructGame()
    {
    initComponents();
    
    } 
     
    
     public void initComponents()
    {
     c = this.getContentPane();
     c.setBackground(Color.CYAN);
     c.setLayout(null);
     
      btn1 = new JButton("back");
     btn1.setBounds(420, 350, 100, 50);
     c.add(btn1);
     
     label1=new JLabel();
     label1.setText("At first some pictures of different objects would be shown."); 
    // label1.setText("label1.setText");
     c.add(label1);
     label1.setBounds(250,250,580,50);
     f= new Font("Arial",Font.ITALIC,15);
     label1.setFont(f);
     label1.setForeground(Color.BLUE);
     
     
      label2=new JLabel();
     label2.setText(" then you have to remember the sequence number of objects and answer the questions"); 
    
     c.add(label2);
     label2.setBounds(250,270,580,50);
     f= new Font("Arial",Font.ITALIC,15);
     label2.setFont(f);
     label2.setForeground(Color.BLUE);
     
     
       btn1.addActionListener(new ActionListener(){

       @Override
       public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()== btn1)
           {
           dispose();
           MemoryQuest frame = new MemoryQuest();
           frame.setVisible(true);
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false mea
           
           }
       }
    
    
    });
    }
 
public static void main(String[] args) {
      
       InstructGame  frame = new InstructGame();
       // JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false means fixed frame size
        
       
        
    }

 }