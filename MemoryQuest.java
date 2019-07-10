
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MemoryQuest extends JFrame {
  
    
      private Container c;
       private JLabel label1;
       public Font f;
      private JButton btn1;
       private JButton btn2;
        private JButton btn3,btn4;
    public static final String SONG ="F:\\song1.mp3";
   MP3Player mp3player = new MP3Player (new File(SONG));
    MemoryQuest()
    {
        
    initComponents();
    
    }
    
     public void initComponents()
    {
   c = this.getContentPane();
    c.setBackground(Color.CYAN);
     c.setLayout(null);
     label1=new JLabel();
     label1.setText("MEMORY QUEST"); 
     c.add(label1);
     label1.setBounds(420,50,180,50);
     f= new Font("Arial",Font.ITALIC,20);
     label1.setFont(f);
     label1.setForeground(Color.BLUE);

     
      btn1 = new JButton("Play");
     btn1.setBounds(420, 120, 100, 50);
     c.add(btn1);
    // ShowObject1 frame1 = new ShowObject1();
    // frame1.setVisible(true);
     btn2 = new JButton("Score");
    btn2.setBounds(420, 190, 100, 50);
     c.add(btn2);
      btn3 = new JButton("Settings");
     btn3.setBounds(420, 260, 100, 50);
     c.add(btn3);
     btn4 = new JButton("How to Play");
     btn4.setBounds(420, 330, 100, 50);
     c.add(btn4);
     
     
     
   btn1.addActionListener(new ActionListener(){

       @Override
       public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()== btn1)
           {
               
                mp3player.play();
           dispose();
           ShowObject2 frame = new ShowObject2();
           frame.setVisible(true);
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false mea
           
           }
       }
    
    
    });
    
   
    btn4.addActionListener(new ActionListener(){

       @Override
       public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()== btn4)
           {
           dispose();
        InstructGame frame = new InstructGame();
           frame.setVisible(true);
           
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false mea
           
           }
       }
    
    
    }); 
    
    }
    
     
   

   
 

    
     
     
    
     public static void main(String[] args) {
        
       MemoryQuest   frame = new MemoryQuest();
       // JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 30, 1000, 650);
        frame.setResizable(false);//false means fixed frame size
        frame.setTitle("Welcome to our game");
        
        
        
    }
    
}
