


import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ShowObject2 extends JFrame implements ActionListener{
    
    
      private Container c;

       public Font f;
      private JButton btn1;
        private JLabel imgLabel;
       private ImageIcon icon;
       //private JPanel panel1;
      // private CardLayout card;

ShowObject2()
{

initComponents();

}





public void initComponents()
    {
   c = this.getContentPane();
    c.setBackground(Color.DARK_GRAY);
     c.setLayout(null);
     
     //card = new CardLayout();
     
    icon = new ImageIcon(getClass().getResource("obj1.png")); 
    
   imgLabel =new JLabel(icon);
   imgLabel.setBounds(10,50,975,527);
   c.add(imgLabel);
   
         btn1 = new JButton("Next");
    btn1.setBounds(820, 580, 100, 30);
     c.add(btn1);
     
           btn1.addActionListener(new ActionListener(){

       @Override
       public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()== btn1)
           {
           dispose();
           ShowObject3 frame = new ShowObject3();
           frame.setVisible(true);
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false mea
           
           }
       }
    
    
    });
           
    }          
    
    public static void main(String[] args) {
         ShowObject2 frame= new ShowObject2();
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