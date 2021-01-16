import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
class mobile extends JFrame implements ActionListener
{
	int i=0,j=0,k=0,l=0,p=0,q=0,r=0,s=0;
	Container d;
	JLabel prd = new JLabel("Products");
	JLabel mdl = new JLabel(" Models");
	JLabel qty = new JLabel(" Quantity");
	JLabel smg = new JLabel("IPHONE");
	JLabel sny = new JLabel("MI");
	JLabel lg = new JLabel("OPPO");
	JLabel mi = new JLabel("SAMSUNG");
	JTextField tf1 =new JTextField("0");
	JTextField tf2 =new JTextField("0");
	JTextField tf3 =new JTextField("0");
	JTextField tf4 =new JTextField("0");
	JButton btn = new JButton("Continue");
	JLabel prc = new JLabel("Price");
	JLabel st = new JLabel("Sub Total");
	JTextField tf5 =new JTextField("0");
	JTextField tf6 =new JTextField("0");
	JTextField tf7 =new JTextField("0");
	JTextField tf8 =new JTextField("0");
	JTextField tf9 =new JTextField("0");
	JComboBox cmb1;JComboBox cmb2;JComboBox cmb3;JComboBox cmb4;
	static int ss3;

	mobile()
	{
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10,10,1200,700);
		setTitle("Mobile");
	
		d=this.getContentPane();
		d.setLayout(null);
		
		prd.setBounds(100,100,200,50);
		qty.setBounds(350,100,200,50);
		mdl.setBounds(650,100,200,50);
		prc.setBounds(950,100,200,50);
		smg.setBounds(100,175,150,50);
		sny.setBounds(100,275,150,50);
		lg.setBounds(100,375,150,50);
		mi.setBounds(100,475,150,50);
		tf1.setBounds(365,175,50,50);tf1.addActionListener(this);
		tf2.setBounds(365,275,50,50);tf2.addActionListener(this);
		tf3.setBounds(365,375,50,50);tf3.addActionListener(this);
		tf4.setBounds(365,475,50,50);tf4.addActionListener(this);
		tf5.setBounds(950,175,100,50);
		tf6.setBounds(950,275,100,50);
		tf7.setBounds(950,375,100,50);
		tf8.setBounds(950,475,100,50);
		tf9.setBounds(500,550,100,50);
		st.setBounds(400,550,150,50);

		btn.setBounds(925,550,150,50);
		btn.addActionListener(this);	
		
		Font f=new Font("Footlight MT Light",Font.BOLD,20);
		Font g=new Font("Footlight MT Light",Font.BOLD,30);
		
		String arr[]={"Select Item","IPHONE 8","IPHONE X"};
		cmb1 = new JComboBox(arr);cmb1.addActionListener(this);
		cmb1.setBounds(650,175,150,50);
				
		String arr2[]={"Select Item","NOTE 7pro","MIX 2"};
		cmb2 = new JComboBox(arr2);cmb2.addActionListener(this);
		cmb2.setBounds(650,275,150,50);
				
		String arr3[]={"Select Item","A5","F11 pro"};
		cmb3 = new JComboBox(arr3);cmb3.addActionListener(this);
		cmb3.setBounds(650,375,150,50);
				
		String arr4[]={"Select Item","A10","M40"};
		cmb4 = new JComboBox(arr4);cmb4.addActionListener(this);
		cmb4.setBounds(650,475,150,50);
		
		ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("backALL.jpg"));
		JLabel img = new JLabel(logo);
		img.setBounds(0,0,1200,671);
		validate();
				
		tf1.setEditable(true);tf2.setEditable(true);tf3.setEditable(true);tf4.setEditable(true);
		tf5.setEditable(true);tf6.setEditable(true);tf7.setEditable(true);tf8.setEditable(true);
		tf9.setEditable(true);
	
	
		prd.setFont(g);
		mdl.setFont(g);
		qty.setFont(g);
		smg.setFont(f);
		sny.setFont(f);
		lg.setFont(f);
		mi.setFont(f);
		st.setFont(f);
		prc.setFont(g);
				
		d.add(prd);
		d.add(mdl);
		d.add(qty);
		d.add(smg);
		d.add(sny);		
		d.add(lg);
		d.add(mi);
		d.add(prc);
		d.add(st);
		d.add(btn);
		d.add(tf1);
		d.add(tf2);
		d.add(tf3);
		d.add(tf4);
		d.add(tf5);
		d.add(tf6);
		d.add(tf7);
		d.add(tf8);
		d.add(tf9);
		d.add(cmb1);
		d.add(cmb2);
		d.add(cmb3);
		d.add(cmb4);
		d.add(img);
}
	 public void actionPerformed(ActionEvent event)
	{
		String s1=tf1.getText();
		i = Integer.parseInt(s1);
		String s2=tf2.getText();
		j = Integer.parseInt(s2);
		String s3=tf3.getText();
		k = Integer.parseInt(s3);
		String s4=tf4.getText();
		l = Integer.parseInt(s4);
		if(event.getSource()==cmb1||event.getSource()==tf1)
		{
		Object select1 = cmb1.getSelectedItem();
			if(select1.toString().equals("IPHONE 8"))
			{
				p = i*80000;		
				String result1 = String.valueOf(p);
				tf5.setText(result1);
			}
			else
				if(select1.toString().equals("IPHONE X"))
				{
				p = i*120000;		
				String result1 = String.valueOf(p);
				tf5.setText(result1);
				}
		}
		else if(event.getSource()==cmb2)
		{
		Object select2 = cmb2.getSelectedItem();
			if(select2.toString().equals("NOTE 7pro"))
			{
				q = j*14000;		
				String result2 = String.valueOf(q);
				tf6.setText(result2);
			}
			else
				if(select2.toString().equals("MIX 2"))
				{
				q = j*26000;		
				String result2 = String.valueOf(q);
				tf6.setText(result2);
				}
		}
		else if(event.getSource()==cmb3)
		{
		Object select3 = cmb3.getSelectedItem();
			if(select3.toString().equals("A5"))
			{
				r = k*15000;		
				String result3 = String.valueOf(r);
				tf7.setText(result3);
			}
			else
				if(select3.toString().equals("F11 pro"))
				{
				r = k*22000;		
				String result3 = String.valueOf(r);
				tf7.setText(result3);
				}
		}
		else if(event.getSource()==cmb4)
		{
		Object select4 = cmb4.getSelectedItem();
			if(select4.toString().equals("A10"))
			{
				s = l*28000;		
				String result4 = String.valueOf(s);
				tf8.setText(result4);
			}
			else
				if(select4.toString().equals("M40"))
				{
				s = l*32000;		
				String result4 = String.valueOf(s);
				tf8.setText(result4);
				}
		}
		ss3 = p+q+r+s;
		String result = String.valueOf(ss3);
		tf9.setText(result);
		if(event.getSource()==btn)
		{	
			new mainpage();
			this.dispose();
		}
	}
}
