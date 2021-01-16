import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

class mainpage extends JFrame implements ActionListener
{
	Container b;
	JRadioButton cb = new JRadioButton("Discount",false);
	JLabel msg =  new JLabel("Select Your Products");
	JLabel tv =  new JLabel("Television");
	JLabel rfg =  new JLabel("Refrigerator"); 
	JLabel mob =  new JLabel("Mobile");
	JTextField amt=  new JTextField();
	JButton select1 = new JButton("Select");
	JButton select2 = new JButton("Select");
	JButton select3 = new JButton("Select");
	JButton select4 = new JButton("Exit");
	JButton  total = new JButton("Total Price");
	static int sum=0; double d;
	mainpage()
	{
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10,10,1200,710);
		setTitle("Total Calculation");
		b = this.getContentPane();
		b.setLayout(null);
		msg.setBounds(350,115,700,40);

		tv.setBounds(300,250,400,40);
		rfg.setBounds(300,300,400,44);
		mob.setBounds(300,350,400,40);
		amt.setBounds(650,420,300,40);
		
		select1.setBounds(650,250,300,40);
		select1.addActionListener(this);
		
		select2.setBounds(650,300,300,40);
		select2.addActionListener(this);
	
		select3.setBounds(650,350,300,40);
		select3.addActionListener(this);
		
		cb.setBounds(300,470,300,50);
		cb.addActionListener(this);

		select4.setBounds(650,470,300,50);
		select4.addActionListener(this);
	
		total.setBounds(300,420,300,40);
		total.addActionListener(this);

		ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("backgrounds.jpg"));
		JLabel img = new JLabel(logo);
		img.setBounds(0,0,1200,671);
		validate();
		
		Font f1 = new Font("Footlight MT Light",Font.BOLD,50);
		Font f2 = new Font("Footlight MT Light",Font.PLAIN,40);
		Font f3 = new Font("Arial",Font.BOLD,40);
		msg.setFont(f1);
		rfg.setFont(f2);
		tv.setFont(f2);
		mob.setFont(f2);
		select1.setFont(f3);
		select2.setFont(f3);
		select3.setFont(f3);
		select4.setFont(f3);
		total.setFont(f3);
		cb.setFont(f3);
			
		b.add(cb);
		b.add(msg);
		b.add(tv);
		b.add(rfg);
		b.add(mob);
		b.add(select1);
		b.add(select2);
		b.add(select3);
		b.add(amt);
		b.add(total);
		b.add(select4);
		b.add(img);

	} 
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource()==select1)
		{
		 new television();
		 this.dispose();
		}
		if(event.getSource()==select2)
		{
		new refrigerator();
		this.dispose();
		}
		if(event.getSource()==select3)
		{
		new mobile();
		this.dispose();
		}
		if(event.getSource()==total)
		{
		sum = television.ss1+mobile.ss3+refrigerator.ss2;
		String s  = String.valueOf(sum);
		amt.setText(s);
		}
		if(event.getSource()==cb)
		{
			d =sum - sum*(0.10);
			String ss  = String.valueOf(d);
			amt.setText(ss);
				
		}
		if(event.getSource()==select4)
		{
		new thank();
		this.dispose();
		}
	}
 
}
