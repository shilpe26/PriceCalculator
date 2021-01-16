import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


class login extends JFrame implements ActionListener
{
	Container c;
	JLabel userlabel=new JLabel("Username");
	JLabel passlabel=new JLabel("Password");
	JLabel logolabel=new JLabel("  Login");
	JTextField user_tf=new JTextField();
	JPasswordField pass_pf=new JPasswordField();
	JButton login_btn=new JButton("Login");
	JButton Reset_btn=new JButton("Reset");
	JButton Exit_btn=new JButton("Exit");
	login()
	{	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Login Page");
		setBounds(10,10,1200,690);
		ImageIcon icon =new ImageIcon("3sv.jpg");
		setIconImage(icon.getImage());

		c=this.getContentPane();
		c.setLayout(null);
					
		userlabel.setBounds(430,265,200,40);
		passlabel.setBounds(430,365,200,40);
		logolabel.setBounds(480,145,200,60);


		login_btn.setBounds(660,510,100,50);
		login_btn.addActionListener(this);
		
		Reset_btn.setBounds(550,510,100,50);
		Reset_btn.addActionListener(this);

		Exit_btn.setBounds(440,510,100,50);
		Exit_btn.addActionListener(this);

		Font f1=new Font("Footlight MT Light",Font.BOLD,60);
		Font f2=new Font("Footlight MT Light",Font.PLAIN,28);

		userlabel.setFont(f2);
		passlabel.setFont(f2);
		logolabel.setFont(f1);
		
		user_tf.setBounds(610,265,150,40);
		pass_pf.setBounds(610,365,150,40);

		
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("login_background.jpg"));
		JLabel login=new JLabel(icon1);
		login.setBounds(0,0,1200,671);
		validate();
		
		
		c.add(userlabel);
		c.add(passlabel);
		c.add(logolabel);
		c.add(user_tf);
		c.add(pass_pf);
		c.add(login_btn);
		c.add(Reset_btn);
		c.add(Exit_btn);
		c.add(login);


	user_tf.addKeyListener(new KeyAdapter()
	{
		public void keyPressed(KeyEvent e)
		{
		if(e.getKeyCode()==10)
		pass_pf.requestFocus();
		}
	});		
}
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource()==login_btn)
		{
			String username=user_tf.getText();
			String password = pass_pf.getText();
			if(username.equals("user")&&password.equals("1234"))
			{
				new mainpage();	
				this.dispose();
			}	
			else
			{
				 JOptionPane.showMessageDialog(null,"Invalid entries");
			}	
		}
		if(event.getSource()==Exit_btn)
			System.exit(0);
		if(event.getSource()==Reset_btn)
			{
				user_tf.setText(null);
				pass_pf.setText(null);
			}
		
	}

		
}
