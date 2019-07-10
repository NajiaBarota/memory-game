



import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ShowObject12 extends JFrame implements ActionListener{
    
    
      private Container c;
      // private JLabel label1;
       public Font f;
      private JButton btn1,btn2;
        private JLabel imgLabel;
       private ImageIcon icon;
       private JPanel panel1;
       private CardLayout card;
    //   private Image img;
ShowObject12()
{

initComponents();

}




public void initComponents()
    {
   c = this.getContentPane();
    c.setBackground(Color.DARK_GRAY);
     c.setLayout(null);
     
     //card = new CardLayout();
     
    icon = new ImageIcon(getClass().getResource("obj11.jpg")); 
    
   imgLabel =new JLabel(icon);
   imgLabel.setBounds(10,50,975,527);
   c.add(imgLabel);
   
   
    
    
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
           ShowObject13 frame = new ShowObject13();
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
           ShowObject11 frame = new ShowObject11();
           frame.setVisible(true);
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false mea
           
           }
       }
    
    
    });
           
    }          
    

    public static void main(String[] args) {
         ShowObject12 frame= new ShowObject12();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false means fixed frame size
        frame.setTitle("remember objects");
    

}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    

   
  
}