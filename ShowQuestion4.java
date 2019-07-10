

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


 public class ShowQuestion4 extends JFrame{
  
    private Container c;
    private JLabel label1;
    private JRadioButton seven,eight,nine,ten;
    private ButtonGroup grp;
    private JButton btn1,btn2; 
 public Font f;
  private JTextArea ta1;
    ShowQuestion4()
    {
    initComponents();
    
    } 
     
    
     public void initComponents()
    {
     c = this.getContentPane();
     c.setBackground(Color.CYAN);
     c.setLayout(null);
     
     grp = new ButtonGroup();
     
     seven= new JRadioButton("8");
     seven.setBounds(320,200,50,50);
     seven.setBackground(Color.CYAN);
     c.add(seven);
     
     eight= new JRadioButton("10");
     eight.setBounds(320,250,50,50);
     eight.setBackground(Color.CYAN);
     c.add(eight);
     
     nine= new JRadioButton("12");
     nine.setBounds(320,300,50,50);
     nine.setBackground(Color.CYAN);
     c.add(nine);
     
     ten= new JRadioButton("13");
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
     label1.setText("What is the sequence number of busket ball?"); 
     c.add(label1);
     label1.setBounds(320,150,580,50);
     f= new Font("Arial",Font.ITALIC,20);
     label1.setFont(f);
     label1.setForeground(Color.BLUE);
     
       btn2 = new JButton("previous");
    btn2.setBounds(40, 580, 100, 30);
     c.add(btn2);
     
         btn1 = new JButton("Next");
    btn1.setBounds(820, 580, 100, 30);
     c.add(btn1);
     
           btn1.addActionListener(new ActionListener(){

       @Override
       public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()== btn1)
           {
           dispose();
           ShowQuestion5 frame = new ShowQuestion5();
           frame.setVisible(true);
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false mea
           
           }
       }
        
         
    
    });
           
                 btn2.addActionListener(new ActionListener(){

       @Override
       public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()== btn2)
           {
           dispose();
           ShowQuestion3 frame = new ShowQuestion3();
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
           if(ae.getSource() == seven )
           {
           
               ta1.append("your answer is right\n");
           
           }
            
           else{
           
               ta1.append("You have choosen wrong answer\n");
           
           } 
        }
     
     
     }
     
     
     public static void main(String[] args) {
      
       ShowQuestion2  frame = new ShowQuestion2();
       // JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false means fixed frame size
        
       
}
 }