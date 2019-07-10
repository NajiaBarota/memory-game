
//public class ShowQuestion {
    
//}
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


 public class ShowQuestion extends JFrame{
  
    private Container c;
    private JLabel label1;
    private JRadioButton seven,eight,nine,ten;
    private ButtonGroup grp;
    private JButton btn1; 
     public Font f;
     private JTextArea ta1;
     
    ShowQuestion()
    {
    initComponents();
    
    } 
     
    
     public void initComponents()
    {
     c = this.getContentPane();
     c.setBackground(Color.CYAN);
     c.setLayout(null);
     
     grp = new ButtonGroup();
     
     seven= new JRadioButton("7");
     seven.setBounds(320,200,50,50);
     seven.setBackground(Color.CYAN);
     c.add(seven);
     
     eight= new JRadioButton("8");
     eight.setBounds(320,250,50,50);
     eight.setBackground(Color.CYAN);
     c.add(eight);
     
     nine= new JRadioButton("9");
     nine.setBounds(320,300,50,50);
     nine.setBackground(Color.CYAN);
     c.add(nine);
     
     ten= new JRadioButton("10");
     ten.setBounds(320,350,50,50);
     ten.setBackground(Color.CYAN);
     c.add(ten);
     
     grp.add(seven);
     grp.add(eight);
     grp.add(nine);
     grp.add(ten);
     
    ta1 = new JTextArea();
     ta1.setBounds(400,250,230,130);
     ta1.setBackground(Color.white);
     c.add(ta1);
     

     
     label1=new JLabel();
     label1.setText("What is the sequence number of chess?"); 
     c.add(label1);
     label1.setBounds(320,150,580,50);
     f= new Font("Arial",Font.ITALIC,20);
     label1.setFont(f);
     label1.setForeground(Color.BLUE);
     
         btn1 = new JButton("Next");
    btn1.setBounds(820, 580, 100, 30);
     c.add(btn1);
     
     
      
 
         btn1.addActionListener(new ActionListener(){

       @Override
       public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()== btn1)
           {
           dispose();
           ShowQuestion2 frame = new ShowQuestion2();
           frame.setVisible(true);
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false mea
           
           }
       }
    
    
    });
         
       
         Handeler handeler = new Handeler();
         seven.addActionListener(handeler);
         eight.addActionListener(handeler);
         nine.addActionListener(handeler);
         ten.addActionListener(handeler);
         
         
    }      
        
 
     class Handeler implements ActionListener
     {

        @Override
        public void actionPerformed(ActionEvent ae) {
           if(ae.getSource() == nine )
           {
           
               ta1.append("your answer is right\n");
           
           }
            
           else{
           
               ta1.append("You have choosen wrong answer\n");
           
           } 
        }
     
     
     }
     
     
public static void main(String[] args) {
      
       ShowQuestion  frame = new ShowQuestion();
       // JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false means fixed frame size
        
       
}     
    }

 