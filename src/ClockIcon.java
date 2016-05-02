import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

import java.math.*;

public class ClockIcon implements Icon {
	
	
	private int width, height, diameter, hours, minutes, seconds;
	
	private int CLOCK_CENTER;
	 
	
	public ClockIcon(int x, int y, int diameter2, int currenthours, int currentminutes, int currentseconds) 
		{
			width = x;
			height = y; 
			diameter = diameter2; 
			hours = currenthours;
			minutes = currentminutes;
			seconds = currentseconds; 
			  
	    }
		
	public int getIconHeight() 
		{
			return diameter;
		}

		
	public int getIconWidth()
		{
			return diameter; 
		}
	
	public void setHour(int newhour)
	{
		hours = newhour; 
	}
	
	public void setMinute(int newminute)
	{
		minutes = newminute; 
	} 
	
	public void setSecond(int newsecond)
	{
		seconds = newsecond; 
	}

	public void paintIcon(Component c, Graphics g, int x, int y)
	{
		Graphics2D g2 = (Graphics2D) g;
		draw(g2);    
	}
	
	public void draw(Graphics2D g2)
		{
			CLOCK_CENTER = diameter/2; 
			
			int Xsec = (int) (Math.cos(seconds * Math.PI / 30 - Math.PI / 2) * 200 + CLOCK_CENTER);
			int Ysec = (int) (Math.sin(seconds * Math.PI / 30 - Math.PI / 2) * 200 + CLOCK_CENTER); //Seconds coordinates
			
			int Xmin = (int) (Math.cos(minutes * Math.PI / 30 - Math.PI / 2) * 180 + CLOCK_CENTER);
			int Ymin = (int) (Math.sin(minutes * Math.PI / 30 - Math.PI / 2) * 180 + CLOCK_CENTER);//Minutes coordinates
			
			int Xhour =(int) (Math.cos((hours * 30 + minutes / 2) * Math.PI / 180 - Math.PI / 2) * 160 + CLOCK_CENTER);
			int Yhour =(int) (Math.sin((hours * 30 + minutes / 2) * Math.PI / 180 - Math.PI / 2) * 160 + CLOCK_CENTER);//Hours coordinates 
			
			Ellipse2D.Double TheClock = new Ellipse2D.Double(width,height,diameter,diameter);
			g2.draw(TheClock);
			
			
			g2.setColor(Color.red);
			g2.drawLine(CLOCK_CENTER, CLOCK_CENTER, Xsec, Ysec); //Seconds
			
			g2.setColor(Color.blue);
			g2.drawLine(CLOCK_CENTER, CLOCK_CENTER, Xmin, Ymin); //Minutes 
			
			g2.setColor(Color.black);
			g2.drawLine(CLOCK_CENTER, CLOCK_CENTER, Xhour, Yhour); //Hours 
			 
		}
}


