import java.awt.Image;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import java.awt.Container;  
import javax.swing.GroupLayout;  

   public class Window  {
   
    
    
    
    
	static void Settings(ActionEvent b2s ) {
		JFrame frame = new JFrame("Settings");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Container contentPanel = frame.getContentPane();  
        GroupLayout groupLayout = new GroupLayout(contentPanel);  
  
        contentPanel.setLayout(groupLayout);  
  
        JLabel l1 = new JLabel("Auto-Connect");  
        JCheckBox sb1 = new JCheckBox(); 
        JLabel l2 = new JLabel("Advanced Mode");
        JCheckBox sb2 = new JCheckBox();
  
        groupLayout.setHorizontalGroup(  
                    groupLayout.createSequentialGroup()  
                                .addComponent(l1)  
                                .addGap(10, 20, 100)  
                                .addComponent(sb1)
                               
                                .addComponent(l2)
                                .addGap(10, 20, 100)
                                .addComponent(sb2));
        
        groupLayout.setVerticalGroup(  
                     groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                                .addComponent(l1)  
                                .addComponent(sb1)
                                .addGap(100, 100, 100)
                                .addComponent(l2)
                                .addComponent(sb2)); 
                                
        frame.setSize(200,200);
        frame.pack();  
        frame.setVisible(true);  
    }  
     static void Setup() {
    	 
 		JFrame frame = new JFrame("A.R.C.S");
 		JButton b1 = new JButton("Connect");
 		JButton b2 = new JButton("Settings");
 		JMenuBar menuBar = new JMenuBar(); 
 		JMenu NavMenu = new JMenu("Menu"); 
 		JMenuItem Connect = new JMenuItem("Connect"); 
 		JMenuItem Settings = new JMenuItem("Settings"); 
 		JMenuItem Exit = new JMenuItem("Exit");
 		frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
 		  
 	
 		
 	      NavMenu.add(Connect); 
 		  NavMenu.add(Settings); 
 	      NavMenu.addSeparator(); 
 		  NavMenu.add(Exit);
 		  NavMenu.setLayout(new FlowLayout(FlowLayout.LEFT));
 		
 		 frame.add(b2);
 		 frame.add(b1);
 		 frame.add(NavMenu);
 		 
 		 b2.addActionListener(b2s -> Settings(null));
 		 b1.addActionListener(null);
 		 
 		 frame.setSize(1982, 1080);  
 	     frame.setLocationRelativeTo(null);  
 	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
 	     frame.setVisible(true);
 	     
 	     Image icon = Toolkit.getDefaultToolkit().getImage("/Window/src/8000720F-2C87-43FA-B8C7-4F7C113AE3DE.PNG");    
          frame.setIconImage(icon);    
         	        	
          
     }
    
	public static void main(String[] args) {
		

		Setup();
		

		
	   

	     }	
	        
	            
	          

     }     
    

