

import java.awt.*; 
import java.awt.event.*;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;

public class ClockTester {
	
	public static void main (String[] args)
	{	 
		JFrame frame = new JFrame("Clock"); 
		GregorianCalendar Today = new GregorianCalendar();
		
		
		ClockIcon Clock = new ClockIcon(0,0,500,
				Today.get(Today.HOUR_OF_DAY),
				Today.get(Today.MINUTE),
				Today.get(Today.SECOND)); //Initial clock declaration. 
		
		JLabel label = new JLabel(Clock);
		
		ActionListener listener = new
		         ActionListener()
		         {
		            public void actionPerformed(ActionEvent event)
		            {
		            	GregorianCalendar Now = new GregorianCalendar();
		            	Clock.setHour(Now.get(Now.HOUR_OF_DAY));
		            	Clock.setMinute(Now.get(Now.MINUTE));
		            	Clock.setSecond(Now.get(Now.SECOND));
		        		label.repaint();
		            }
		         };
		      final int DELAY = 1000;
		         // Milliseconds between timer ticks
		      Timer t = new Timer(DELAY, listener);
		      t.start();
		
		frame.setLayout(new FlowLayout());
	    
		frame.add(label);
	    
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true); 
	    
	   
	    
	    
	}

} 
