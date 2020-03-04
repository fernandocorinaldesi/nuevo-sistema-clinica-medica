package ar.com.clinicamedica.swingcustom;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import ar.com.clinicamedica.values.Fonts;

public class OtherButton extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	float alpha = 0.5f;

	  public OtherButton(String title,String path)
	  {
	    super(title);
	    setIcon(new ImageIcon(getClass().getResource(path)));
	    setFont(Fonts.SIDEPANEL);
	    setFocusPainted(false);
	    setBorderPainted(false);
	    setForeground(Color.white);
		setHorizontalAlignment(SwingConstants.LEFT);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    setContentAreaFilled(false);
	    addMouseListener(new ML());
	  }

	  public float getAlpha()
	  {
	    return alpha;
	  }

	  public void setAlpha(float alpha)
	  {
	    this.alpha = alpha;
	    repaint();
	  }

	  public void paintComponent(java.awt.Graphics g)
	  {
	    java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
	    g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
	    super.paintComponent(g2);
	  }

	  public class ML extends MouseAdapter
	  {
	    public void mouseExited(MouseEvent me)
	    {
	      new Thread(new Runnable()
	      {
	        public void run()
	        {
	          for (float i = 1f; i >= .5f; i -= .03f)
	          {
	            setAlpha(i);
	            try
	            {
	              Thread.sleep(10);
	            }
	            catch (Exception e)
	            {
	            }
	          }
	        }
	      }).start();
	    }

	    public void mouseEntered(MouseEvent me)
	    {
	      new Thread(new Runnable()
	      {
	        public void run()
	        {
	          for (float i = .5f; i <= 1f; i += .03f)
	          {
	            setAlpha(i);
	            try
	            {
	              Thread.sleep(10);
	            }
	            catch (Exception e)
	            {
	            }
	          }
	        }
	      }).start();
	    }

	    public void mousePressed(MouseEvent me)
	    {
	      new Thread(new Runnable()
	      {
	        public void run()
	        {
	          for (float i = 1f; i >= 0.6f; i -= .1f)
	          {
	            setAlpha(i);
	            try
	            {
	              Thread.sleep(1);
	            }
	            catch (Exception e)
	            {
	            }
	          }
	        }
	      }).start();
	    }
	  }

}
