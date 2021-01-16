import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class timer1 extends JFrame
{
	
		
	Container c;
	ActionListener action;
	JLabel l;
	ImageIcon ii1,ii2,ii3;
	Timer t;
	int count,i=0;
	public timer1()
	{
		count=1;
		c=getContentPane();
		c.setLayout(null);
		
		ii1 = new ImageIcon(getClass().getClassLoader().getResource("WEL.png"));
		ii2 = new ImageIcon(getClass().getClassLoader().getResource("WEL2.png"));
		ii3 = new ImageIcon(getClass().getClassLoader().getResource("WEL3.png"));

		l=new JLabel(ii1);
		l.setBounds(0,0,672,401);
		c.add(l);
		action=new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(count==1)
					l.setIcon(ii1);
				else if(count==2)
					l.setIcon(ii2);
				else if(count==3)
				{
					l.setIcon(ii3);					
				count=0;
				}	
				count++;i++;
			
				if(i==10)
				{
				new login();
				t.stop();
				dispose();
				}
				
			}			
			
		};
		setTitle("3SV");
                t=new Timer(300,action);
		t.start();
		
	}
}
class wel
{
	public static void main(String args[])
	{
	
		 timer1 pp= new timer1();
		pp.setBounds(200,100,685,415);
		pp.setVisible(true);
	}

}

